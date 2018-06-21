package com.f20170209.musicapp;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainplayActivity extends AppCompatActivity {
    static MediaPlayer mp;
    AudioManager am;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainplay);

        Intent ii=getIntent();
        Bundle b=ii.getExtras();
        int k;
        k=(int) b.get("songno");

        TextView tv=(TextView)findViewById(R.id.textView19);

        Log.d("TAG", String.valueOf(""+k));

        Log.d(""+this,""+R.raw.bajagovindam);
        //Log.d("%%%", ""+MediaPlayer.create(this.getApplicationContext(),k));
//        mp = MediaPlayer.create(this.getApplicationContext(), R.raw.bajagovindam);
//        mp.start();

        i=k;

        am=(AudioManager) getSystemService(Context.AUDIO_SERVICE);

        switch (k)
        {
            case 1: {


                if(mp!=null)
                {
                    mp.release();
                    mp=null;
                }
//                else if(mp.isPlaying())
//                {
//                    mp.release();
//                    mp=null;
//                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.prabhupadkirtan);
                tv.setText("Prabhupada Kirtan");
                break;
            }

            case 2:{

                if(mp!=null)
                {
                    mp.release();
                    mp=null;
                }
//                else if(mp.isPlaying())
//                {
//                    mp.release();
//                    mp=null;
//                }
                mp=MediaPlayer.create(this.getApplicationContext(),R.raw.hhbbgovindmaharaj);
                tv.setText("HH BB Govind Maharaj Kirtan");
                break;
            }

            case 3:{
                if(mp!=null)
                {
                    mp.release();
                    mp=null;
                }
//                else if(mp.isPlaying())
//                {
//                    mp.release();
//                    mp=null;
//                }
                mp=MediaPlayer.create(this.getApplicationContext(),R.raw.prahladprkirtan);
                tv.setText("Prahlad Prabhu Kirtan");
                break;
            }

            case 4:{
                if(mp!=null)
                {
                    mp.release();
                    mp=null;
                }
                mp=MediaPlayer.create(this.getApplicationContext(),R.raw.sriradhegopala);
                tv.setText("Shri Radhe Gopala");
                break;
            }

            case 6: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.saahore);
                tv.setText("Saahore Bahubali");
                break;
            }

            case 7: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.okapraanam);
                tv.setText("Oka Praanam");
                break;
            }

            case 8: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.kannanidurinchara);
                tv.setText("Kanna Nidurinch Ra");
                break;
            }

            case 9: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.hamsanaava);
                tv.setText("Hamsa Naava");
                break;
            }

            case 10: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.nesthamanesthama);
                tv.setText("Nesthama Nesthama");
                break;
            }

            case 11: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.arunadhavala);
                tv.setText("Arunadhavala");
                break;
            }

            case 12: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.omkaram);
                tv.setText("Omkaaram");
                break;
            }

            case 13: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.shivashivashankara);
                tv.setText("Shiva Shiva Shankara");
                break;
            }

            case 14: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.mukundamukunda);
                tv.setText("Mukunda Mukunda Krishna");
                break;
            }

            case 15: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.rayinimaatram);
                tv.setText("Rayini Maatram");
                break;
            }

            case 16: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.lokanayakuda);
                tv.setText("Lokanayakuda");
                break;
            }

            case 17: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.katukaki);
                tv.setText("Katukaki");
                break;
            }



            case 18: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.prabhupadkirtan);
                tv.setText("prabhupada kirtan");
                break;
            }

            case 19: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.prahladprkirtan);
                tv.setText("prahladprkirtan");
                break;
            }

            case 20: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.prahaladprkirtan2);
                tv.setText("prahaladprkirtan2");
                break;
            }

            case 21: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.prahladprkirtan);
                tv.setText("prahladprkirtan");
                break;
            }

            case 22: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.hhbbgovindmaharaj);
                tv.setText("hh bb govind maharaj");
                break;
            }

            case 5: {
                if(mp!=null)
                {
                    mp.stop();
                }
                mp = MediaPlayer.create(this.getApplicationContext(), R.raw.sriradhegopala);
                tv.setText("shri radhe gopala");
                break;
            }
        }

        mp.start();


        SeekBar sb=(SeekBar)findViewById(R.id.seekBar);

        int currentvolume=am.getStreamVolume(AudioManager.STREAM_MUSIC);
        int maxvolume=am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

        sb.setMax(maxvolume);
        sb.setProgress(currentvolume);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                am.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }



            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    boolean flag=true;
    public void changeimage1(View v)
    {
        if(flag) {
            ImageView iv = (ImageView) findViewById(R.id.imageView5);
            iv.setImageResource(R.drawable.playbutton);
            mp.pause();
            flag=false;
        }
        else{
            ImageView iv = (ImageView) findViewById(R.id.imageView5);
            iv.setImageResource(R.drawable.pausebutton);
            mp.start();
            flag=true;
        }


    }

    public void increment(View v)
    {
        i++;
        Intent intent=new Intent(MainplayActivity.this,MainplayActivity.class);
        intent.putExtra("songno",i);
        startActivity(intent);
    }

    public void decrement(View v)
    {
        i--;
        Intent intent=new Intent(MainplayActivity.this,MainplayActivity.class);
        intent.putExtra("songno",i);
        startActivity(intent);
    }

//    @Override
//   public void onBackPressed() {
//        super.onBackPressed();
//        mp.release();
//        mp = null;
//    }
}
