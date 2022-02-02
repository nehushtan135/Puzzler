package com.example.puzzler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.puzzler.databinding.ActivityPuzzleSelectionBinding

class ConfigurePuzzleActivity : AppCompatActivity() {

    lateinit var gridView:GridView
    val puzzlePics = arrayOf("Custom Picture","Flower","Bolt", "Wheat", "Flag","White FLower")
    val imageVals = intArrayOf(R.drawable.icons8_camera_96,R.drawable.dsc_7552, R.drawable.dsc_7554,R.drawable.dsc_7595,R.drawable.dsc_7623,R.drawable.dsc_7638)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configure_puzzle)
        gridView = findViewById(R.id.gridView)
        gridView = findViewById(R.id.gridView)
        val mainAdapter = GridAdapter(this@ConfigurePuzzleActivity, puzzlePics, imageVals)
        gridView.adapter = mainAdapter

    }
}