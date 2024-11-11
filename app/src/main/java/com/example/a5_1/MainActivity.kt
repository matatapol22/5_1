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

        calculateButton.setOnClickListener {
            // Получаем выбранную стоимость формата
            val selectedFormatId = formatRadioGroup.checkedRadioButtonId
            if (selectedFormatId == -1) {
                Toast.makeText(this, "Выберите формат фотографии", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val selectedRadioButton = findViewById<RadioButton>(selectedFormatId)
            val formatCost = selectedRadioButton.tag.toString().toInt()

            // Получаем количество фотографий
            val photoCount = photoCountEditText.text.toString().toIntOrNull()
            if (photoCount == null || photoCount <= 0) {
                Toast.makeText(this, "Введите количество фотографий", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Расчет стоимости
            val totalCost = formatCost * photoCount


        }
    }
}