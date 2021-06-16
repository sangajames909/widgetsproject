package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast

class SeekBar : AppCompatActivity() {
    lateinit var seek: SeekBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)
        seek = findViewById(R.id.seekBar)
        seek.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Toast.makeText(this@SeekBar,"Downloading is in progress:" +seek.progress + "%",Toast.LENGTH_LONG).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@SeekBar,"Do not exit:" +seek.progress + "%",Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@SeekBar,"Loading please stand by:" +seek.progress + "%",Toast.LENGTH_LONG).show()
            }
        })
    }
}