package com.example.kotinarithmeticoperationusingfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.showInput);
        val number1 = findViewById<EditText>(R.id.number1);
        val number2 = findViewById<EditText>(R.id.number2);

        button.setOnClickListener{
            Toast.makeText(this,sum(number1.text.toString().toInt(),number2.text.toString().toInt()),Toast.LENGTH_LONG).show()
        }

    }
    fun sum(no1 : Int,no2:Int):String{
        return (no1 + no2).toString();
    }
}
