package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timer


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private var time = 0
    private var timerTask: Timer? = null


    private fun start() {
        fab.setImageResource(R.drawable.ic_baseline_pause_24)


        timerTask = timer(period = 10) {
            time++

            val sec = time / 100
            val milli = time % 100

            runOnUiThread {
                secTextView.text = "$sec"
                milliTextView.text = "$milli"
            }
        }


    }
}


