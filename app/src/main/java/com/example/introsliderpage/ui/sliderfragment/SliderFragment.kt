package com.example.introsliderpage.ui.sliderfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.introsliderpage.R
import com.example.introsliderpage.databinding.FragmentSliderBinding


class SliderFragment (val title: String,
                      val desc: String,
                      val imgUrlSlider: String,)
    : Fragment() {
    private lateinit var binding : FragmentSliderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //inflate the layout for this fragment
        binding = FragmentSliderBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setDataSlider()
    }

    private fun setDataSlider() {
        binding.tvTitle.text = title
        binding.tvDesc.text = desc
        context?.let {
            Glide.with(it)
                .load(imgUrlSlider)
                .into(binding.ivIntro)
        }
    }

}