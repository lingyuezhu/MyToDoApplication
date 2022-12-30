package com.example.mytodoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        BottomNavigationView bnView = findViewById(R.id.navigation);
        bnView.setSelectedItemId(R.id.Setting);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.Alarm:
                        startActivity(new Intent(getApplicationContext(),Alarm.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.ToDoList:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.Setting:
                        return true;
                }
                return false;
            }
        });
    }
}