package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class MyPageAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    private val NUM_PAGES = 8

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int) = MyFragment.newInstance(position)
}