package com.tech387.architecture.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tech387.architecture.BaseActivity
import com.tech387.architecture.R
import com.tech387.architecture.databinding.MainActBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: MainActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_act)
        binding.apply {
            viewModel = obtainViewModel(MainViewModel::class.java)
            lifecycleOwner = this@MainActivity
        }
    }

}