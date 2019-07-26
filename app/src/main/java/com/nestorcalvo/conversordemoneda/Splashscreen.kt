package com.nestorcalvo.conversordemoneda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(3000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
        background.start()
    }
}