package com.nikola.dagger2tutorial

import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {
    private val logTag: String = "Testing AuthActivity"

    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        requestManager
            .load(R.drawable.logo)
            .into(login_logo)
    }
}
