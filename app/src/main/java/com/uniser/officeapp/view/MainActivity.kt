package com.uniser.officeapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uniser.officeapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_fragment)
    }
}