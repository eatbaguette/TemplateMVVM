package com.example.baguette.templatemvvm.views

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.baguette.templatemvvm.AppApplication
import com.example.baguette.templatemvvm.R
import com.example.baguette.templatemvvm.databinding.ActivityMainBinding
import com.example.baguette.templatemvvm.viewmovel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainViewModel: MainViewModel

    val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as AppApplication).appComponent.inject(this)

        binding.viewModel = mainViewModel
    }
}
