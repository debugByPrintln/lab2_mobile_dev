package com.itmo.lab2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //actionBar!!.hide()
        setContentView(R.layout.activity_first)
    }
}