package com.example.tablayout

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayout.screen.myFragment.MyFragment


class PagerFragmentStateAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    private val NUM_PAGES = 8

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int) = MyFragment.newInstance(position)
}