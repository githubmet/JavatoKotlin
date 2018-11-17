package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class P004CreateUserface: Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val relativeLayout=RelativeLayout(this)

        val textView=TextView(this)
        textView.text=resources.getString(R.string.app_name)
        val laTextView=RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        laTextView.addRule(RelativeLayout.CENTER_IN_PARENT)
        textView.layoutParams=laTextView
        textView.id=1234

        val button= Button(this)
        button.text=resources.getString(R.string.app_name)
        val laButton=RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.MATCH_PARENT
        )
        laButton.addRule(RelativeLayout.BELOW,textView.id)
        button.layoutParams=laButton

        relativeLayout.addView(textView)
        relativeLayout.addView(button)
        setContentView(relativeLayout)
    }
}