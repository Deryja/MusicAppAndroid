package com.example.courseerablokk4musikkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

/*
2 super viktige ting å huske:

1. I acitivty delen, for å bestemme hvor knappene osv skal være, må man fjerne det som står ved siden av xmlns og
bytte det ut med RelativeLayout

2. For å fjerne den øverste store blokken der navnet til appen står på brukergrensesnittet, og eventuelt
for å skifte bakgrunnsfarge på knapper osv, så er det viktig å gå inn på themes.xml og fjerne
det som står der i parent i style delen, og bytte det ut med: parent="Theme.AppCompat.NoActionBar"
 */




public class MainActivity extends AppCompatActivity {

    MediaPlayer hadalAhbak; //Steg 3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hadalAhbak = MediaPlayer.create(this, R.raw.piano); //Fortsettelse på steg 3 (selve filnavnet)

        //Steg 4 --> fortsettelse
        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                hadalAhbak.setLooping(isChecked);
            }
        });

    }

    public void playMusic (View v){//Steg 1

        hadalAhbak.start(); //Steg 4


    }


    public void pauseMusic(View v){
     //Steg 1 --> Nå går vi til New--> Android resource directory--> CountryCode og skriver raw i directory name og resource type
      //Steg 2: Nå kopierer vi mp3 filen og limer inn i raw


        if (hadalAhbak.isPlaying()) //Steg 4 --> Nå legger vi til loop med "Switch"
            hadalAhbak.pause();

    }
}