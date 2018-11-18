package com.hikmetanil.javatokotlin

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class P011AlertDialog:Activity(), View.OnClickListener {

    override fun onClick(p0: View?) {
        var builder=AlertDialog.Builder(this)
        builder.setTitle(R.string.title)
        builder.setMessage(R.string.app_name)
        var alertDialog = builder.create()
        alertDialog.show()



    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var button= Button(this)
        button.text=resources.getString(R.string.text)

        setContentView(button)
        button.setOnClickListener (this)
    }
}