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
        val editTextCon = getEditText()
        someTextView.text = "Hello ${editTextCon}!"
        getName()
    }

    fun getEditText(): String{
        val editText: TextView = findViewById<TextView>(R.id.editText)
        return editText.text.toString()
    }


}