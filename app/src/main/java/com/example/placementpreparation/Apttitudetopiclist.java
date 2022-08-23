package com.example.placementpreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Apttitudetopiclist extends AppCompatActivity {


    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apttitudetopiclist);






        lst=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("                          PROFIT & LOSS");
        arrayList.add("                          AVERAGE");
        arrayList.add("                          ALGEBRA");
        arrayList.add("                          PERCENTAGE");
        arrayList.add("                          RATIO & PROPORTION");
        arrayList.add("                          LCM & HCF");
        arrayList.add("                          PERMUTATION & COMBINATION");
        arrayList.add("                          TIME AND WORK");
        arrayList.add("                          INEQUALITY");
        arrayList.add("                          PARTNERSHIP");
        arrayList.add("                          HEIGHT & DISTANCE");
        arrayList.add("                          PROBLEM ON TRAIN");
        arrayList.add("                          SET & UNION");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lst.setAdapter(arrayAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(getApplicationContext(), AptitudetheoryVideo.class);
                    startActivity(intent);
                }


                if(position==1)
                {
                    Intent intent=new Intent(getApplicationContext(), AptitudetheoryVideo.class);
                    startActivity(intent);
                }


            }
        });






    }
}