package com.example.puzzler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import com.example.puzzler.databinding.GridItemBinding

internal class GridAdapter internal constructor
    ( context: Context,
     private var puzzlePics: Array<String>,
     private var image: Int) :
    ArrayAdapter<GridAdapter.ItemViewHolder>(context,image) {
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private lateinit var itemBinding: GridItemBinding


    override fun getCount(): Int {
        return if (this.puzzlePics != null) this.puzzlePics.size else 0
    }
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var convertView = view
        val holder: ItemViewHolder
        if (convertView == null) {
            itemBinding = GridItemBinding.inflate(inflater)
            convertView = itemBinding.root
            holder = ItemViewHolder()
            holder.name = itemBinding.itemName
            holder.icon = itemBinding.gridButton
            convertView.tag = holder
        }
        else{
            holder = convertView.tag as ItemViewHolder
        }
        holder.name!!.text = this.puzzlePics!![position]
        holder.icon!!.setImageResource(image)
        return convertView
    }
    internal class ItemViewHolder{
        var name: TextView? = null
        var icon: ImageButton? = null
    }

}
