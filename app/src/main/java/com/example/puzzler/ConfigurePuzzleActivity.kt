package com.example.puzzler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.puzzler.databinding.ActivityConfigurePuzzleBinding

class ConfigurePuzzleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfigurePuzzleBinding

    lateinit var gridView:GridView
    val puzzlePics = arrayOf("Custom Picture","Flower","Bolt", "Wheat", "Flag","White FLower")
    val imageVals = intArrayOf(R.drawable.icons8_camera_96,R.drawable.dsc_7552, R.drawable.dsc_7554,R.drawable.dsc_7595,R.drawable.dsc_7623,R.drawable.dsc_7638)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfigurePuzzleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupGridView()

    }
    private fun setupGridView(){
        val adapter = GridAdapter(this,puzzlePics,R.drawable.icons8_camera_96)
        binding.gridView.adapter = adapter
        binding.gridView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, v, position, id ->
                Toast.makeText(this, " Clicked Position: " + (position + 1),
                    Toast.LENGTH_SHORT
                ).show()
            }

    }
}