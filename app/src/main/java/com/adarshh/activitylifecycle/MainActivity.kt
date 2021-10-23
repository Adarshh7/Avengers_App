package com.adarshh.activitylifecycle

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var titlename:String?="Avengers"
lateinit var sharedPreferences: SharedPreferences

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.preferences_file_name),Context.MODE_PRIVATE)
        setContentView(R.layout.avengers_page)
        println("OnCreate Called")

        titlename= sharedPreferences.getString("Title","The Avengers")
        title= titlename

    }

}