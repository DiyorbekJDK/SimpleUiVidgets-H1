package com.example.homework_140922

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        changetext()
        search()


    }
    private fun changetext(){
        val radioGroup: RadioGroup=findViewById(R.id.radioGroup2)
        val mytext: TextView=findViewById(R.id.text1)
        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            when (id) {
                R.id.android -> {
                    mytext.text = "You have choosed Android"
                }
                R.id.ios -> {
                    mytext.text = "You have choosed IOS"
                }
                R.id.windows -> {
                    mytext.text = "You have choosed Windows"
                }
            }
        }
    }
    private fun search(){

    }


}
