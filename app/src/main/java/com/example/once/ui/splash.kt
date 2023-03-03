package com.example.once.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.once.MainActivity
import com.example.once.R

class splash : AppCompatActivity() {
    private val SPLASH_TIME_OUT=4444L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val y=Intent(this,MainActivity::class.java)
            startActivity(y)
        },SPLASH_TIME_OUT)
    }
}