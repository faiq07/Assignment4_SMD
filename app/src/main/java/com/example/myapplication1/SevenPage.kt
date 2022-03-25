package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SevenPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page7)

        val btn = findViewById<View>(R.id.button7) as Button
        btn.setOnClickListener()
        {
            val intent = Intent(this, EightPage::class.java)
            startActivity(intent)

        }


    }
}