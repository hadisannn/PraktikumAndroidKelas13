package com.praktikumandroidkelas13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StudentResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_result)

        val tvNpm: TextView = findViewById<TextView>(R.id.tvNpm)
        val tvName: TextView = findViewById<TextView>(R.id.tvName)
        val tvIpk: TextView = findViewById<TextView>(R.id.tvIpk)
        val tvPhoneNumber: TextView = findViewById<TextView>(R.id.tvPhoneNumber)

        val npm: String? = intent.getStringExtra("npm")
        val name: String? = intent.getStringExtra("name")
        val ipk: Double = intent.getDoubleExtra("ipk", 0.0)
        val phoneNumber: String? = intent.getStringExtra("phoneNumber")

        tvNpm.text = npm
        tvName.text = name
        tvIpk.text = ipk.toString()
        tvPhoneNumber.text = phoneNumber

    }
}