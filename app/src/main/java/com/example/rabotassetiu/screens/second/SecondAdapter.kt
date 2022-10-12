package com.example.rabotassetiu.screens.second

import androidx.recyclerview.widget.RecyclerView
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rabotassetiu.R
import com.example.rabotassetiu.model.beznal.Beznal
import com.example.rabotassetiu.model.beznal.BeznalItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<Beznal>()

    class SecondViewHolder(view: View):RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)

    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].Date
        holder.itemView.item_buy.text = listSecond[position].PreviousDate
        holder.itemView.item_sale.text = listSecond[position].PreviousURL
    }

    override fun getItemCount(): Int {

        return listSecond.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Beznal>){
        listSecond = list
        notifyDataSetChanged()
    }
}