package com.example.tablayout.Gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityGalleryBinding

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

    }
}