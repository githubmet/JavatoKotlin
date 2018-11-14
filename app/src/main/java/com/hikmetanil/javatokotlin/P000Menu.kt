package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.p000_menu.*

class P000Menu : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p000_menu)

        var listViewP000:ListView=listViewP000

        val activityNames=resources.getStringArray(R.array.activity_names)
        val listAdapter:ListAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,activityNames)

        listViewP000.adapter=listAdapter
    }
}
