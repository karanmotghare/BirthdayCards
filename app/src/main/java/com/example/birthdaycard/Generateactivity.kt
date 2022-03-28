package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_generateactivity.*

class Generateactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generateactivity)

        val name = intent.getStringExtra("name1")
        birthDayName.text = "Happy Birthday $name"

    }
}