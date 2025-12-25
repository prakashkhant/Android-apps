package com.example.cals_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val fruits = arrayOf("Apple","Banana","Cherry")
val btnDis : Button = findViewById(R.id.btnDis)
        val btnDel : Button = findViewById(R.id.btnDel)
        val result : TextView = findViewById(R.id.result)
        btnDis.setOnClickListener {
            result.text = "Fruits : ${fruits.joinToString(separator = ",")}"
        }
        btnDel.setOnClickListener {
            result.text = ""
        }
    }

}