package com.example.daniwebsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindButton()
    }

    private fun bindButton(){
        val button = findViewById<Button>(R.id.button)
        val mainView = findViewById<ConstraintLayout>(R.id.main)
        val error = getString(R.string.snackbar_loading_fail)

        val snackbar = Snackbar.make(
            mainView,
            error,
            Snackbar.LENGTH_SHORT)

        button.setOnClickListener {
            snackbar.show()
        }
    }
}