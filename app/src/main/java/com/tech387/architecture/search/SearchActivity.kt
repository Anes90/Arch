package com.tech387.architecture.search

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tech387.architecture.BaseActivity
import com.tech387.architecture.R
import com.tech387.architecture.databinding.SearchActBinding
import com.tech387.architecture.main.MainViewModel

class SearchActivity
: BaseActivity() {

    private lateinit var binding: SearchActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.search_act)
        binding.apply {
            viewModel =
                obtainViewModel(MainViewModel::class.java)
            lifecycleOwner = this@SearchActivity
        }
    }
}
