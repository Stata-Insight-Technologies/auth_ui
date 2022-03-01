package com.example.waterdelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.waterdelivery.databinding.FragmentLoginBinding
import com.example.waterdelivery.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    lateinit var mBinding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false).run {
            mBinding = FragmentSignUpBinding.bind(this)
            this
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.apply {
            arrowBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

}