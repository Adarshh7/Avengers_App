package com.adarshh.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var titlename:String?="Avengers"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.avengers_page)
        println("OnCreate Called")

        if(intent!=null)
        {
            titlename=intent.getStringExtra("Name")
        }
        title= titlename

    }

}