package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context : Context, private val textSizes : Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
        return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null) {
            textView = convertView as TextView
        }
        else {
            textView = TextView(context)
        }
        textView.text = getItem(position).toString()
        textView.textSize = getItem(position).toString().toFloat()
        textView.setPadding(5, 10, 0, 18)
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return super.getDropDownView(position, convertView, parent)
    }
}