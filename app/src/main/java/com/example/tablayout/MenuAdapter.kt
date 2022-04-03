package com.example.tablayout

import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menuList : List<Menu>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){

    inner class MenuViewHolder(private val binding: ): RecyclerView.ViewHolder(binding.root){

    }
}