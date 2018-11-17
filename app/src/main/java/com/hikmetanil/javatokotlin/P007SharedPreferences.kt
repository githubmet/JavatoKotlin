package com.hikmetanil.javatokotlin

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.p007_sharedpreferences.*


class P007SharedPreferences: Activity(), View.OnClickListener {
    val SHARED_NAME_AND_SURNAME:String="com.hikmetanil.javatokotlin.SHARED_NAME_AND_SURNAME"
    val NAME_AND_SURNAME:String="com.hikmetanil.javatokotlin.NAME_AND_SURNAME"
    var editText:EditText? =null
    var textView:TextView? =null
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.buttonSaveP007 ->{
                var sharedPreferences=getSharedPreferences(SHARED_NAME_AND_SURNAME,
                    Context.MODE_PRIVATE)
                var editor:SharedPreferences.Editor= sharedPreferences.edit()
                editor.putString(NAME_AND_SURNAME,editText?.text.toString())
                editor.commit()

            }
            R.id.buttonLoadP007 ->{
                var sharedPreferences=getSharedPreferences(SHARED_NAME_AND_SURNAME,
                    Context.MODE_PRIVATE)
                var name= sharedPreferences.getString(NAME_AND_SURNAME,null)
                textView?.text=name
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p007_sharedpreferences)


        editText=editTextP007
        var buttonSave:Button= buttonSaveP007
        var buttonLoad:Button=buttonLoadP007
        textView=textViewP007

        buttonSave.setOnClickListener(this)
        buttonLoad.setOnClickListener(this)
    }
}