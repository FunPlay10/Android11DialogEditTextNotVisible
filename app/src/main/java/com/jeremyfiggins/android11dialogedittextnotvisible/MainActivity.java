package com.jeremyfiggins.android11dialogedittextnotvisible;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = getLayoutInflater().inflate(R.layout.dialog_contents, null);
        new AlertDialog.Builder(this).setView(view).create().show();
    }
}