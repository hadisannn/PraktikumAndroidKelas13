package com.praktikumandroidkelas13

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val etNpm = findViewById<EditText>(R.id.etNpm)
        val etName = findViewById<EditText>(R.id.etName)
        val etIpk = findViewById<EditText>(R.id.etIpk)
        val etPhoneNumber = findViewById<EditText>(R.id.etPhoneNumber)
        val btSend1 = findViewById<Button>(R.id.btSend1)
        val btSend2 = findViewById<Button>(R.id.btSend2)
        val btDial = findViewById<Button>(R.id.btDial)

        btSend1.setOnClickListener {

            val npm = etNpm.text.toString()
            val name = etName.text.toString()

            var ipk = 0.0
            val ipkString = etIpk.text.toString()
            if(ipkString != ""){
                ipk = etIpk.text.toString().toDouble()
            }

            val phoneNumber = etPhoneNumber.text.toString()

            val i = Intent( this, StudentResultActivity::class.java)
            i.putExtra("npm",npm)
            i.putExtra("name",name)
            i.putExtra("ipk",ipk)
            i.putExtra("phoneNumber",phoneNumber)
            startActivity(i)
        }

        btSend2.setOnClickListener {

            val npm = etNpm.text.toString()
            val name = etName.text.toString()
            val ipk = etIpk.text.toString().toDouble()
            val phoneNumber = etPhoneNumber.text.toString()

            val student = Student(npm,name,ipk,phoneNumber)

            val iParcelable = Intent(this,StudentResultActivity::class.java)
            iParcelable.putExtra("student",student)
            startActivity(iParcelable)
        }

        btDial.setOnClickListener {
            val phoneNumber = etPhoneNumber.text.toString()
            val dialIntent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:$phoneNumber"))
            startActivity(dialIntent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.menu_language_option) {
            val i = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(i)
        }

        return super.onOptionsItemSelected(item)
    }
}