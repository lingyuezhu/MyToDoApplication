package com.example.mytodoapplication;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.media.Ringtone;
import android.media.RingtoneManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class GuessNumber extends AppCompatActivity {
    int result;

    static int getRandomNumber(int max, int min) {
        return (int)((Math.random() * (max - min)) + min);
    }

    public void makeToast(String str) {
        Toast.makeText(GuessNumber.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickFunction(View view)
    {
        int userGuessing;
        EditText variable = (EditText)findViewById(R.id.editId);userGuessing = Integer.parseInt(variable.getText().toString());
        if (userGuessing < result) {
            makeToast("往大一點的數字猜");

        }
        else if (userGuessing > result) {
            makeToast("往小一點的數字猜");
        }
        else {
            makeToast("鬧鐘關閉! 這是今天的行程");
            //跳轉到ToDoList
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            overridePendingTransition(0,0);
            onDestroy();
        }
    }

    @Override
    protected void onCreate(
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        int min = 0;
        int max = 9;
        result = getRandomNumber(min, max);

    }
}