package com.example.a5_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val formatRadioGroup: RadioGroup = findViewById(R.id.formatRadioGroup)
        val photoCountEditText: EditText = findViewById(R.id.photoCountEditText)
        val calculateButton: Button = findViewById(R.id.calculateButton)
    }
}