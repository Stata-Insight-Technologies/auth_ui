package com.example.waterdelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.waterdelivery.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    lateinit var mBinding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false).run {
            mBinding = FragmentWelcomeBinding.bind(this)
            this
        }
    }

}