package com.example.tasbeh.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tasbeh.R
import com.example.tasbeh.model.TahoratModel

class TahoratAdapter(val list:ArrayList<TahoratModel>):RecyclerView.Adapter<TahoratAdapter.TahoratViewHolder>() {

    class TahoratViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivImage=view.findViewById<ImageView>(R.id.iv_Image_Tahorat)
        val tvText=view.findViewById<TextView>(R.id.tv_Text_Tahorat)
        val tvTitle=view.findViewById<TextView>(R.id.tv_Title_Tahorat)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TahoratViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_tahorat,parent,false)
        return TahoratViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: TahoratViewHolder, position: Int) {
        val tahoratList=list[position]
        holder.ivImage.setImageResource(tahoratList.image)
        holder.tvText.text=tahoratList.text
        holder.tvTitle.text=tahoratList.title

    }

}