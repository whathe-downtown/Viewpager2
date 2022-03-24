package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class MyPageAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    private val NUM_PAGES = 8

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return  when( position){
            0 -> { MyFragment.newInstance("Page1","")}
            1 -> {MyFragment.newInstance("Page2","")}
            2 -> {MyFragment.newInstance("Page3","")}
            3 -> {MyFragment.newInstance("Page4","")}
            5 -> {MyFragment.newInstance("Page5","")}
            6 -> {MyFragment.newInstance("Page6","")}
            7-> {MyFragment.newInstance("Page7","")}
            else -> {MyFragment.newInstance("Page8", "")}
        }
    }
}