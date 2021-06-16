package com.example.moreviewsapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Spinner
import androidx.annotation.RequiresApi

class DynamicSpinner : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_spinner)
        val languages = resources.getStringArray(R.array.Languages)
        val spinnerr = Spinner(this)
        spinnerr.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        val linearLayout = findViewById<LinearLayout>(R.id.linear_layout)
        linearLayout.addView(spinnerr)

        if (spinnerr != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
            spinnerr.adapter = adapter


            spinnerr.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@DynamicSpinner,
                        getString(R.string.selected_list) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                   Toast.makeText(this@DynamicSpinner,"Working",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}