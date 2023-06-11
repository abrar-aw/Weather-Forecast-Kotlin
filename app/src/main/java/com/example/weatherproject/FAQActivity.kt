package com.example.weatherproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FAQActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faqactivity)

     /*   val abtusimageButton = findViewById<Button>(R.id.abtusimageButton);

        abtusimageButton.setOnClickListener{
                val intent = Intent(this,AboutUsActivity::class.java)
                startActivity(intent)
        }*/
    }


}