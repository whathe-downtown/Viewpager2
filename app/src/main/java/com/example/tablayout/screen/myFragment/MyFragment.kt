package com.example.tablayout.screen.myFragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayout.repository.MenuLists
import com.example.tablayout.base.BaseFragment
import com.example.tablayout.databinding.FragmentMyBinding


class MyFragment : BaseFragment<FragmentMyBinding>(FragmentMyBinding::inflate) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val choice =arguments?.getInt(MENUCATEGORY_ITEM)
        val viewpager = binding.recyclerView

        viewpager.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)


        choice?.let {
            when(choice){
                0 -> viewpager.adapter = MyFragmentAdapter(MenuLists.mainFood)
                1 -> viewpager.adapter = MyFragmentAdapter(MenuLists.subFood)
                2 -> viewpager.adapter = MyFragmentAdapter(MenuLists.mainFood)
                3 -> viewpager.adapter = MyFragmentAdapter(MenuLists.subFood)
                4 -> viewpager.adapter = MyFragmentAdapter(MenuLists.mainFood)
                5 -> viewpager.adapter = MyFragmentAdapter(MenuLists.subFood)
                6 -> viewpager.adapter = MyFragmentAdapter(MenuLists.mainFood)
                7 -> viewpager.adapter = MyFragmentAdapter(MenuLists.subFood)
                else -> viewpager.adapter = MyFragmentAdapter(MenuLists.mainFood)


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