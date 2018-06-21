package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        LinearLayout layout1=(LinearLayout)findViewById(R.id.ll1);
        LinearLayout layout2=(LinearLayout)findViewById(R.id.ll2);
        LinearLayout layout3=(LinearLayout)findViewById(R.id.ll3);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main7Activity.this,MainspActivity.class);
                startActivity(intent);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main7Activity.this,MainprahladActivity.class);
                startActivity(intent);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main7Activity.this,MainhhActivity.class);
                startActivity(intent);
            }
        });

    }
}
