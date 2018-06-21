package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView tv1=(TextView)findViewById(R.id.textView20);
        TextView tv2=(TextView)findViewById(R.id.textView21);
        TextView tv3=(TextView)findViewById(R.id.textView22);
        TextView tv4=(TextView)findViewById(R.id.textView23);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,MainplayActivity.class);
                intent.putExtra("songno",14);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,MainplayActivity.class);
                intent.putExtra("songno",15);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,MainplayActivity.class);
                intent.putExtra("songno",16);
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main5Activity.this,MainplayActivity.class);
                intent.putExtra("songno",17);
                startActivity(intent);
            }
        });
    }

}


