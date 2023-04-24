package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1:Button=findViewById(R.id.app1)
        val button2:Button=findViewById(R.id.app2)
        val button3:Button=findViewById(R.id.app3)

        button1.setOnClickListener(){

            var intent=Intent(this,Text_colour_change::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener(){

            var intent2=Intent(this,DiceRoll::class.java)
            startActivity(intent2)
        }
        button3.setOnClickListener(){

            var intent3=Intent(this,ComposeMail::class.java)
            startActivity(intent3)
        }
    }

}