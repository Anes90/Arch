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
            viewModel = obtainViewModel(MainViewModel::class.java) //viewModel varijabla inicijalizovana u layout-u (main_act.xml) i dodijeljen joj ViewModel (MainViewModel)
            lifecycleOwner = this@MainActivity //lifecycleOwner varijabla (dio lifecycle biblioteke) prati state activity-a i omogucava pauziranje ili zaustavljanje pruzanja
                                               //usluga povezivanja podataka te izbjegava null reference na activity
        }
    }

}