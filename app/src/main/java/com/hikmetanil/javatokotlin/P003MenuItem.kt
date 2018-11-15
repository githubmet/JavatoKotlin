package com.hikmetanil.javatokotlin

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.p003_menuitem.*

class P003MenuItem : AppCompatActivity(){

    var relativeLayout:RelativeLayout?=null
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.p003_menuitem)

        relativeLayout=relativeLayoutP003
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater= MenuInflater(this)
        menuInflater.inflate(R.menu.p003_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item_red_p003 -> relativeLayout?.setBackgroundResource(R.color.colorAccent)
            R.id.item_green_p003 -> relativeLayout?.setBackgroundResource(R.color.colorPrimary)
            R.id.item_blue_p003 -> relativeLayout?.setBackgroundResource(R.color.colorPrimaryDark)
        }
        item?.setChecked(!item?.isChecked)
        return super.onOptionsItemSelected(item)
    }
}