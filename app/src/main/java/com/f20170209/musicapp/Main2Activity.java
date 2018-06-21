package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView tv1=(TextView)findViewById(R.id.textView2);
        TextView tv2=(TextView)findViewById(R.id.textView3);
        TextView tv3=(TextView)findViewById(R.id.textView4);
        TextView tv4=(TextView)findViewById(R.id.textView7);
        TextView tv5=(TextView)findViewById(R.id.textView17);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainplayActivity.class);
                intent.putExtra("songno",1);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainplayActivity.class);
                intent.putExtra("songno",2);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainplayActivity.class);
                intent.putExtra("songno",3);
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainplayActivity.class);
                intent.putExtra("songno",4);
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainplayActivity.class);
                intent.putExtra("songno",5);
                startActivity(intent);
            }
        });
    }
}

