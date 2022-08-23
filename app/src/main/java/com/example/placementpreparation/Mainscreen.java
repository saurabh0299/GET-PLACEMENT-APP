package com.example.placementpreparation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mainscreen extends AppCompatActivity {

    Button aptitude,technical,interview,syllabus;
    TextView lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);


        aptitude = (Button) findViewById(R.id.a1);
        technical = (Button) findViewById(R.id.t1);
        syllabus = (Button) findViewById(R.id.ss1);
        interview= (Button)findViewById(R.id.i1);

        lg=(TextView) findViewById(R.id.lg1);

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),login.class);
                startActivity(intent);


            }
        });




        aptitude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),companyname.class);
                startActivity(intent);


            }
        });


        technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),technicalTopic.class);
                startActivity(intent);


            }
        });



        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),placemensyllabus.class);
                startActivity(intent);


            }
        });


        interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),companyname2.class);
                startActivity(intent);


            }
        });










    }
}