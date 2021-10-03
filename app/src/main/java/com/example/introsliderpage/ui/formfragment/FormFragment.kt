package com.example.introsliderpage.ui.formfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.introsliderpage.R
import com.example.introsliderpage.databinding.FragmentFormBinding

class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButtonClickListener()
    }

    private fun setButtonClickListener() {
        binding.btnSetName.setOnClickListener {
            val name = binding.etName.text.toString()
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        }

    }
}