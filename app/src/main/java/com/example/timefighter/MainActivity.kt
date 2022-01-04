package com.example.timefighter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal var score = 0

    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeLeftTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById(R.id.tapMeButton)

        tapMeButton.setOnClickListener { view ->
            incrementScore()
        }
    }

    private fun incrementScore() {
        TODO("Not yet implemented")
    }
}