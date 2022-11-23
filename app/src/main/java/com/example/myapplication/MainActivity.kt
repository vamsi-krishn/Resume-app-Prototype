package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActButton = findViewById<Button>(R.id.bu1)
        secondActButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"Opening Portfolio",Toast.LENGTH_SHORT).show()
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}