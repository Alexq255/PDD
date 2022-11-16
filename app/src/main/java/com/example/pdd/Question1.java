package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }


    public void Button(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast= Toast.makeText(getApplicationContext(),"Ответ неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }


    public void True(View view) {
        view.setBackgroundColor(Color.parseColor("#70C041"));
        Intent intent;
        intent = new Intent(Question1.this, Question2.class);
        startActivity(intent);
    }

    public void False(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast= Toast.makeText(getApplicationContext(),"Ответ Неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }

    public void Fal(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast= Toast.makeText(getApplicationContext(),"Ответ Неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }
}