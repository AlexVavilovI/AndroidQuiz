package com.example.androidquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityAnsweC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answe_c)
    }
    fun onClickAnswerExit3(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}