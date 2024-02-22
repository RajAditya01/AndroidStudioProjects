package com.example.life2cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("myFirstApp", "Create1");
//        Toast.makeText(getApplicationContext(),"onCreate() invoked",Toast.LENGTH_SHORT).show

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("myFirstApp", "Start1");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("myFirstApp", "Resume1");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("myFirstApp", "Pause1");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("myFirstApp", "Stop1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("myFirstApp", "Destroy1");

    }
    public void Next(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}