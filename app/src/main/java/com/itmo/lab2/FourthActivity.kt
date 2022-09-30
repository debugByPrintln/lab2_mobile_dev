package com.itmo.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_fourth)
    }
}