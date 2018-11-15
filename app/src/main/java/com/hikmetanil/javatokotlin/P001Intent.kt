package com.hikmetanil.javatokotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.p001_intent.*

class P001Intent : Activity(), View.OnClickListener {
    var editText:EditText?=null
    val INTENT_KEY:String="com.hikmetanil.javatokotlin.INTENT_KEY"
    override fun onClick(p0: View?) {
        if(p0?.id==R.id.buttonP001){

            val paket:String =editText?.text.toString()
            var className=Class.forName("com.hikmetanil.javatokotlin.P001IntentYakala")
            val intent= Intent(this,className)
            intent.putExtra(INTENT_KEY,paket)
            startActivity(intent)

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p001_intent)

        editText=editTextP001
        val button=buttonP001
        button.setOnClickListener (this)
    }
}