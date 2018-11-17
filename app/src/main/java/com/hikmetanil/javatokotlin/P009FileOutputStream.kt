package com.hikmetanil.javatokotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class P009FileOutputStream:Activity(), View.OnClickListener {
    val FILEOUTPUT_NAME="com.hikmetanil.javatokotlin.FILEOUTPUT_NAME"
    override fun onClick(p0: View?) {
        val className=Class.forName("com.hikmetanil.javatokotlin.P010FileInputStream")
        val intent=Intent(this,className)
        startActivity(intent)

        var fileOutputStream=openFileOutput(FILEOUTPUT_NAME, Context.MODE_PRIVATE)
        val data=resources.getString(R.string.app_name)
        var byteVeri: ByteArray = data.toByteArray()
        fileOutputStream.write(byteVeri)
        fileOutputStream.close()

        Toast.makeText(this,R.string.app_name,Toast.LENGTH_SHORT).show()
//Amazing :)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var button=Button(this)
        button.text=resources.getString(R.string.open_new_activity)
        button.setOnClickListener(this)

        setContentView(button)
    }
}