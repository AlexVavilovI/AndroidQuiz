package com.example.androidquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityAnswerA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)
    }
    fun onClickAnswerExit(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

    }
}