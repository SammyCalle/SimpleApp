package com.example.simpleapp.products

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.simpleapp.R
import com.example.simpleapp.databinding.FragmentLoginBinding
import com.example.simpleapp.databinding.FragmentProductsBinding
import com.example.simpleapp.login.LoginViewModel
import org.koin.android.ext.android.inject

class ProductsFragment : Fragment() {

    val _viewModel: ProductsViewModel by inject()
    private lateinit var binding: FragmentProductsBinding

    private var viewModelAdapter : ProductAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_products, container, false)
        binding.viewModel = _viewModel
        return binding.root
    }

}