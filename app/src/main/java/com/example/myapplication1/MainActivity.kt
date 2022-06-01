package com.example.myapplication1

import AirplaneModeChangeReceiver
import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //private var start: Button? = null
    //private var stop: Button? = null
    lateinit var receiver: AirplaneModeChangeReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        receiver = AirplaneModeChangeReceiver()
        //start = findViewById<View>(R.id.startButton) as Button
        //stop = findViewById<View>(R.id.stopButton) as Button
        val btn = findViewById<View>(R.id.button) as Button
        var mp:MediaPlayer= MediaPlayer.create(this, R.raw.sample)

        btn.setOnClickListener()
        {

            mp.start()
            val intent = Intent(this@MainActivity, FirstPage::class.java)
            startActivity(intent)

        }


        //start!!.setOnClickListener(this)
        //stop!!.setOnClickListener(this)

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            // registering the receiver
            // it parameter which is passed in  registerReceiver() function
            // is the intent filter that we have just created
            registerReceiver(receiver, it)
        }
    }
    /*override fun onClick(view: View) {

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
    }*/

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }

}