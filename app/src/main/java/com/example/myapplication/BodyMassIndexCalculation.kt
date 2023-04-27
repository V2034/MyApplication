package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityBodyMassIndexCalculationBinding

class BodyMassIndexCalculation : AppCompatActivity() {
    private lateinit var binding: ActivityBodyMassIndexCalculationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBodyMassIndexCalculationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun CalculateBmi(view: View) {
        var weight_of_person: Double = binding.weightId?.text.toString().toDouble()
        var height_of_person: Double = binding.heightId?.text.toString().toDouble()
        var yourBmi: Float

        yourBmi = Bmi(weight_of_person, height_of_person)

        binding.bmiTextViewId.text =
            String.format(resources.getString(R.string.Your_bmi_is), yourBmi)
        if (yourBmi < 18.5) {
            binding.bmiTextId.text = resources.getString(R.string.UnderWeight)
        } else if (18.5 <= yourBmi && yourBmi <= 24.9) {
            binding.bmiTextId.text = resources.getString(R.string.Healthy)
        } else if (25 <= yourBmi && yourBmi <= 29.9) {
            binding.bmiTextId.text = resources.getString(R.string.Obesity)
        } else if (30 <= yourBmi) {
            binding.bmiTextId.text = resources.getString(R.string.OverWeight)
        }
    }

    fun Bmi(weight: Double, height: Double): Float {
        return (weight / (height * height)).toFloat()
    }
}