package com.example.tablayout.screen.myFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.databinding.MenuItemsBinding
import com.example.tablayout.model.Menu

class MyFragmentAdapter(private val menuList : List<Menu>) : RecyclerView.Adapter<MyFragmentAdapter.MenuViewHolder>(){

    inner class MenuViewHolder(private val binding: MenuItemsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(menu : Menu){
            binding.menuImageView.setImageResource(menu.menuImage)
            binding.menuDescription.text = menu.description
            binding.menuTextView.text = menu.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return  MenuViewHolder(
            MenuItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
      holder.bind(menuList[position])
    }

    override fun getItemCount(): Int  = menuList.size
}