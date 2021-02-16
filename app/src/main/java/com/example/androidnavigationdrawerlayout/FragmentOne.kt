package com.example.androidnavigationdrawerlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_one.*


class FragmentOne : Fragment(R.layout.fragment_one) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            val action =  FragmentOneDirections.actionFragmentOneToFragmentOneOne()
            findNavController().navigate(action)
        }
    }

}