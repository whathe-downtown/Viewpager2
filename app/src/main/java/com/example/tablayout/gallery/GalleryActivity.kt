package com.example.tablayout.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityGalleryBinding
import com.google.android.material.tabs.TabLayoutMediator

class GalleryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // set up gallery Acitivity
        val galleryViewpager = binding?.galleryVp
        val adapter  =GalleryAdapter(this)
        galleryViewpager?.adapter = adapter

        TabLayoutMediator(binding!!.tabLayout, galleryViewpager!!){
            tab, position ->
            tab.text = getTitle(position)

        }.attach()

    }
    private fun getTitle(position:Int): String?{
        return when(position){
            0 ->"Tee- Shirts"
            1 -> "Hoodies"
            2 -> "Sneakers"
            else -> null
        }
    }
}