package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView


class P001IntentYakala: Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent=getIntent()
        val veri= intent.getStringExtra("com.hikmetanil.javatokotlin.INTENT_KEY")

        val textView= TextView(this)
        textView.text=veri
        setContentView(textView)
    }
}
