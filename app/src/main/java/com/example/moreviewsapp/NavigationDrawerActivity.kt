package com.example.moreviewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.HorizontalScrollView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    //initializing tags for widgets
    private lateinit var drawer: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer2)
        //view identity
        drawer = findViewById(R.id.drawer_Layout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navView = findViewById(R.id.nav_drawer)
        //give nav view a listener
        navView.setNavigationItemSelectedListener(this)
        //hamburger icon
        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        //attach drawer layout to listen to the toggle
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_holizontal ->{
                val intentHorizontal = Intent(this@NavigationDrawerActivity,com.example.moreviewsapp.HorizontalScrollView::class.java)
                startActivity(intentHorizontal)
            }
            R.id.nav_tabLayout ->{
                val intentTab = Intent(this@NavigationDrawerActivity,TabLayout::class.java)
                startActivity(intentTab)
            }
            R.id.nav_btn ->{
            val intentButton = Intent(this@NavigationDrawerActivity,RadioButton::class.java)
            startActivity(intentButton)
           }
            R.id.nav_bar ->{
                val intentProgress = Intent(this@NavigationDrawerActivity,ProgressBar::class.java)
                startActivity(intentProgress)
            }
            R.id.nav_rate ->{
                val intentRate = Intent(this@NavigationDrawerActivity,RatingBar::class.java)
                startActivity(intentRate)
            }
            R.id.nav_seek ->{
                val intentSeek = Intent(this@NavigationDrawerActivity,SeekBar::class.java)
                startActivity(intentSeek)
            }
            R.id.nav_spinner ->{
                val intentSpiner = Intent(this@NavigationDrawerActivity,Spinner::class.java)
                startActivity(intentSpiner)
            }
            R.id.nav_dynamic ->{
                val intentDynamic = Intent(this@NavigationDrawerActivity,DynamicSpinner::class.java)
                startActivity(intentDynamic)
            }
            R.id.nav_time ->{
                val intentTime = Intent(this@NavigationDrawerActivity,TimePicker::class.java)
                startActivity(intentTime)
            }
            R.id.nav_list ->{
                val intentList = Intent(this@NavigationDrawerActivity,ListViewActivity::class.java)
                startActivity(intentList)
            }
            R.id.nav_array ->{
                val intentArray = Intent(this@NavigationDrawerActivity,MainActivity2::class.java)
                startActivity(intentArray)
            }


        }
        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }

    }
}