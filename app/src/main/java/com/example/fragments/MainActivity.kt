package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.fragments.fragments.frag1
import com.example.fragments.fragments.frag2

class MainActivity : AppCompatActivity(), Com1 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)

        val frag1 = frag1()
        val frag2 = frag2()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frag_contain, frag1)
            commit()
        }

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag_contain, frag1)
                addToBackStack(null)
                commit()
            }
        }

        btn2.setOnClickListener {
            val et1 = findViewById<EditText>(R.id.edit1)
            frag2.arguments = passTheData(et1.text.toString())
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag_contain, frag2)
                addToBackStack(null)
                commit()
            }
        }

    }

    override fun passTheData(PassingText: String): Bundle {
        val bundle = Bundle()
        bundle.putString("txtAtoB", PassingText)
        return bundle
    }

}