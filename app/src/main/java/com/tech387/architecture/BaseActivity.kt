package com.tech387.architecture

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


abstract class BaseActivity : AppCompatActivity() {

    protected fun <T : ViewModel> obtainViewModel(viewModelClass: Class<T>) =
        ViewModelProvider(
            this,
            ViewModelFactory(application, this)
        ).get(viewModelClass)

}