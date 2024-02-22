package com.example.fourth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);

        // Display a Toast message
        String msg = getString(R.string.aditya);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

        // Set background drawable on the button
        btn.setBackgroundResource(R.drawable.abc);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.abc);  // Set the actual drawable resource


        // Display the string array in a Toast message
        String[] arr = getResources().getStringArray(R.array.raj);
        String arrayMessage = "";
        for (String item : arr) {
            arrayMessage += item + "\n";
        }
        Toast.makeText(this, arrayMessage, Toast.LENGTH_LONG).show();
    }
}
