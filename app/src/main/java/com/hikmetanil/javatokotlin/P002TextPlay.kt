package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.p002_textplay.*

class P002TextPlay: Activity(), View.OnClickListener {
    var relativeLayout:RelativeLayout?=null
    var textView:TextView?=null
    override fun onClick(p0: View?) {
        var layoutParamsOfTextView= RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        when(p0?.id){
            R.id.buttonLeftP002 -> {
                textView?.text=resources.getString(R.string.left)
                layoutParamsOfTextView.addRule(RelativeLayout.ALIGN_PARENT_LEFT)
                layoutParamsOfTextView.addRule(RelativeLayout.CENTER_VERTICAL)
                textView?.layoutParams=layoutParamsOfTextView
            }
            R.id.buttonRightP002 -> {
                textView?.text = resources.getString(R.string.right)
                layoutParamsOfTextView.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
                layoutParamsOfTextView.addRule(RelativeLayout.CENTER_VERTICAL)
                textView?.layoutParams=layoutParamsOfTextView
            }
            R.id.buttonUpP002 -> {
                textView?.text = resources.getString(R.string.up)
                layoutParamsOfTextView.addRule(RelativeLayout.ALIGN_PARENT_TOP)
                layoutParamsOfTextView.addRule(RelativeLayout.CENTER_HORIZONTAL)
                textView?.layoutParams=layoutParamsOfTextView
            }
            R.id.buttonDownP002 -> {
                textView?.text = resources.getString(R.string.down)
                layoutParamsOfTextView.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
                layoutParamsOfTextView.addRule(RelativeLayout.CENTER_HORIZONTAL)
                textView?.layoutParams=layoutParamsOfTextView
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p002_textplay)

        buttonLeftP002.setOnClickListener(this)
        buttonRightP002.setOnClickListener(this)
        buttonUpP002.setOnClickListener(this)
        buttonDownP002.setOnClickListener(this)
        relativeLayout=relativeLayoutP002
        textView=textViewP002
    }
}