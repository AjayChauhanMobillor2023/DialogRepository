package com.example.loadingdialoglibrary

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window

object LoadingDialog {

        private lateinit var dialog : Dialog

        fun initailDialogBox1(context : Context){
                dialog = Dialog(context)
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog.setCancelable(false)
                dialog.setContentView(R.layout.progress_bar_dialog)
                dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

        fun showDialog1(){
                dialog.show()
        }

        fun hideDialog1(){
                dialog.dismiss()
        }

//        fun showToast(context : Context,msg :String){
//                Log.e("testtest",msg)
//                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
//        }



}