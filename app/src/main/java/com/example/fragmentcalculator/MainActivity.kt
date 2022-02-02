package com.example.fragmentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Fragmentone = supportFragmentManager.findFragmentById(R.id.Fragment_top)
        val Fragmenttwo = supportFragmentManager.findFragmentById(R.id.Fragment_bottom)

        val fragment = FragmentPad.newInstance()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_button_pad, fragment)
            .commit()
        val secondfragment = ResultFragment.newInstance()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_result_view, secondfragment)
            .commit()
    }
}