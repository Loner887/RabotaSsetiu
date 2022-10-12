package com.example.rabotassetiu.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rabotassetiu.R
import com.example.rabotassetiu.model.beznal.Beznal
import com.example.rabotassetiu.model.nal.Nalichka
import com.example.rabotassetiu.model.nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*


class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var listStart = emptyList<Nalichka>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)

    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].PreviousDate
        holder.itemView.item_buy.text = listStart[position].Timestamp
        holder.itemView.item_sale.text = listStart[position].Date
    }

    override fun getItemCount(): Int {

        return listStart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Nalichka>){
        listStart = list
        notifyDataSetChanged()
    }
}