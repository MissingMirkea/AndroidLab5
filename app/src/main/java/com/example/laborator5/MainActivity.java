package com.example.laborator5;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.laborator5.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the button
        Button click = findViewById(R.id.button);
        click.setBackgroundColor(Color.RED);

        // Set click listener for the button
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define a new Intent for the second Activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Start the second Activity
                startActivity(intent);
            }
        });
    }
}