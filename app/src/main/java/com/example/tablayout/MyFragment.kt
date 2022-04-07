package com.example.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tablayout.base.BaseFragment
import com.example.tablayout.databinding.FragmentMyBinding


class MyFragment : BaseFragment<FragmentMyBinding>(FragmentMyBinding::inflate) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val choice =arguments?.getInt(MENUCATEGORY_ITEM)
        val viewpager  = binding?.viewPager

        choice?.let {
            when(choice){
                0 -> viewpager?.adapter = MenuAdapter(MenuLists.mainFood)
                1 -> viewpager?.adapter = MenuAdapter(MenuLists.subFood)
                2 -> viewpager?.adapter = MenuAdapter(MenuLists.mainFood)
                3 -> viewpager?.adapter = MenuAdapter(MenuLists.subFood)
                4 -> viewpager?.adapter = MenuAdapter(MenuLists.mainFood)
                5 -> viewpager?.adapter = MenuAdapter(MenuLists.subFood)
                6 -> viewpager?.adapter = MenuAdapter(MenuLists.mainFood)
                7 -> viewpager?.adapter = MenuAdapter(MenuLists.subFood)
                else -> viewpager?.adapter = MenuAdapter(MenuLists.mainFood)


            }
        }



    }


    companion object {
        val MENUCATEGORY_ITEM = "menucateogry_item"
        @JvmStatic
        fun newInstance(position : Int) =
            MyFragment().apply {
                arguments = Bundle().apply {
                    putInt(MENUCATEGORY_ITEM, position)
                }
            }
    }
}