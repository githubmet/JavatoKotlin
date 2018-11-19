package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.p012_context_menu.*

class P012ContextMenu:Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p012_context_menu)

        val textView=textViewP012
        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        var menuInflater=MenuInflater(this)
        menuInflater.inflate(R.menu.p012_context_item,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item_red_p012 -> Toast.makeText(this,R.string.red,Toast.LENGTH_SHORT).show()
            R.id.item_green_p012 -> Toast.makeText(this,R.string.green,Toast.LENGTH_SHORT).show()
            R.id.item_blue_p012 -> Toast.makeText(this,R.string.blue,Toast.LENGTH_SHORT).show()
        }

        return super.onContextItemSelected(item)
    }
}