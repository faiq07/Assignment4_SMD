package com.example.myapplication1

import AirplaneModeChangeReceiver
import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FifthPage : AppCompatActivity(),View.OnClickListener {

    private var start: Button? = null
    private var stop: Button? = null
    lateinit var receiver: AirplaneModeChangeReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page5)
        receiver = AirplaneModeChangeReceiver()
        var mp: MediaPlayer = MediaPlayer.create(this, R.raw.sample)
        val btn = findViewById<View>(R.id.button5) as Button
        start = findViewById<View>(R.id.startbutton) as Button
        stop = findViewById<View>(R.id.Stopbutton) as Button
        btn.setOnClickListener()
        {
            mp.start()
            val intent = Intent(this, SixthPage::class.java)
            startActivity(intent)

        }
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            // registering the receiver
            // it parameter which is passed in  registerReceiver() function
            // is the intent filter that we have just created
            registerReceiver(receiver, it)
        }
        start!!.setOnClickListener(this)
        stop!!.setOnClickListener(this)

    }
    override fun onClick(view: View) {

        // process to be performed
        // if start button is clicked
        if (view === start) {

            // starting the service
            startService(Intent(this, servives::class.java))
        }

        // process to be performed
        // if stop button is clicked
        else if (view === stop) {

            // stopping the service
            stopService(Intent(this, servives::class.java))
        }
    }
    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}