package com.example.placementpreparation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class companyname2 extends AppCompatActivity {


    Button tcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companyname2);




        tcs = (Button) findViewById(R.id.b1);



        tcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),interviewyoutube.class);
                startActivity(intent);


            }
        });



    }
}