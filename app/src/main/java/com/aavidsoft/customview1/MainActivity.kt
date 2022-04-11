package com.aavidsoft.customview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var exitButton : ExitButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*exitButton = ExitButton(this)
        exitButton.text = "Exit Application"
        setContentView(exitButton)*/

    }
}