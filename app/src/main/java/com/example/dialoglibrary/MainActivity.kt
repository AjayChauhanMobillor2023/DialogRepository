package com.example.dialoglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dialoglibrary.databinding.ActivityMainBinding
import com.example.loadingdialoglibrary.LoadingDialog

class MainActivity : AppCompatActivity() {

        lateinit var binding : ActivityMainBinding

        override fun onCreate(savedInstanceState : Bundle?) {
                super.onCreate(savedInstanceState)

                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)

                LoadingDialog.initailDialogBox1(this@MainActivity)

                binding.btnClick.setOnClickListener {
                        LoadingDialog.apply {

                                showDialog1()

                                Handler().postDelayed({
                                        hideDialog1()
                                },5000)

                        }
                }
        }
}