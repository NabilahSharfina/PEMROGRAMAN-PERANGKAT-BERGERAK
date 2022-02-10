package com.nabilah_19104025.modul5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.nabilah_19104025.modul5.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            btnToSecondFragment.setOnClickListener {
                val nama = inputNamaSaya.text.toString()
                if (nama.isEmpty()){
                    inputNamaSaya.error = "Nama Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val nim = inputNimSaya.text.toString()
                if (nim.isEmpty()){
                    inputNimSaya.error = "Nim Tidak Boleh Kosong"
                    return@setOnClickListener
                }

                val mReadDataFragment = ReadDataFragment()
                val mBundle = Bundle()
                mBundle.putString(ReadDataFragment.EXTRA_NAMA, nama)
                mReadDataFragment.arguments = mBundle
                mReadDataFragment.nim = nim.toInt()

                val mFragmentManager = parentFragmentManager
                mFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, mReadDataFragment, ReadDataFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    companion object {

    }
}