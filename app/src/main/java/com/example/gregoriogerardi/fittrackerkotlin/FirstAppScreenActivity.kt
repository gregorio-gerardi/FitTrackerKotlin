package com.example.gregoriogerardi.fittrackerkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class FirstAppScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app_screen)
        val bus = BusProvider.getInstance()
    }
}