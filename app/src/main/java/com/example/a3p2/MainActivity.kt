package com.example.a3p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Event", "onCreate() Called")


        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textView).setText("Hello")
            findViewById<EditText>(R.id.editText).setText("Hello")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Event", "onStart() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Event", "onRestart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Event", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Event", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Event", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Event", "onDestroy() called")
    }
}