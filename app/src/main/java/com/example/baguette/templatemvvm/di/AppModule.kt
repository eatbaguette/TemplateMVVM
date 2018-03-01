package com.example.baguette.templatemvvm.di

import android.content.Context
import com.example.baguette.templatemvvm.AppApplication
import com.example.baguette.templatemvvm.viewmovel.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(private val app: AppApplication) {
    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideMainViewModel(): MainViewModel = MainViewModel()
}
