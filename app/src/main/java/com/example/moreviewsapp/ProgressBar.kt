package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ProgressBar : AppCompatActivity() {
    private lateinit var progress: ProgressBar
    private lateinit var text: TextView
    lateinit var handler: Handler
    private lateinit var btn: Button
    private var i = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        progress = findViewById(R.id.progress_bar)
        text = findViewById(R.id.text_view)
        btn = findViewById(R.id.button_show)
        btn.setOnClickListener {

            Thread(Runnable {
                while (100.toString() > i.toString()) {
                    i +  "5"
                    // Update the progress bar and display the current value
                    handler.post(Runnable {
                        progress.progress = i as Int
                        text.text = i.toString() + "/" + progress.max
                    })
                    try {
                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }).start()
        }
    }

}