package com.example.bootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var diceText: TextView
    lateinit var diceButton : Button
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        diceText  = findViewById(R.id.diceText)
        diceButton = findViewById(R.id.diceButton)
        diceImage = findViewById(R.id.diceImage)

        diceButton.setOnClickListener {

            changeText()
        }


    }

    private fun changeText(){
        val randomNumber = (1..6).random()
        val drawableResource = when(randomNumber){
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage.setImageResource(drawableResource)
        diceText.text = randomNumber.toString()
    }
}