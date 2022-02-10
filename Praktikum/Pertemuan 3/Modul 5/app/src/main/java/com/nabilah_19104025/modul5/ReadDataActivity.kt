package com.nabilah_19104025.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nabilah_19104025.modul5.databinding.ActivityReadDataBinding

class ReadDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        binding.tvProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
}