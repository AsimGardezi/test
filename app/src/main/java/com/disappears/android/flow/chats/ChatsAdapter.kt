package com.disappears.android.flow.chats

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.disappears.android.R
import com.disappears.android.adapter.BaseAdapter
import com.disappears.android.model.Chat
import com.disappears.android.util.loadImage
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_chat.*
import java.util.concurrent.TimeUnit

class ChatsAdapter : BaseAdapter<Chat, ChatsAdapter.ViewHolder>() {
    var onChatClickListener: ((Chat) -> Unit)? = null

    override var dataSource: List<Chat> = listOf()
        set(value) {
            if (field.isEmpty()) {
                field = value
                notifyDataSetChanged()
            } else {
                Single.fromCallable { DiffUtil.calculateDiff(ChatsDiffUtilCallback(field, value)) }
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSuccess { field = value }
                        .subscribe({ result -> recyclerView?.let { result.dispatchUpdatesTo(updateCallback) } })
            }
        }

    private val updateCallback = UpdateCallback()

    inner class UpdateCallback : ListUpdateCallback {
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

    override fun onItemClick(data: Chat) {
        super.onItemClick(data)
        onChatClickListener?.invoke(data)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        payloads.firstOrNull()?.let {
            if (it is Set<*> && it.isNotEmpty()) {
                val item = getItem(position)
                if (it.contains(Chat::lastMessageTimeStamp.name)) {
                    holder.date?.text = item.lastMessageTimeStamp
                }
                if (it.contains(Chat::name.name)) {
                    holder.name?.text = item.name
                }
                if (it.contains(Chat::unreadCount.name)) {
                    holder.unreadIndicator?.visibility = if (item.unreadCount > 0) View.VISIBLE else View.INVISIBLE
                    holder.unreadIndicator?.text = item.unreadCount.toString()
                }
                if (it.contains(Chat::lastMessage.name)) {
                    holder.lastMessage?.text = item.lastMessage
                }
                if (it.contains(Chat::imageUrl.name)) {
                    item.imageUrl?.let { holder.profilePicture?.loadImage(it) }
                }
                if (it.contains(Chat::friend.name)) {
                    item.imageUrl?.let { holder.profilePicture?.loadImage(it) }
                }
            } else {
                super.onBindViewHolder(holder, position, payloads)
            }
        } ?: super.onBindViewHolder(holder, position, payloads)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.chat = getItem(position)
    }

    override fun getItemViewId() = R.layout.item_chat
    override fun instantiateViewHolder(view: View?) = ViewHolder(view)

    class ViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView!!), LayoutContainer {
        var chat: Chat? = null
            set(value) {
                field = value
                if (value == null) return

                name.text = value.name
                lastMessage.text = value.lastMessage
                unreadIndicator.visibility = if (value.unreadCount > 0) View.VISIBLE else View.INVISIBLE
                unreadIndicator.text = value.unreadCount.toString()
                date.text = value.lastMessageTimeStamp
                value.imageUrl?.let { profilePicture.loadImage(it) }
            }
    }
}
