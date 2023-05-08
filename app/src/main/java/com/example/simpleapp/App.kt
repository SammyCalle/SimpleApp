package com.example.simpleapp

import android.app.Application
import com.example.core.data.ProductsDataSource
import com.example.simpleapp.login.LoginViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        /**
         * Koin set up for dependancy injection
         */
        val myModule = module {
            viewModel{
                LoginViewModel(
                    get(),
                    get() as ProductsDataSource
                )
            }
        }

        startKoin {
            androidContext(this@App)
            modules(listOf(myModule))
        }
    }
}