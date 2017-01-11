package com.example.helloworld

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import android.view.Gravity
import android.support.v7.app.AppCompatActivity
import android.os.PersistableBundle

class HelloWorldActivity extends AppCompatActivity {

    Button button

    override onCreate(Bundle bundle) {
        super.onCreate(bundle)

        setContentView(R.layout.main)

        button = findViewById(R.id.button) as Button

    }

    override onStart() {
        super.onStart()

        button.setOnClickListener[clicked]
    }

    def clicked (View v) {
        Toast.makeText(this, "Hello, world!", Toast.LENGTH_LONG).show()
    }

    override onStop() {
        super.onStop()

        button.onClickListener = null
    }

}

