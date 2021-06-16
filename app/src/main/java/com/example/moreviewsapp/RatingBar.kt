package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        val rating_bar = findViewById<RatingBar>(R.id.rating_bar)
        if (rating_bar != null){
            val btn = findViewById<Button>(R.id.btn_submit)
            btn.setOnClickListener {
                val msg = rating_bar.rating.toString()
                Toast.makeText(this@RatingBar,"Rating is "+msg, Toast.LENGTH_LONG).show()
            }


        }

    }
}