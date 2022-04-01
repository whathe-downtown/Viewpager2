package com.example.tablayout.gallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.databinding.IntroItemsBinding

class IntroAdapter(private val introList: List<Intro>): RecyclerView.Adapter<IntroAdapter.IntroViewHolder>(){

    inner class IntroViewHolder(private val binding: IntroItemsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(intro :Intro){
            binding.descTv.text = intro.description
            binding.titleTv.text = intro.category
            binding.iconIv.setImageResource(intro.picture  )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
       return IntroViewHolder(
           IntroItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       )
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
       holder.bind(introList[position])
    }

    override fun getItemCount(): Int  = introList.size
}