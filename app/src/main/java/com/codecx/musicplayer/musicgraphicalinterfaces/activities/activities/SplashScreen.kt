package com.musicgraphicalinterfaces.activities

import android.os.Bundle
import com.R
import com.baseclasses.BaseActivity
import com.databinding.ActivitySplashBinding
import com.utils.startNewActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Suppress("DEPRECATION")
class SplashScreen : BaseActivity(R.layout.activity_splash) {
    private val binding get() = _binding as ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000L)
            startNewActivity<MainActivity>(MainActivity::class.java, true)
        }
    }
}