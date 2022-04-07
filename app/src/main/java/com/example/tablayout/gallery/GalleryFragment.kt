package com.example.tablayout.gallery

import android.os.Bundle
import android.view.View
import com.example.tablayout.base.BaseFragment
import com.example.tablayout.databinding.FragmentGalleryBinding


class GalleryFragment : BaseFragment<FragmentGalleryBinding>(FragmentGalleryBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pos = arguments?.getInt(POSITION_ARG)
        val viewPager = binding?.galleryVp

        pos?.let {
            when(pos){
                 0-> viewPager?.adapter = IntroAdapter(PageLists.mainFood)
                1-> viewPager?.adapter = IntroAdapter(PageLists.subFood)
                2-> viewPager?.adapter = IntroAdapter(PageLists.chineseFood)
            }
        }
    }

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
