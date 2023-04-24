package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class Text_colour_change : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_colour_change)

        val btn:Button=findViewById(R.id.button_id)
        val txt:TextView=findViewById(R.id.text_view)
        btn.setOnClickListener(){
            val randomNumber= Random.nextInt(6)+1

            val colorChange=when(randomNumber){
                1->R.color.color1
                2->R.color.color2
                3->R.color.color3
                4->R.color.color4
                5->R.color.color5
                6->R.color.color6
                else->R.color.color6
            }
            txt.setTextColor(resources.getColor(colorChange))

        }
    }
}