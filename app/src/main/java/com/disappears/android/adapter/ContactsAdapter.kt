package com.disappears.android.adapter

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Telephony
import android.text.TextUtils
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.disappears.android.R
import com.disappears.android.flow.chats.messages.MessageListActivity
import com.disappears.android.flow.contacts.list.ContactsDiffUtilCallback
import com.disappears.android.model.Contact
import com.disappears.android.model.ContactFeedItem
import com.disappears.android.model.HeaderItem
import com.disappears.android.model.response.Friend
import com.disappears.android.util.SharedPrefUtil
import com.disappears.android.util.loadImage
import com.makeramen.roundedimageview.RoundedImageView
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.item_contact.view.*
import kotlinx.android.synthetic.main.item_header.view.*
import java.util.concurrent.TimeUnit

class ContactsAdapter(private val context: Context,
                      private val prefUtil: SharedPrefUtil,
                      private var data: List<ContactFeedItem> = emptyList(),
                      private val canSelect: Boolean,
                      private val contactsAdapterListener: ContactsAdapterListener?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val selectedItems = SparseBooleanArray()
    private var selectionOn = false
    private var recyclerView: RecyclerView? = null
    var onSelectionToggle: ((Int) -> Unit)? = null

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        this.recyclerView = null
    }

    interface ContactsAdapterListener {
        fun acceptFriend(f: Friend)
        fun rejectFriend(f: Friend)
        fun cancelInvite(friend: Friend)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_HEADER -> HeaderViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_header, parent, false))
            else -> ContactViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_contact, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = data[position]
        when (holder.itemViewType) {
            VIEW_TYPE_HEADER -> (holder as HeaderViewHolder).update(model)
            VIEW_TYPE_FRIEND, VIEW_TYPE_CONTACT -> (holder as ContactViewHolder).update(position, model)
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = data[position]
        return when (item) {
            is HeaderItem -> VIEW_TYPE_HEADER
            is Friend -> VIEW_TYPE_FRIEND
            else -> VIEW_TYPE_CONTACT
        }
    }

    override fun getItemCount() = data.size

    @SuppressLint("CheckResult")
    fun update(contacts: List<ContactFeedItem>) {
        if (data.isEmpty()) {
            data = contacts
            notifyDataSetChanged()
        } else {
            Single.fromCallable { DiffUtil.calculateDiff(ContactsDiffUtilCallback(data, contacts)) }
                    .subscribeOn(Schedulers.computation())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { result ->
                        recyclerView?.let {
                            data = contacts
                            notifyDataSetChanged()
                            result.dispatchUpdatesTo(updateCallback)
                        }
                    }
        }
    }

    private val updateCallback = ContactListUpdateCallback()

    inner class ContactListUpdateCallback : ListUpdateCallback {
        private val insertedPositionSubject = PublishSubject.create<Int>().apply {
            debounce(500, TimeUnit.MILLISECONDS)
            subscribe { recyclerView?.layoutManager?.scrollToPosition(it) }
        }

        override fun onInserted(position: Int, count: Int) {
            insertedPositionSubject.onNext(position)
            notifyItemRangeInserted(position, count)
        }

        override fun onRemoved(position: Int, count: Int) {
            notifyItemRangeRemoved(position, count)
        }

        override fun onMoved(fromPosition: Int, toPosition: Int) {
            notifyItemMoved(fromPosition, toPosition)
        }

        override fun onChanged(position: Int, count: Int, payload: Any?) {
            notifyItemRangeChanged(position, count, payload)
        }
    }

    fun toggleSelection(pos: Int) {
        if (selectedItems.get(pos, false)) {
            selectedItems.delete(pos)
        } else {
            selectedItems.put(pos, true)
        }
        notifyItemChanged(pos)
        onSelectionToggle?.invoke(selectedItems.size())
    }

    fun getSelectedItems(): List<ContactFeedItem> {
        return (0 until selectedItems.size()).map { data[selectedItems.keyAt(it)] }
    }

    internal inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var content: View = itemView.contactContent
        var imageView: RoundedImageView = itemView.profilePicture
        var name: TextView = itemView.name
        var reject: TextView = itemView.reject
        var pending: TextView = itemView.cancel
        var accept: TextView = itemView.accept

        private var model: ContactFeedItem? = null
        private var pos: Int = 0

        init {
            content.setOnClickListener { itemClick() }
            content.setOnLongClickListener { itemLongClick() }
            accept.setOnClickListener { acceptFriend() }
            reject.setOnClickListener { rejectFriend() }
            pending.setOnClickListener { cancelInvite() }
        }

        fun update(position: Int, c: ContactFeedItem) {
            model = c
            this.pos = position
            name.text = c.name
            if (!TextUtils.isEmpty(c.photo)) {
                c.photo?.let { imageView.loadImage(it) }
            } else {
                imageView.setImageBitmap(null)
            }
            handleSelection(position)
            if (c is Friend) {
                c.profile?.let {
                    if (!c.profile.name.isNullOrEmpty()) {
                        name.text = c.profile.name
                    }
                }
                if (c.isInvited) {
                    pending.visibility = View.VISIBLE
                    reject.visibility = View.GONE
                    accept.visibility = View.GONE
                } else if (c.isInviter) {
                    reject.visibility = View.VISIBLE
                    accept.visibility = View.VISIBLE
                    pending.visibility = View.GONE
                } else {
                    pending.visibility = View.GONE
                    reject.visibility = View.GONE
                    accept.visibility = View.GONE
                }
            } else {
                reject.visibility = View.GONE
                accept.visibility = View.GONE
                pending.visibility = View.GONE
            }
        }

        private fun handleSelection(position: Int) {
            if (selectedItems.get(position, false)) {
                content.setBackgroundColor(ContextCompat.getColor(context, R.color.lightGreen))
            } else {
                content.setBackgroundColor(0)
            }
        }

        fun itemClick() {
            if (canSelect || selectionOn) {
                toggleSelection(pos)
            } else if (model is Contact) {
                sendSms(context,
                        "Add me on Vanish Messenger! Tap here 👉 https://disappears.com/download to chat. My name is " + prefUtil.currentLoggedUser,
                        (model as Contact).contactPhonesAsList)
            } else if (model is Friend && (model as Friend).isFriend) {
                MessageListActivity.start(context, model as Friend)
            }
        }

        fun sendSms(context: Context, text: String, numbers: List<String>) {
            val numbersStr = TextUtils.join(",", numbers)
            val uri = Uri.parse("sms:" + numbersStr)
            val intent = Intent()
            intent.data = uri
            intent.putExtra(Intent.EXTRA_TEXT, text)
            intent.putExtra("sms_body", text)
            intent.putExtra("address", numbersStr)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                intent.action = Intent.ACTION_SENDTO
                val defaultSmsPackageName = Telephony.Sms.getDefaultSmsPackage(context)
                if (defaultSmsPackageName != null) {
                    intent.`package` = defaultSmsPackageName
                }
            } else {
                intent.action = Intent.ACTION_VIEW
                intent.type = "vnd.android-dir/mms-sms"
            }

            try {
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }

        fun itemLongClick(): Boolean {
            if (canSelect && !selectionOn) {
                selectionOn = true
                toggleSelection(pos)
                return true
            }
            return false
        }

        fun acceptFriend() {
            val friend = model as Friend
            contactsAdapterListener?.acceptFriend(friend)
        }

        fun rejectFriend() {
            val friend = model as Friend
            contactsAdapterListener?.rejectFriend(friend)
        }

        fun cancelInvite() {
            val friend = model as Friend
            contactsAdapterListener?.cancelInvite(friend)
        }
    }

    internal inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView? = itemView.title

        fun update(c: ContactFeedItem) {
            title!!.text = c.name
        }
    }

    companion object {
        val VIEW_TYPE_HEADER = 0
        val VIEW_TYPE_FRIEND = 1
        val VIEW_TYPE_CONTACT = 2
    }
}
