package com.example.recycler_view_practice

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view_practice.data.DataSource

class WordsAdapter:
    RecyclerView.Adapter<WordsAdapter.WordViewHolder>() {
    private val dataset = DataSource().loadData()


    class WordViewHolder(private val view: View) :RecyclerView.ViewHolder(view){
        val button: Button = view.findViewById(R.id.button_item)
    }

    override fun getItemCount(): Int {
        Log.d("result","dataset.size")
        return dataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_word,parent,false)
        return WordViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val item = dataset[position]
        Log.d("result","on bind view holder")
        holder.button.text = item.toString()
    }

}