package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.p013_edittext_listview.*

class P013EditTextChangedListView:Activity(), TextWatcher {
    override fun afterTextChanged(p0: Editable?) {
        arrayAdapter.filter.filter(p0.toString())
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }
    lateinit var arrayAdapter:ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p013_edittext_listview)

        var listView=listViewP013
        val arrayString=resources.getStringArray(R.array.names_p013)
        arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayString)
        listView.adapter=arrayAdapter

        var editText=editTextP013
        editText.addTextChangedListener(this)
    }
}