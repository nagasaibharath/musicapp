package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainprahladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainprahlad);

        TextView tv1=(TextView)findViewById(R.id.textView28);
        TextView tv2=(TextView)findViewById(R.id.textView29);
        TextView tv3=(TextView)findViewById(R.id.textView30);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainprahladActivity.this,MainplayActivity.class);
                intent.putExtra("songno",19);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainprahladActivity.this,MainplayActivity.class);
                intent.putExtra("songno",20);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainprahladActivity.this,MainplayActivity.class);
                intent.putExtra("songno",21);
                startActivity(intent);
            }
        });
    }
}
