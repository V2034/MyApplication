package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1: Button = findViewById(R.id.text_colour_change_app_id)
        var button2: Button = findViewById(R.id.dice_roll_app_id)
        var button3: Button = findViewById(R.id.compose_mail_app_id)
        var button4: Button = findViewById(R.id.my_Calculator_app_id)
        var button5: Button = findViewById(R.id.Guess_my_number_app_id)
        var button6: Button = findViewById(R.id.bmi_id)
        var button7: Button = findViewById(R.id.number_list_print_id)
        var button8: Button = findViewById(R.id.number_list_app_id)

        button1.setOnClickListener() {

            var intent = Intent(this, TextColourChange::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener() {

            var intent2 = Intent(this, DiceRoll::class.java)
            startActivity(intent2)
        }
        button3.setOnClickListener() {

            var intent3 = Intent(this, ComposeMail::class.java)
            startActivity(intent3)
        }
        button4.setOnClickListener() {
            var intent4 = Intent(this, MyCalculator::class.java)
            startActivity(intent4)
        }
        button5.setOnClickListener() {
            var intent5 = Intent(this, GuessMyNumber::class.java)
            startActivity(intent5)
        }
        button6.setOnClickListener() {
            var intent6 = Intent(this, BodyMassIndexCalculation::class.java)
            startActivity(intent6)
        }
        button7.setOnClickListener(){
            var intent7=Intent(this,ListOfNumberUsingListView::class.java)
            startActivity(intent7)
        }
        button8.setOnClickListener(){
            var intent8 = Intent(this,NumberListApp::class.java)
            startActivity(intent8)
        }
    }

}