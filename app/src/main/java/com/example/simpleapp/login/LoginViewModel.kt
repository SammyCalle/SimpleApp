package com.example.simpleapp.login

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.core.data.ProductsDataSource
import kotlinx.coroutines.launch
import com.example.core.data.dto.Result
import com.example.core.data.dto.response.authentication.AuthenticationResponse


class LoginViewModel(app: Application, private val dataSource: ProductsDataSource) :
    AndroidViewModel(app) {

    val id = MutableLiveData<String>()
    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val isLoading = MutableLiveData<Boolean>()

    init {
        isLoading.value = false
    }

    fun authenticateCredentials() {

        val clientCode = id.value.toString()
        val username = username.value.toString()
        val password = password.value.toString()
        viewModelScope.launch {
            isLoading.value = true
            val result = dataSource.getToken(
                clientCode = clientCode,
                username = username,
                password = password
            )
            when (result) {
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