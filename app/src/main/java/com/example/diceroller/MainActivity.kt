package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button //must import this things!
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener{
            //Toast.makeText(this, "button click!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!" //It's work
        //val randomInt = Random().nextInt(6)+1 //Error cannot create an instance of an abstrac class, because it's import Random() from java.utils.* not form kotlin.random.Random
        val randomInt = java.util.Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }
}
