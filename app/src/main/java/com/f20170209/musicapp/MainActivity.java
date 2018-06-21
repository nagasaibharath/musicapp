package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout layout1 = (LinearLayout) findViewById(R.id.ll1);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.ll2);
        LinearLayout layout3 = (LinearLayout) findViewById(R.id.ll3);

        layout1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent);
            }
        });

    }


}
