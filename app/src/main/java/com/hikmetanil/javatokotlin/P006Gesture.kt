package com.hikmetanil.javatokotlin

import android.app.Activity
import android.os.Bundle
import android.support.v4.view.GestureDetectorCompat
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView

class P006Gesture:Activity(), GestureDetector.OnGestureListener {
    var textViev:TextView? =null
    var gestureDetectorCompat:GestureDetectorCompat? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        textViev= TextView(this)
        gestureDetectorCompat=GestureDetectorCompat(this,this)
        setContentView(textViev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gestureDetectorCompat?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
    override fun onShowPress(p0: MotionEvent?) {
        textViev?.text="onShowPress"
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        textViev?.text="onSingleTapUp"
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        textViev?.text="onDown"
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        textViev?.text="onFling"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        textViev?.text="onScroll"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        textViev?.text="onLongPress"

    }

}