package com.example.moreviewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var autotextview: AutoCompleteTextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autotextview = findViewById(R.id.autoTextView)
        button = findViewById(R.id.btn)
        val sports = resources.getStringArray(R.array.Sports)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, sports)
        autotextview.setAdapter(adapter)

        button.setOnClickListener(View.OnClickListener {
            val enteredText = getString(R.string.submitted_sports) + "" + autotextview.getText()

        })

    }
}