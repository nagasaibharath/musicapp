package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView tv1=(TextView)findViewById(R.id.textView13);
        TextView tv2=(TextView)findViewById(R.id.textView14);
        TextView tv3=(TextView)findViewById(R.id.textView15);
        TextView tv4=(TextView)findViewById(R.id.textView16);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main4Activity.this,MainplayActivity.class);
                intent.putExtra("songno",10);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main4Activity.this,MainplayActivity.class);
                intent.putExtra("songno",11);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main4Activity.this,MainplayActivity.class);
                intent.putExtra("songno",12);
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main4Activity.this,MainplayActivity.class);
                intent.putExtra("songno",13);
                startActivity(intent);
            }
        });
    }
}
