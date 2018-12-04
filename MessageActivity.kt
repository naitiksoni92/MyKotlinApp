package com.example.soninait.mykotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MessageActivity : AppCompatActivity() {

    val testStringVal by lazy {"this is testStringVal value" }
    var testIntegerVar = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        Log.d("TAG", "val1=: $testStringVal")
        Log.d("MessageActivity", "val2=: $testIntegerVar")
        displayGreet()
    }

    fun displayGreet(){
        println("Good morning!")
    }
}
