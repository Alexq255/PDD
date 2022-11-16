package com.example.pdd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }

    public void Exit(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Question3.this);
        builder.setTitle("Выход из приложения")
                .setCancelable(false)
                .setIcon(R.drawable.close)
                .setMessage("А точно выйти хочется?")
                .setPositiveButton("OK",

                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int id) {
                                finishAffinity();
                            }

                        })
                .setNegativeButton("Отмена",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int id) {

                            }
                        });

        AlertDialog alert =builder.create();
        alert.show();
    }
    }