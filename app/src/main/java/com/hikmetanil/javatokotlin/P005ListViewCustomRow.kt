package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.hikmetanil.javatokotlin.adapter.P005ArrayAdapter
import kotlinx.android.synthetic.main.p005_listview.*

class P005ListViewCustomRow : Activity(), AdapterView.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p005_listview)

        val listView=listViewP005
        val activityNames=resources.getStringArray(R.array.activity_names)

        val arrayAdapter= P005ArrayAdapter(this,activityNames)
        listView.adapter=arrayAdapter

        listView.setOnItemClickListener(this)
    }
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(this, "Item position= "+p2,Toast.LENGTH_SHORT).show()
    }


}