package com.disappears.android.util

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R

/**
 * Created by ihor_kucherenko on 12/7/17.
 * https://github.com/KucherenkoIhor
 */

fun AppCompatActivity.addFragment(
        fragment: Fragment,
        @IdRes containerId: Int = R.id.fragmentContent,
        backStackTag: String? = null) {
    fragmentTransaction({ it.add(containerId, fragment) }, backStackTag)
}

fun AppCompatActivity.replaceFragment(
        fragment: Fragment,
        @IdRes containerId: Int = R.id.fragmentContent,
        backStackTag: String? = null) {
    fragmentTransaction({ it.replace(containerId, fragment) }, backStackTag)
}

fun AppCompatActivity.fragmentTransaction(body: (FragmentTransaction) -> Unit, backStackTag: String? = null) {
    supportFragmentManager.beginTransaction()
            .apply(body)
            .apply { backStackTag?.let { addToBackStack(it) } }
            .commit()
}
