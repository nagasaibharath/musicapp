package com.f20170209.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainspActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsp);

        TextView tv=(TextView)findViewById(R.id.textView26);

        tv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainspActivity.this,MainplayActivity.class);
                intent.putExtra("songno",18);
                startActivity(intent);
            }
        });
    }
}
