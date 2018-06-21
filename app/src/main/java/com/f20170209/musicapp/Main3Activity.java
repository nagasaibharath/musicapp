package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView tv1=(TextView)findViewById(R.id.textView9);
        TextView tv2=(TextView)findViewById(R.id.textView10);
        TextView tv3=(TextView)findViewById(R.id.textView11);
        TextView tv4=(TextView)findViewById(R.id.textView12);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main3Activity.this,MainplayActivity.class);
                intent.putExtra("songno",6);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main3Activity.this,MainplayActivity.class);
                intent.putExtra("songno",7);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main3Activity.this,MainplayActivity.class);
                intent.putExtra("songno",8);
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main3Activity.this,MainplayActivity.class);
                intent.putExtra("songno",9);
                startActivity(intent);
            }
        });
    }
}

