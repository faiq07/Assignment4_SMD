package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FifthPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page5)

        val btn = findViewById<View>(R.id.button5) as Button
        btn.setOnClickListener()
        {
            val intent = Intent(this, SixthPage::class.java)
            startActivity(intent)

        }


    }
}