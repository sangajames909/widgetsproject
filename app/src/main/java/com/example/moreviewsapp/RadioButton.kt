package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.RadioButton

class RadioButton : AppCompatActivity() {
    lateinit var radio_group: RadioGroup
    lateinit var textView: TextView
    lateinit var radioBtn: RadioButton
    lateinit var radiobutton: RadioButton
    lateinit var btnradio: RadioButton
    lateinit var radiobtn: RadioButton
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        radio_group = findViewById(R.id.radio_group)
        radio_group.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
        })
        btn = findViewById(R.id.btn2)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Clicked",Toast.LENGTH_LONG).show()
        }
    }
}