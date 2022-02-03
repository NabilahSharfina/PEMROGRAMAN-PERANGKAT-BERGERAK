package com.nabilah_19104025.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReadDataActivity : AppCompatActivity() {
    private lateinit var lblProdiSaya : TextView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_data)

        // Inisiasi view
        lblProdiSaya = findViewById(R.id.lblProdiSaya)

        //  if(intent.extras != null){
        //      val bundle = intent.extras
        //      lblProdiSaya.setText(bundle.getString("data1"))
        //  }else{
        //      lblProdiSaya.setText(intent.getStringExtra("data1"))
        //  }
        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
}