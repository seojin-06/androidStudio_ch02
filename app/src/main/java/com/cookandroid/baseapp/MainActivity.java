package com.cookandroid.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        EditText edit = (EditText) findViewById(R.id.test_edit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = edit.getText().toString();
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_url = edit.getText().toString();
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(text_url));
                startActivity(mIntent);
            }
        });

        button1.setBackgroundColor(Color.CYAN);
        button2.setBackgroundColor(Color.CYAN);

        RadioButton radioButton1;
        RadioButton radioButton2;

        radioButton1 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.image01);
            }
        });

        radioButton2 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.image02);
            }
        });
    }
}