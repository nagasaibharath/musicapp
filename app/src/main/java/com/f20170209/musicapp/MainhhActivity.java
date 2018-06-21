package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainhhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhh);

        TextView tv1=(TextView)findViewById(R.id.textView27);
        TextView tv2=(TextView)findViewById(R.id.textView31);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainhhActivity.this,MainplayActivity.class);
                intent.putExtra("songno",22);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainhhActivity.this,MainplayActivity.class);
                intent.putExtra("songno",23);
                startActivity(intent);
            }
        });
    }
}
