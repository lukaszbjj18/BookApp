package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_quotes.view.*

class QuotesAdapter : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(viewGrop: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(viewGrop.context)
        val contactRow = layoutInflater.inflate(R.layout.recycler_quotes, viewGrop, false)
        return MyViewHolder(contactRow)
    }

    override fun getItemCount(): Int {
        return QuotesObjectData.resources.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val imageQuotes = holder.view.imageContainer
        val textUnderImageQuotes = holder.view.textContainer

        imageQuotes.setImageResource(QuotesObjectData.resources[position].second)
        textUnderImageQuotes.text = QuotesObjectData.resources[position].first
    }

}

class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)