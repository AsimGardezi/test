package com.disappears.android.adapter

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.util.TypedValue
import android.view.View
import com.disappears.android.R
import com.disappears.android.model.response.Friend
import com.disappears.android.model.response.Profile
import com.disappears.android.util.loadImage
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_friend_search.*
import timber.log.Timber

class SearchFriendAdapter : BaseAdapter<Profile, SearchFriendAdapter.ViewHolder>() {
    override fun getItemViewId() = R.layout.item_friend_search

    override fun instantiateViewHolder(view: View?) = ViewHolder(view)

    var onAddClickListener: ((Profile) -> Unit)? = null

    private val onAddItemClickListener = View.OnClickListener {
        recyclerView?.findContainingItemView(it)?.let {
            recyclerView?.findContainingViewHolder(it)?.adapterPosition?.let {
                onAddClickListener?.invoke(dataSource[it])
            } ?: Timber.e("can't find adapter position")
        } ?: Timber.e("can't find item view")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.profile = getItem(position)
        holder.add?.setOnClickListener(onAddItemClickListener)
    }

    class ViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView!!), LayoutContainer {
        var profile: Profile? = null
            set(value) {
                field = value
                name?.text = value?.name

                if (Friend.Flag.INVITED.value == value?.flags) {
                    add?.text = add?.context?.resources?.getString(R.string.cancel_invite)
                    add?.setAllCaps(false)
                    add?.context?.let {
                        add.setTextColor(ContextCompat.getColor(it, R.color.lightGray))
                        add.setTextSize(TypedValue.COMPLEX_UNIT_PX, it.resources.getDimension(R.dimen.font_16))
                    }
                } else {
                    add?.text = add?.context?.resources?.getString(R.string.add)
                    add?.setAllCaps(true)
                    add?.context?.let {
                        add.setTextColor(ContextCompat.getColor(it, R.color.lightGreen))
                        add.setTextSize(TypedValue.COMPLEX_UNIT_PX, it.resources.getDimension(R.dimen.font_18))
                    }
                }

                value?.imageUrl?.let {
                    if (it.isNotEmpty()) {
                        profilePicture?.loadImage(it)
                    } else {
                        profilePicture.setImageDrawable(null)
                    }
                } ?: profilePicture.setImageDrawable(null)
            }
    }
}
