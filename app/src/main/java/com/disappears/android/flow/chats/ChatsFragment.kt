package com.disappears.android.flow.chats

import android.os.Bundle
import android.view.View
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.flow.chats.messages.MessageListActivity
import com.disappears.android.model.Chat
import kotlinx.android.synthetic.main.fragment_chats.*
import timber.log.Timber

class ChatsFragment : BasePresenterFragment<ChatsContract.Presenter>(ChatsContract.Presenter::class), ChatsContract.View {
    override val layoutResourceId = R.layout.fragment_chats
    private val adapter = ChatsAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chats.adapter = adapter
        adapter.onChatClickListener = {
            it.friend?.let { friend ->
                MessageListActivity.start(view.context, friend)
            } ?: Timber.e("item_chat == null")
        }
    }

    override fun render(result: List<Chat>) {
        adapter.dataSource = result
    }

    companion object {
        fun newInstance() = ChatsFragment()
    }
}
