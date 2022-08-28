package com.roybidani.hackeruapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getName(): String{
        var name: String = "Roy"
        return name
    }

    fun onButtonClick(view: View){
        val someTextView:TextView = findViewById<TextView>(R.id.someTextView)
        someTextView.text = "Hello ${getName()}"
        getName()
    }


}