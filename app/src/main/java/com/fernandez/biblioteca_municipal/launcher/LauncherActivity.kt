package com.fernandez.biblioteca_municipal.launcher

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.fernandez.biblioteca_municipal.R
import com.fernandez.biblioteca_municipal.home.HomeActivity

class LauncherActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val actionBar = supportActionBar
        actionBar?.hide()

        Handler(Looper.getMainLooper()).
        postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 6000)

    }
}