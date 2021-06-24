package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = "Dice Rolled!"

        btnRoll.setOnClickListener(){
            rollDice()

        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        val tvResult :TextView = findViewById(R.id.result_text)

        tvResult.text = randomInt.toString()

    }
}