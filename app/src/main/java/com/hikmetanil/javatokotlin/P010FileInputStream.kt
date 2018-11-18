package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class P010FileInputStream:Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var textView=TextView(this)
        textView.text=resources.getString(R.string.text)

        var fileInputStream=openFileInput(P009FileOutputStream().FILEOUTPUT_NAME)
        var byteArray=ByteArray(fileInputStream.available())
        var data:Byte?=null
        when(fileInputStream.read(byteArray) !=-1){



        }

        setContentView(textView)
    }
}