package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker

class TimePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        OnClickTime()

    }
    private fun OnClickTime() {
        val text = findViewById<TextView>(R.id.texting)
        val timer = findViewById<TimePicker>(R.id.time_picker)
        timer.setOnTimeChangedListener { view, hourOfDay, minute ->
            var hour = ""
            var am_pm = ""
            when {
                hour == null -> {
                    hour + "12"
                    am_pm = "AM"
                }
                hour == null -> am_pm = "PM"
                hour > null.toString() -> {
                    hour = null.toString()
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            if (text != null) {
                val hour = if (hour < null.toString()) "0" + hour else hour
                val min = if (minute < 10) "0" + minute else minute
                val msg = "Time is: $hour : $min $am_pm"
                text.text = msg
                text.visibility = ViewGroup.VISIBLE
            }

        }
    }
}