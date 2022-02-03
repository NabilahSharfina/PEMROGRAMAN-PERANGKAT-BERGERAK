package com.nabilah_19104025.modul5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnProdi : Button
    private lateinit var inputProdi : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProdi = findViewById(R.id.btnProdi)
        inputProdi = findViewById(R.id.inputProdi)

        btnProdi.setOnClickListener{
            val namaProdi = inputProdi.text.toString()
            if (namaProdi.isEmpty()) {
                inputProdi.error = "Prodi Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val moveWithDataIntent = Intent(this@MainActivity, ReadDataActivity::class.java)
            moveWithDataIntent.putExtra(ReadDataActivity.EXTRA_PRODI, namaProdi)
            startActivity(moveWithDataIntent)
        }
    }
}