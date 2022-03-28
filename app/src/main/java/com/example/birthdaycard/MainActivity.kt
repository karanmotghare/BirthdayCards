package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.generateCard) as Button
        val name = findViewById(R.id.editTextTextPersonName) as EditText


        btn.setOnClickListener{
            //Toast.makeText(this, "name is ${name.editableText.toString()}",Toast.LENGTH_SHORT).show()
            val name1 = name.editableText.toString()

            val intent = Intent(this,Generateactivity::class.java)
            intent.putExtra("name1",name1)
            startActivity(intent)
        }
    }
}