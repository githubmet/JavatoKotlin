package com.hikmetanil.javatokotlin

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.p015_drawerlayout_full.*

class P015DrawerLayoutFull:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p015_drawerlayout_full)

        val toolbar=toolbarP015
        setSupportActionBar(toolbar)

        var drawerLayout=drawerLayoutP015

        var actionBarDrawerToggle=ActionBarDrawerToggle(this,drawerLayout,toolbar,
            R.string.open,R.string.close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        drawerLayout.post( Runnable { kotlin.run { actionBarDrawerToggle.syncState() } })

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}