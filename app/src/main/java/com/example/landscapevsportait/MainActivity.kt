package com.example.landscapevsportait

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val orientation = this.resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.d("Orient","Portait")
        }else{
            Log.d("Orient","Landscape")
        }


    }
}