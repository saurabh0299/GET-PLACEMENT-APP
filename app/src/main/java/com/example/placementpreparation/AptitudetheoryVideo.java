package com.example.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AptitudetheoryVideo extends AppCompatActivity {

    Button THEORY,VIDEO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitudetheory_video);






        THEORY = (Button) findViewById(R.id.t1);



        THEORY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),AptitudeTHEORY.class);
                startActivity(intent);


            }
        });


        VIDEO = (Button) findViewById(R.id.t2);



        VIDEO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),AptitudeVIDEO.class);
                startActivity(intent);


            }
        });







    }
}