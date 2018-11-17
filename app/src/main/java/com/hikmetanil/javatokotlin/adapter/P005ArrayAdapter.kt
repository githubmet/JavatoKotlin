package com.hikmetanil.javatokotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.hikmetanil.javatokotlin.R
import kotlinx.android.synthetic.main.p005_custom_row.view.*

class P005ArrayAdapter(context: Context, activityNames:Array<String>)
    : ArrayAdapter<String>(
    context,
    R.layout.p005_custom_row,
    activityNames )
{

    init {
        val context=context
        val activityNames=activityNames
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater=LayoutInflater.from(context)
        val view= layoutInflater.inflate(R.layout.p005_custom_row,parent,false)


        val textViewLeft=view.textViewLeftP005
        val textViewRight=view.textViewRightP005
        textViewLeft.text="Hello"
        textViewRight.text="Kotlin"


        return view //super.getView(position, convertView, parent)
    }



}