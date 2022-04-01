package com.example.tablayout.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayout.databinding.ActivityMainBinding
import com.example.tablayout.databinding.ActivityMainGalleryBinding

class MainGalleryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainGalleryBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = IntroAdapter(PageLists.introSlides)
        binding.dotsIndicator.setViewPager2(binding.viewPager)
    }


}