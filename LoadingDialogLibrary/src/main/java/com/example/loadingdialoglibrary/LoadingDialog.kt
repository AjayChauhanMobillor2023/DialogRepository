package com.example.loadingdialoglibrary

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.Window
import android.widget.Toast

object LoadingDialog {

        lateinit var dialog : Dialog

        fun initailDialogBox(context : Context){
                dialog = Dialog(context)
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog.setCancelable(false)
                dialog.setContentView(R.layout.progress_bar_dialog)
                dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

        fun showDialog(){
                dialog.show()
        }

        fun hideDialog(){
                dialog.dismiss()
        }

        fun showToast(context : Context,msg :String){
                Log.e("testtest",msg)
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }



}