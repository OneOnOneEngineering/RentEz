package com.rentez.ext

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

fun FragmentActivity.toast(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, length).show()
}

fun AppCompatActivity.addFragment(fragment: Fragment, containerId: Int) {
    addFragment(fragment, containerId, fragment::javaClass.name)
}

fun AppCompatActivity.addFragment(fragment: Fragment, containerId: Int, tag: String) {
    supportFragmentManager.beginTransaction()
        .setPrimaryNavigationFragment(fragment)
        .addToBackStack(tag)
        .replace(containerId, fragment, tag)
        .commit()
}

fun AppCompatActivity.popFragment(tag: String) {
    supportFragmentManager.popBackStack(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
}

fun AppCompatActivity.hasFragmentByTag(tag: String) = supportFragmentManager.findFragmentByTag(tag) != null