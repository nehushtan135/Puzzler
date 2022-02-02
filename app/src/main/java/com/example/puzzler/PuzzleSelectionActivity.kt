package com.example.puzzler

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.puzzler.databinding.ActivityPuzzleSelectionBinding

class PuzzleSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPuzzleSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.binding = ActivityPuzzleSelectionBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        this.binding.toolbarLayout.title = title
    }
}