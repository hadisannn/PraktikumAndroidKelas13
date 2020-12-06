package com.praktikumandroidkelas13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)

        val btAdd = findViewById<Button>(R.id.btAdd)
        val btSub = findViewById<Button>(R.id.btSub)
        val btMul = findViewById<Button>(R.id.btMul)
        val btDiv = findViewById<Button>(R.id.btDiv)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btAdd.setOnClickListener {

            var doubleNumber1 = 0.0
            if(etNumber1.text.toString() != "")
                doubleNumber1 = etNumber1.text.toString().toDouble()

            var doubleNumber2 = 0.0
            if(etNumber2.text.toString() != "")
                doubleNumber2 = etNumber2.text.toString().toDouble()

            val doubleResult = doubleNumber1+doubleNumber2

            tvResult.text = doubleResult.toString()
        }
        btSub.setOnClickListener {

            var doubleNumber1 = 0.0
            if(etNumber1.text.toString() != "")
                doubleNumber1 = etNumber1.text.toString().toDouble()

            var doubleNumber2 = 0.0
            if(etNumber2.text.toString() != "")
                doubleNumber2 = etNumber2.text.toString().toDouble()

            val doubleResult = doubleNumber1-doubleNumber2

            tvResult.text = doubleResult.toString()
        }
        btMul.setOnClickListener {

            var doubleNumber1 = 0.0
            if(etNumber1.text.toString() != "")
                doubleNumber1 = etNumber1.text.toString().toDouble()

            var doubleNumber2 = 0.0
            if(etNumber2.text.toString() != "")
                doubleNumber2 = etNumber2.text.toString().toDouble()

            val doubleResult = doubleNumber1*doubleNumber2

            tvResult.text = doubleResult.toString()
        }
        btDiv.setOnClickListener {

            var doubleNumber1 = 0.0
            if(etNumber1.text.toString() != "")
                doubleNumber1 = etNumber1.text.toString().toDouble()

            var doubleNumber2 = 0.0
            if(etNumber2.text.toString() != "")
                doubleNumber2 = etNumber2.text.toString().toDouble()

            val doubleResult = doubleNumber1/doubleNumber2

            tvResult.text = doubleResult.toString()
        }

    }
}