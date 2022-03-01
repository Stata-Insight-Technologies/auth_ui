package com.example.waterdelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.apply {
            signUp.setOnClickListener {
                findNavController().navigate(R.id.action_welcomeFragment_to_signUpFragment)
            }

            login.setOnClickListener {
                findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
            }
        }
    }

}
//Feat[User controller]: Add welcome page with signin and signup button