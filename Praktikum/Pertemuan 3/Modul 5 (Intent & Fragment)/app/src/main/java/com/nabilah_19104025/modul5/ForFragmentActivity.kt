package com.nabilah_19104025.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ForFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragment)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)
        if (fragment !is FirstFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + FirstFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mFirstFragment, FirstFragment::class.java.simpleName)
                .commit()
        }
    }
}