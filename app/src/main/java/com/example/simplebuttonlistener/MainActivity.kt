package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnKotlin:Button
    private lateinit var btnXml:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKotlin = findViewById(R.id.btnKotlin)
        btnXml = findViewById(R.id.btnXML)


        btnKotlin.setOnClickListener {
            Toast.makeText(applicationContext, "This is Kotlin Button", Toast.LENGTH_SHORT).show()
        }

    }
    fun onClick(view: android.view.View){
        Toast.makeText(applicationContext,"This is XML Button", Toast.LENGTH_LONG).show()

    }

}