package com.example.placementpreparation;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;


public class AptitudeTHEORY extends AppCompatActivity {



    PDFView theory;

    Button e;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_theory);


        theory=(PDFView)findViewById(R.id.pdfView);

        theory.fromAsset("Profitloss.pdf").load();





    }
}