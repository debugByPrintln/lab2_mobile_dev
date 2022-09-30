package com.itmo.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_main)

        val firstButton : Button = findViewById(R.id.first)
        val secondButton : Button = findViewById(R.id.second)
        val thirdButton : Button = findViewById(R.id.third)
        val fourthButton : Button = findViewById(R.id.fourth)

        firstButton.setOnClickListener { openFirstActivity() }
        secondButton.setOnClickListener { openSecondActivity() }
        thirdButton.setOnClickListener { openThirdActivity() }
        fourthButton.setOnClickListener { openFourthActivity() }
    }

    private fun openFirstActivity(){
        val intent : Intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }

    private fun openSecondActivity(){
        val intent : Intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun openThirdActivity() {
        val intent : Intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    private fun openFourthActivity(){
        val intent:Intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }
}