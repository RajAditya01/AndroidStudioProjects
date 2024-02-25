package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assuming you have two buttons in your layout with the IDs btnAlertDialog and btnProgressDialog
        Button btnAlertDialog = findViewById(R.id.button);
        Button btnProgressDialog = findViewById(R.id.button2);
    }

    public void Alert(View view) {
        // Handle positive button click
        AlertDialog.Builder myAlert = new AlertDialog.Builder(MainActivity.this);
        myAlert.setTitle("Exit");
        myAlert.setMessage("Are you sure ?");
        myAlert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        myAlert.show();
    }

    public void Progress(View view) {
        // Handle cancel button click
        ProgressDialog pd = new ProgressDialog(MainActivity.this);
        pd.setTitle("Downloading");
        pd.setMessage("Please wait! ");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        pd.show();
    }
}