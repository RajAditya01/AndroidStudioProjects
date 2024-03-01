package com.example.menubardemo;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PopUpMenuBarDemo extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menu_bar);

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(PopUpMenuBarDemo.this, btn1);
                getMenuInflater().inflate(R.menu.popup_menus, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.menu_one) {
                            Toast.makeText(PopUpMenuBarDemo.this, "Menu 1 clicked", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.menu_two) {
                            Toast.makeText(PopUpMenuBarDemo.this, "Menu 2 clicked", Toast.LENGTH_SHORT).show();
                        } else if (id == R.id.menu_three) {
                            Toast.makeText(PopUpMenuBarDemo.this, "Menu 3 clicked", Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}
