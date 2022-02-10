package com.nabilah_19104025.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nabilah_19104025.modul5.databinding.ActivityForFragmentBinding

class ForFragmentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityForFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)

        if (fragment !is FirstFragment){
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mFirstFragment, FirstFragment::class.java.simpleName)
                .commit()
        }

    }
}