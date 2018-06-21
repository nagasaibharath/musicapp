package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        Button b1 = (Button) findViewById(R.id.button2);
        Button b2=(Button)findViewById(R.id.button3);

        b1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main6Activity.this,Main7Activity.class);
                startActivity(intent);
            }
        });


        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main6Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
    }
