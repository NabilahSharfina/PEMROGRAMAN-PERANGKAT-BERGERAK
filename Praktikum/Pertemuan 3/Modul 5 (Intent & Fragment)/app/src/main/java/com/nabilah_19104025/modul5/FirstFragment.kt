package com.nabilah_19104025.modul5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    // FUNGSI BARU
    private lateinit var inputNamaSaya : EditText
    private lateinit var btnToSecondFragment : Button
    private lateinit var inputNimSaya : EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToSecondFragment.setOnClickListener{
            val namaSaya = inputNamaSaya.text.toString()
            if (namaSaya.isEmpty()) {
                inputNamaSaya.error = "Nama Tidak Boleh Kosong"
                return@setOnClickListener
            }

            val nimSaya = inputNimSaya.text.toString()
            if (nimSaya.isEmpty()) {
                inputNimSaya.error = "Nim Tidak Boleh Kosong"
                return@setOnClickListener
            }

            val mReadDataFragment = ReadDataFragment()
            val mBundle = Bundle()
            mBundle.putString(ReadDataFragment.EXTRA_NAMA, namaSaya)
            mReadDataFragment.arguments = mBundle
            mReadDataFragment.nim = nimSaya.toInt()
            val mFragmentManager = fragmentManager as FragmentManager
            mFragmentManager
                .beginTransaction()
                .replace(R.id.frame_container, mReadDataFragment, ReadDataFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}