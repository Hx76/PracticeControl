package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt;
    private TextView tv;
    private ImageView imageView;
    private ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.edittext);
        Button button = findViewById(R.id.button);
        tv = findViewById(R.id.textview);
        imageView = findViewById(R.id.image);
        bar = findViewById(R.id.bar);
        bar.setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("CAREFULLY!!!");
                dialog.setMessage("It's a jok!");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
                String str = edt.getText().toString();
                tv.setText(str);
                imageView.setImageResource(R.drawable.photo);
                //if (bar.getVisibility()==View.VISIBLE)
                  //  bar.setVisibility(View.GONE);
               // else
                  bar.setVisibility(View.VISIBLE);
                  int progress = bar.getProgress();
                  progress += 10;
                  bar.setProgress(progress);
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("HAHAHA");
                progressDialog.setMessage("wait a monment");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
        });
    }

}
