package com.example.core.data.remote

import com.example.core.data.ProductsDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.example.core.data.dto.Result


class ProductsRepository(private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO) :
    ProductsDataSource {

    override suspend fun getToken(clientCode: String, username: String, password: String) =
        withContext(ioDispatcher) {
            TokenGeneration.code = clientCode
            return@withContext try {
                Result.Success(
                    TokenGeneration.apiService.verifyUser(
                        clientCode = clientCode,
                        username = username,
                        password = password
                    )
                )
            } catch (ex: Exception) {
                Result.Error(ex.localizedMessage)
            }
        }

    override suspend fun getProductsList(jwtToken: String) = withContext(ioDispatcher) {
        return@withContext try {
            Result.Success(
                PimConnection.apiService.getProducts(jwt = jwtToken)
            )
        } catch (ex: Exception) {
            Result.Error(ex.localizedMessage)
        }
    }
}