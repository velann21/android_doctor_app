package com.drborus.app.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.drborus.app.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(
            R.id.flContainer,
            HomeFragment.newInstance()
        ).commit()
    }
}
