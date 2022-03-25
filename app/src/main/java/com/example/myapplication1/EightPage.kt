package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EightPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page8)

        val btn = findViewById<View>(R.id.button8) as Button
        btn.setOnClickListener()
        {
            val intent = Intent(this, NinthPage::class.java)
            startActivity(intent)

        }


    }
}