package com.nikola.dagger2tutorial.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel

//Testing if a class that extends ViewModel can have parameters in it's constructor
class RandomViewModel(application: Application, someString: String): ViewModel() {

    var app = application
}