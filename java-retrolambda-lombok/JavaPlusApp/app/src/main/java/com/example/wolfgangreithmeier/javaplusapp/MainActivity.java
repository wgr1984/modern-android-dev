package com.example.wolfgangreithmeier.javaplusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import lombok.val;

import static com.example.wolfgangreithmeier.javaplusapp.Utils.cast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
    }

    @Override
    protected void onStart() {
        super.onStart();

        button.setOnClickListener(this::clicked);
    }

    @Override
    protected void onStop() {
        super.onStop();

        button.setOnClickListener(null);
    }

    private void clicked(View v) {

        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);

        Toast.makeText(this, foo, Toast.LENGTH_SHORT).show();
    }
}
