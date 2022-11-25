package com.example.hanstagram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    override fun oncreate(savedINstanceState : Bundle?){
        super .onCreate(savedINstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding,root)

        binding.login.setOnClickListener
    }
}