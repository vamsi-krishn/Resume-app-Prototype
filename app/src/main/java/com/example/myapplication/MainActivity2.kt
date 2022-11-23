package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageButton1 = findViewById<ImageButton>(R.id.imageButton6)
        imageButton1.setOnClickListener{
            Toast.makeText(this@MainActivity2,"Opening Skills",Toast.LENGTH_LONG).show()
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }
        val imageButton = findViewById<ImageButton>(R.id.imageButton4)
        imageButton.setOnClickListener {
            Toast.makeText(this@MainActivity2,"Opening Profile",Toast.LENGTH_LONG).show()
                val i = Intent(this, MainActivity3::class.java)
                startActivity(i)

        }
        val secondActButton = findViewById<Button>(R.id.bu2)
        secondActButton.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}



