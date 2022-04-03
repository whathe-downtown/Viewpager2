package com.example.tablayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.databinding.MenuItemsBinding

class MenuAdapter(private val menuList : List<Menu>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){

    inner class MenuViewHolder(private val binding: MenuItemsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(menu :Menu){
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