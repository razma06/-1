package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }


    private fun init() {
        val generateNumber = NumberGenerator
        val mainText = Text

        generateNumber.setOnClickListener() {
            val theNumber = number()
            if (theNumber % 5 == 0 && theNumber > 0){

                mainText.text = ("Yes")
            }else{
                mainText.text = ("No")
            }

        }


    }
    private fun number():Int {
        val randomNumber:Int = (-100..100).random()
        return randomNumber
    }

}