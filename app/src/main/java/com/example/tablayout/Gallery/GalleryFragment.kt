package com.example.tablayout.Gallery

import android.os.Bundle
import com.example.tablayout.base.BaseFragment
import com.example.tablayout.databinding.FragmentGalleryBinding


class GalleryFragment : BaseFragment<FragmentGalleryBinding>(FragmentGalleryBinding::inflate) {


    companion object {
        val POSITION_ARG = "postion_arg"
        @JvmStatic
        fun newInstance(position:Int) = GalleryFragment().apply {
            arguments = Bundle().apply {
                putInt(POSITION_ARG, position)
            }

            }
        }
    }
