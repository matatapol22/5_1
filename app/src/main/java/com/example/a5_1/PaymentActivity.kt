package com.example.a5_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val paymentTextView: TextView = findViewById(R.id.paymentTextView)

        // Получение переданной стоимости
        val totalCost = intent.getIntExtra("TOTAL_COST", 0)
        paymentTextView.text = "Оплатить: $totalCost рублей"
    }
}