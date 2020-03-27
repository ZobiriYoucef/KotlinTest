package com.example.kotlintest.Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlintest.R

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class Activity2 : AppCompatActivity() {

    //lateinit var test1 :TestClass




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        //test1=intent.getParcelableExtra(FIRSTCONST)

        val test2=intent.getParcelableExtra<TestClass>(FIRSTCONST)

        Toast.makeText(this,test2.Tesxt1,Toast.LENGTH_LONG).show()
    }


}
