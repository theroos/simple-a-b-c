package com.example.basicab

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        val edittextA = findViewById<EditText>(R.id.edittext_a)
        val edittextB = findViewById<EditText>(R.id.edittext_b)
        val buttonadd = findViewById<Button>(R.id.button_add)
        val textviewC = findViewById<TextView>(R.id.textview_c)


        buttonadd.setOnClickListener(View.OnClickListener {
                val a = edittextA.text.toString().toIntOrNull()?:0
                val b = edittextB.text.toString().toIntOrNull()?:0

                val c = a+b

                textviewC.text = "Added Result $c"
            }
        )
    }
}