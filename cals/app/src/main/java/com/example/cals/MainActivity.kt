package com.example.cals

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.edtNum1)
        val num2 = findViewById<EditText>(R.id.edtNum2)
        val result = findViewById<TextView>(R.id.txtResult)

        val add = findViewById<Button>(R.id.btnAdd)
        val sub = findViewById<Button>(R.id.btnSub)
        val mul = findViewById<Button>(R.id.btnMul)
        val div = findViewById<Button>(R.id.btnDiv)

        add.setOnClickListener {
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            result.text = (a + b).toString()
        }

        sub.setOnClickListener {
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            result.text = (a - b).toString()
        }

        mul.setOnClickListener {
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            result.text = (a * b).toString()
        }

        div.setOnClickListener {
            val a = num1.text.toString().toInt()
            val b = num2.text.toString().toInt()
            result.text = (a / b).toString()
        }
    }
}
