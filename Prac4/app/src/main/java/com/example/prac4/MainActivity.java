package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        iv = findViewById(R.id.imageView);

        Intent recievedIntent = getIntent();
        String recievedAction = recievedIntent.getAction();
        String recievedType = recievedIntent.getType();

        assert recievedAction != null;
        if(recievedAction.equals(Intent.ACTION_SEND)){
            assert recievedType != null;
            if(recievedType.startsWith("text/")){
                iv.setVisibility(View.GONE);
                String recievedText = recievedIntent.getStringExtra(Intent.EXTRA_TEXT);
                if(recievedText!= null){
                    tv.setText(recievedText);
                }
            }
            else if(recievedType.startsWith("image/")){
                tv.setVisibility(View.GONE);
                Uri recievedUrl = recievedIntent.getParcelableExtra(Intent.EXTRA_STREAM);
                if(recievedUrl != null){
                    iv.setImageURI(recievedUrl);
                }
            }
        }
        else if(recievedAction.equals(Intent.ACTION_MAIN)){
            Toast.makeText(this, "directly click on the app", Toast.LENGTH_SHORT).show();
        }
    }
}