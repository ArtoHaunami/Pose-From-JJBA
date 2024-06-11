package com.example.posefromjjba

import android.view.LayoutInflater import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(): RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById(R.id.itemTextView)
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent
    return ViewHolder(view)
    }
    override fun onBindViewHolder (holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.textView.text = item.text
    }
    override fun getItemCount(): Int {
    return itemList.size
}
}