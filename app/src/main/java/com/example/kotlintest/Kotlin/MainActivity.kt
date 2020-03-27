package com.example.kotlintest.Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlintest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var test1 = TestClass("yoyo","isis")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(FIRSTCONST,test1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener{
            val intentToActivity2=Intent(this,Activity2::class.java)
            intentToActivity2.putExtra(FIRSTCONST,test1)
            startActivity(intentToActivity2)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        test1= savedInstanceState.getParcelable(FIRSTCONST)!!
    }


}
