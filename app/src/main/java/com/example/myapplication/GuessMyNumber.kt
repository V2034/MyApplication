package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityGuessMyNumberBinding

class GuessMyNumber : AppCompatActivity() {
    private lateinit var binding: ActivityGuessMyNumberBinding
    var number:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess_my_number)

        binding= ActivityGuessMyNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val txt:TextView=findViewById(R.id.question_text_view)
        txt.text=resources.getString(R.string.first_question)
        number=5
    }
    fun down_button(view:View){
       if(number==5){
           number=3

       }
    }
    fun success_button(view: View){

    }
    fun up_button(view: View){

    }

}