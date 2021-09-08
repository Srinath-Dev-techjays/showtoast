package com.techjays.showtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techjays.toasti.Toasti

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toasti.showToast(this,"this is toast library")
    }
}