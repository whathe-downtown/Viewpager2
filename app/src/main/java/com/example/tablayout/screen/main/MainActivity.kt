package com.example.tablayout.screen.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.tablayout.PagerFragmentStateAdapter
import com.example.tablayout.R
import com.example.tablayout.RecipeCateogry
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val tabIcon = listOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_baseline_access_time_filled_24,
        R.drawable.ic_baseline_60fps_24
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply{
            adapter = PagerFragmentStateAdapter(context as FragmentActivity)
        }

        TabLayoutMediator(binding.tabs,binding.viewpager){tab, position ->
           tab.setText(RecipeCateogry.values()[position].categoryNameId)
        }.attach()

    }
}