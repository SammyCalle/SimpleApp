package com.example.simpleapp.products

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.data.ProductsDataSource
import com.example.core.data.dto.Result
import com.example.core.data.dto.response.authentication.AuthenticationResponse
import com.example.core.database.ProductsLocalDataSource
import kotlinx.coroutines.launch

class ProductsViewModel(
    app: Application,
    private val dataSource: ProductsDataSource,
    private val localdataSource: ProductsLocalDataSource
) : AndroidViewModel(app) {
    fun downloadProducts(token: String) {
        viewModelScope.launch {
            when (val result = dataSource.getProductsList(token = token)) {
                is Result.Success<*> -> {
                    val authentication = result.data as AuthenticationResponse
                    val token: String = authentication.records[0].token.toString()
                    dataSource.getProductsList(token = token)
                }
                is Result.Error -> {
                    Log.e("error", result.message.toString())
                }
            }
        }
    }
}