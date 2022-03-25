package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)

        val btn = findViewById<View>(R.id.button1) as Button
        btn.setOnClickListener()
        {
            val intent = Intent(this@FirstPage, SecondPage::class.java)
            startActivity(intent)

        }


    }
}