package com.example.tugas1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val inputField = findViewById<EditText>(R.id.inputField)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val outputText = findViewById<TextView>(R.id.outputText)

        submitButton.setOnClickListener {
            val enteredText = inputField.text.toString()
            outputText.text = "Hello, $enteredText"
        }
    }
}