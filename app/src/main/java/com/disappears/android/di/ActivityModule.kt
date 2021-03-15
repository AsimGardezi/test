package com.disappears.android.di

import com.disappears.android.base.BasePresenter
import com.disappears.android.flow.chats.ChatsContract
import com.disappears.android.flow.chats.ChatsPresenter
import com.disappears.android.flow.chats.messages.MessageListContract
import com.disappears.android.flow.chats.messages.MessageListPresenter
import com.disappears.android.flow.contacts.details.ContactDetailsContract
import com.disappears.android.flow.contacts.details.ContactDetailsPresenter
import com.disappears.android.flow.contacts.pick.PickContactContract
import com.disappears.android.flow.contacts.pick.PickContactPresenter
import com.disappears.android.flow.contacts.search.SearchFriendPresenter
import com.disappears.android.flow.contacts.search.SearchFriendsContract
import com.disappears.android.flow.dashboard.DashboardContract
import com.disappears.android.flow.dashboard.DashboardPresenter
import com.disappears.android.flow.fingerprint.ThumbVerification
import com.disappears.android.flow.profile.SetUpProfileContract
import com.disappears.android.flow.profile.SetUpProfilePresenter
import com.disappears.android.flow.settings.SettingsContract
import com.disappears.android.flow.settings.SettingsPresenter
import com.disappears.android.flow.signin.LoginContract
import com.disappears.android.flow.signin.LoginPresenter
import com.disappears.android.flow.signup.password.SignUpPasswordContract
import com.disappears.android.flow.signup.password.SignUpPasswordPresenter
import com.disappears.android.flow.signup.username.SignUpUsernameContract
import com.disappears.android.flow.signup.username.SignUpUsernamePresenter
import com.tbruyelle.rxpermissions2.RxPermissions
import org.koin.android.architecture.ext.getViewModel
import org.koin.dsl.module.applicationContext

object ActivityModule {
    const val PARAM_ACTIVITY = "activity"

    fun getModule() = applicationContext {
        factory { params -> RxPermissions(params[PARAM_ACTIVITY]) }
        factory(SignUpUsernameContract.Presenter::class.qualifiedName!!) { SignUpUsernamePresenter(get()) } bind BasePresenter::class
        factory(SignUpPasswordContract.Presenter::class.qualifiedName!!) { SignUpPasswordPresenter(get(), get(), get()) } bind BasePresenter::class
        factory(LoginContract.Presenter::class.qualifiedName!!) { LoginPresenter(get(), get(), get()) } bind BasePresenter::class
        factory(SettingsContract.Presenter::class.qualifiedName!!) { SettingsPresenter(get(), get(), get(), get()) } bind BasePresenter::class
        factory(SearchFriendsContract.Presenter::class.qualifiedName!!) { SearchFriendPresenter(get(), get(), get(), get()) } bind BasePresenter::class
        factory(SetUpProfileContract.Presenter::class.qualifiedName!!) { SetUpProfilePresenter(get(), get(), get(), get(), get()) } bind BasePresenter::class
        factory(DashboardContract.Presenter::class.qualifiedName!!) { DashboardPresenter(get(), get(), get()) } bind BasePresenter::class
        factory(ChatsContract.Presenter::class.qualifiedName!!) { ChatsPresenter(get(), get(), get(), get()) } bind BasePresenter::class
        factory(MessageListContract.Presenter::class.qualifiedName!!) { MessageListPresenter(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get()) } bind BasePresenter::class
        factory(PickContactContract.Presenter::class.qualifiedName!!) { PickContactPresenter(get()) } bind BasePresenter::class
        factory(ContactDetailsContract.Presenter::class.qualifiedName!!) { ContactDetailsPresenter(get()) } bind BasePresenter::class
    }
}