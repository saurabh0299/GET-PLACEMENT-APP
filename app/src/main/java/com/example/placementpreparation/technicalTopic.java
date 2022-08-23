package com.example.placementpreparation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class technicalTopic extends AppCompatActivity {

    Button e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_topic);

        e=(Button)findViewById(R.id.bu1);



        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TECHEASY.class);
                startActivity(intent);


            }
        });
    }
}