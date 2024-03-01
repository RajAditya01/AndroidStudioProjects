package com.example.menubardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();

        if (item_id == R.id.option_one) {
            Toast.makeText(this, "Option 1 clicked!!", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.option_two) {
            Toast.makeText(this, "Option 2 clicked!!", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.option_three) {
            Toast.makeText(this, "Option 3 clicked!!", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}






























