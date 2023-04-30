package com.example.nika_nadiradzeshualeduri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }

    private var count = 0
    private lateinit var countText: TextView

    val myButton = findViewById<Button>(R.id.clickMe)
    val countTextView = findViewById<TextView>(R.id.countText)

    myButton.setOnClickListener {
        count++
        countText.text = count.toString()
    }


}
