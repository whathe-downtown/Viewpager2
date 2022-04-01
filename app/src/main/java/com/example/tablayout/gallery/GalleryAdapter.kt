package com.example.tablayout.gallery

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class GalleryAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() =3


    override fun createFragment(position: Int) = GalleryFragment.newInstance(position)
}