package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.p008_tabhost_tabspec.*

class P008TabHostTabSpec:Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.p008_tabhost_tabspec)

        var tabHost=tabHostP008
        tabHost.setup()

        var tabSpec= tabHost.newTabSpec("newTabTag")
        tabSpec.setIndicator("indicator")
        tabSpec.setContent(R.id.tab1)

        var tabSpec2= tabHost.newTabSpec("newTabTag2")
        tabSpec2.setIndicator("indicator2")
        tabSpec2.setContent(R.id.tab2)

        var tabSpec3= tabHost.newTabSpec("newTabTag3")
        tabSpec3.setIndicator("indicator3")
        tabSpec3.setContent(R.id.tab3)

        tabHost.addTab(tabSpec)
        tabHost.addTab(tabSpec2)
        tabHost.addTab(tabSpec3)

    }
}