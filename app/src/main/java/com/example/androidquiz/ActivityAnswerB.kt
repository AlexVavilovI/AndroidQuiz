package com.example.androidquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityAnswerB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_b)
    }
    fun onClickAnswerExit1(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}