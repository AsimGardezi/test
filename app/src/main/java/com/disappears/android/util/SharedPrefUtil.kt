package com.disappears.android.util

import android.content.SharedPreferences
import android.text.TextUtils
import com.disappears.android.model.response.Profile
import com.google.gson.Gson

class SharedPrefUtil constructor(
        private val prefs: SharedPreferences,
        private val gson: Gson
) {
    var currentLoggedUser: String?
        get() = prefs.getString(PREF_CURRENT_LOGGED_USER, null)
        set(username) = prefs.edit().putString(PREF_CURRENT_LOGGED_USER, username).apply()

    var controlId: String
        get() = prefs.getString(PREF_CONTROL_ID, "0")!!
        set(userControlId) = prefs.edit().putString(PREF_CONTROL_ID, userControlId).apply()

    var currentUserProfile: Profile?
        get() {
            val profileJson = prefs.getString(PREF_CURRENT_LOGGED_PROFILE, "")
            return if (!TextUtils.isEmpty(profileJson)) {
                gson.fromJson(profileJson, Profile::class.java)
            } else null
        }
        set(body) {
            prefs.edit().putString(PREF_CURRENT_LOGGED_PROFILE, gson.toJson(body)).apply()
        }

    fun logOut() {
        prefs.edit().remove(PREF_CURRENT_LOGGED_USER).remove(PREF_CURRENT_LOGGED_PROFILE).remove("enableDisableTouchId").apply()
    }

    fun isFirstTime(username: String): Boolean {
        return !prefs.contains(PREF_FIRST_TIME + username)
    }

    fun markFirstLogin(username: String) {
        prefs.edit().putBoolean(PREF_FIRST_TIME + username, true).apply()
    }

    companion object {
        private const val PREF_CURRENT_LOGGED_USER = "current_user"
        private const val PREF_FIRST_TIME = "first_time_"
        private const val PREF_CONTROL_ID = "control_id"
        private const val PREF_CURRENT_LOGGED_PROFILE = "current_user_profile"
    }
}
