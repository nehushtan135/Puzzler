package com.example.puzzler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView
class GridAdapter(var context: Context, var puzzlePics: Array<String>, var image: IntArray) :
    BaseAdapter() {
    private var inflater: LayoutInflater? = null
    private lateinit var imageButton: ImageButton
    private lateinit var textView: TextView
    override fun getCount(): Int {
        return puzzlePics.size
    }

    override fun getItem(i: Int): Any? {
        return null
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        if (inflater == null) inflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        if (convertView == null) {
            convertView = inflater!!.inflate(R.layout.grid_item, null)
        }
        val imageButton = convertView!!.findViewById<ImageButton>(R.id.grid_button)
        val textview = convertView.findViewById<TextView>(R.id.item_name)
        imageButton.setImageResource(image[position])
        textview.text = puzzlePics[position]
        return convertView
    }
}