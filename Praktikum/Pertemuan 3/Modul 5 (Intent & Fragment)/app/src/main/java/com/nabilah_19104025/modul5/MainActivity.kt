package com.nabilah_19104025.modul5

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    // Deklarasi atribut (id xml)
    // private lateinit var btnProdi : Button
    // private lateinit var inputProdi : EditText
    private lateinit var inputProdi : EditText
    private lateinit var btnProdi : Button
    private lateinit var btnCallBrowser : Button
    private lateinit var btnCallCamera : Button
    private lateinit var inputPhoneNumber : EditText
    private lateinit var btnCallPhone : Button
    private lateinit var btnFragment : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // btnProdi = findViewById(R.id.btnProdi)
        // inputProdi = findViewById(R.id.inputProdi)

        // Move acitivity menggunakan bundle
        /*
            btnProdi.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("data1", inputProdi.text.toString())

                val intent = Intent(this, ReadDataActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
         */

        // Inisiasi find view
        inputProdi = findViewById(R.id.inputProdi)
        inputPhoneNumber = findViewById(R.id.inputPhoneNumber)
        btnProdi = findViewById(R.id.btnProdi)
        btnCallBrowser = findViewById(R.id.btnCallBrowser)
        btnCallCamera = findViewById(R.id.btnCallCamera)
        btnCallPhone = findViewById(R.id.btnCallPhone)
        btnFragment = findViewById(R.id.btnFragment)

        // Menambahkan fungsi untuk button prodi
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

        // Membuka web SE ITTP
        btnCallBrowser.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://se.ittelkom-pwt.ac.id/")
            startActivity(intent)
        }

        // Menjalankan kamera perangkat
        btnCallCamera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        // Menjalankan call phone perangkat
        btnCallPhone.setOnClickListener{
            val phoneNumber = inputPhoneNumber.getText()

            if (phoneNumber.isEmpty()) {
                inputPhoneNumber.error = "Nomor Telepon Tidak Boleh Kosong"
                return@setOnClickListener
            }

            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:" + phoneNumber)
            startActivity(intent)
        }

        btnFragment.setOnClickListener{
            val intent = Intent(this, ForFragmentActivity::class.java)
            startActivity(intent)
        }

        // Dijalankan ketika activity MainActivity.kt pertama kali dibuka
        setupPermissions()
    }

    // Menampilkan user permission
    val CALL_REQUEST_CODE = 100
    @SuppressLint("MissingPermission")

    private fun setupPermissions() {
        val permission = ContextCompat.checkSelfPermission(this,
            Manifest.permission.CALL_PHONE)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.CALL_PHONE),
                CALL_REQUEST_CODE)
        }
    }
}