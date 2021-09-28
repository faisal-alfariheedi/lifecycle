package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Activity", "activity created")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity", "started")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity", "paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity", "Resumed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity", "Stoped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity", "Destroyed")
    }

}
