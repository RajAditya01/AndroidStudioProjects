package com.example.life2cycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i("myFirstApp", "onCreate of activity2");
        // Toast.makeText(getApplicationContext(), "onCreate() invoked", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("myFirstApp", "onStartof activity2");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("myFirstApp", "onResume of activity2");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("myFirstApp", "onPause of activity2");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("myFirstApp", "onStop of activity2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("myFirstApp", "onDestroy of activity2");

    }

    public void Back(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}
