package com.example.androidquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickAnswerA(view: View){
        val intent =Intent(this,ActivityAnswerA::class.java)
        startActivity(intent)

    }
    fun onClickAnswerB(view: View){
        val intent =Intent(this,ActivityAnswerB::class.java)
        startActivity(intent)
    }
    fun onClickAnswerC(view: View){
        val intent =Intent(this,ActivityAnsweC::class.java)
        startActivity(intent)
    }
    fun onClickAnswerD(view: View){
        val intent =Intent(this,MainActivity::class.java)
        startActivity(intent)

    }

}