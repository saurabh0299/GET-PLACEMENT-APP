package com.example.placementpreparation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class TECHEASY extends AppCompatActivity {

    PDFView TECHEASY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techeasy);




        TECHEASY=(PDFView)findViewById(R.id.pdfView);

        TECHEASY.fromAsset("TECHEASY.pdf").load();
    }
}