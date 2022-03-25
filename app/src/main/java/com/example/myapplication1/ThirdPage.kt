package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3)

        val btn = findViewById<View>(R.id.button3) as Button
        btn.setOnClickListener()
        {
            val intent = Intent(this@ThirdPage, ForthPage::class.java)
            startActivity(intent)

        }


    }
}