package com.example.puzzler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newPuzzle = findViewById<Button>(R.id.newPuzzleButton)
        newPuzzle.setOnClickListener {
            val intent = Intent(this,ConfigurePuzzleActivity::class.java)
            startActivity(intent)
        }
    }
}