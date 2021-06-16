package com.example.moreviewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf("Temwa Sanga","Peter rodri","Bukayo Saka","Smith Rowe","Benard Leno" )
        val listview = findViewById<ListView>(R.id.usersList)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,users)
        listview.adapter = arrayAdapter
    }


}