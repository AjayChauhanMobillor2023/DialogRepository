package com.example.dialoglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dialoglibrary.databinding.ActivityMainBinding
import com.example.loadingdialoglibrary.LoadingDialog
import kotlinx.coroutines.Delay

class MainActivity : AppCompatActivity() {

        lateinit var binding : ActivityMainBinding

        override fun onCreate(savedInstanceState : Bundle?) {
                super.onCreate(savedInstanceState)

                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)

                LoadingDialog.initailDialogBox(this@MainActivity)

                binding.btnClick.setOnClickListener {
                        LoadingDialog.apply {

                                showDialog()

                                Handler().postDelayed({
                                        hideDialog()
                                },5000)

                        }
                }
        }
}