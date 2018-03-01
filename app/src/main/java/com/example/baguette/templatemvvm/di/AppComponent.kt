package com.example.baguette.templatemvvm.di

import com.example.baguette.templatemvvm.views.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AppModule::class])
interface AppComponent {
    fun inject(target: MainActivity)
}
