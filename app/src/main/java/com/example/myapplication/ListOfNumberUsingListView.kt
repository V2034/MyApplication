package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.myapplication.databinding.ActivityListOfNumberUsingListViewBinding
import com.example.myapplication.databinding.ActivityNumberListAppBinding

class ListOfNumberUsingListView : AppCompatActivity() {
    private lateinit var binding: ActivityListOfNumberUsingListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListOfNumberUsingListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var arrayOfStrings = arrayOf<String>(
            "zero",
            "one",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten"
        )
        var adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayOfStrings)
        binding.listViewId.adapter=adapter
    }
}