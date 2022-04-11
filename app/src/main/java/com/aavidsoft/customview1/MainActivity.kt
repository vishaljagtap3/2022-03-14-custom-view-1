package com.aavidsoft.customview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton

class MainActivity : AppCompatActivity() {

    lateinit var exitButton : ExitButton
    lateinit var chkExit : CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        chkExit.setOnCheckedChangeListener(
            object : CompoundButton.OnCheckedChangeListener {
                override fun onCheckedChanged(checkBox: CompoundButton?, isChecked: Boolean) {

                    exitButton.exitable = isChecked

                    /*if(isChecked) {
                        exitButton.exitable = true
                    }
                    else {
                        exitButton.exitable = false
                    }*/
                }
            }
        )

        /*exitButton = ExitButton(this)
        exitButton.text = "Exit Application"
        setContentView(exitButton)*/

    }

    private fun init() {
        chkExit = findViewById(R.id.chkExit)
        exitButton = findViewById(R.id.btnExit)
    }
}