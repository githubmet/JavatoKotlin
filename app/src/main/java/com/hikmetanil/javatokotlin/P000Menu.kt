package com.hikmetanil.javatokotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.p000_menu.*

class P000Menu : Activity(), AdapterView.OnItemClickListener {
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

        var activityNames=Class.forName("com.hikmetanil.javatokotlin."+p0?.getItemAtPosition(p2))

        val intent:Intent= Intent(this,activityNames)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p000_menu)

        var listViewP000:ListView=listViewP000

        val activityNames=resources.getStringArray(R.array.activity_names)
        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,activityNames)

        listViewP000.adapter=arrayAdapter
        listViewP000.setOnItemClickListener(this)
    }

}
