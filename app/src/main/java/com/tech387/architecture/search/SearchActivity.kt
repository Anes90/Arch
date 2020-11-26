package com.tech387.architecture.search

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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
        //Added by Anes ----------------------------------
        val editText = binding.searchEditText
        editText.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                var myUserInput: String = editText.text.toString().trim()
                binding.viewModel?.filterProfile(myUserInput)
            }
        })
        //Added by Anes ----------------------------------
    }
}
