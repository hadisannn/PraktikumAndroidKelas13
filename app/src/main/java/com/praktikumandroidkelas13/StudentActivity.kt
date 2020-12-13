package com.praktikumandroidkelas13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText as EditText1

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val etNpm = findViewById<EditText1>(R.id.etNpm)
        val etName = findViewById<EditText1>(R.id.etName)
        val etIpk = findViewById<EditText1>(R.id.etIpk)
        val etPhoneNumber = findViewById<EditText1>(R.id.etPhoneNumber)
        val btSend1 = findViewById<Button>(R.id.btSend1)

        btSend1.setOnClickListener {

            val npm = etNpm.text.toString()
            val name = etName.text.toString()
            val ipk = etIpk.text.toString().toDouble()
            val phoneNumber = etPhoneNumber.text.toString()

            val i = Intent( this, StudentResultActivity::class.java)
            i.putExtra("npm",npm)
            i.putExtra("name",name)
            i.putExtra("ipk",ipk)
            i.putExtra("phoneNumber",phoneNumber)
            startActivity(i)
        }
    }
}