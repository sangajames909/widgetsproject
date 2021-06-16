package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Spinner

class Spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val country = resources.getStringArray(R.array.country)
        val spin = findViewById<Spinner>(R.id.spinner)
        if (spin != null){
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, country)
            spin.adapter = adapter

            spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(this@Spinner,
                        getString(R.string.selected_item) + " " +
                                "" + country[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(this@Spinner, "Country selected",Toast.LENGTH_LONG).show()
                }
            }
        }
    }


}