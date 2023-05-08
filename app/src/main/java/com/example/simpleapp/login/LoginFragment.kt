package com.example.simpleapp.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simpleapp.R
import com.example.simpleapp.databinding.FragmentLoginBinding
import org.koin.android.ext.android.inject
import androidx.databinding.DataBindingUtil

class LoginFragment : Fragment() {
    val _viewModel: LoginViewModel by inject()
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.viewModel = _viewModel
        return binding.root
    }



}