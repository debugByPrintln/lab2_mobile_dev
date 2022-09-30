package com.itmo.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_third)

        val btn : ImageButton = findViewById(R.id.cross_btn)

        btn.setOnClickListener{ openMainActivity() }
    }

    private fun openMainActivity(){
        val intent : Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}