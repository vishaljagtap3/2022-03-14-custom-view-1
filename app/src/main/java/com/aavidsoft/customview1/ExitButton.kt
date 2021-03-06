package com.aavidsoft.customview1

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.Toast

@SuppressLint("AppCompatCustomView")
class ExitButton(context : Context, attributeSet: AttributeSet? = null) : Button(context, attributeSet) {

    var exitable = true

    init {
        setOnClickListener(
            object : OnClickListener {
                override fun onClick(v: View?) {

                    if(exitable) {
                        var exitAlertDialog: AlertDialog = getExitAlertDialog()
                        exitAlertDialog.show()
                    }
                    else {
                        Toast.makeText(context, "In mid of an operation...", Toast.LENGTH_LONG).show()
                    }

                }
            }
        )
    }


    private fun getExitAlertDialog() : AlertDialog {

        var exitDialogBuilder = AlertDialog.Builder(context)
        exitDialogBuilder.setMessage("Exit Application?")
        exitDialogBuilder.setPositiveButton(
            "Exit",
            object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    System.exit(0)
                }
            }
        )
        exitDialogBuilder.setNegativeButton(
            "No",
            object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    dialog?.dismiss()
                }
            }
        )

        return exitDialogBuilder.create()
    }

}