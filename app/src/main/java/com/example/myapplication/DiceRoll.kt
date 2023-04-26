package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class DiceRoll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roll)
    }

    fun RollTheDice(view: View) {
        val diceOne: ImageView = findViewById(R.id.dice1)
        val diceTwo: ImageView = findViewById(R.id.dice2)

        val randomNumber1 = Random.nextInt(6) + 1
        val rollDice1 = when (randomNumber1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice6
        }
        diceOne.setImageResource(rollDice1)
        val randomNumber2 = Random.nextInt(6) + 1
        val rollDice2 = when (randomNumber2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice6
        }
        diceTwo.setImageResource(rollDice2)
    }
}