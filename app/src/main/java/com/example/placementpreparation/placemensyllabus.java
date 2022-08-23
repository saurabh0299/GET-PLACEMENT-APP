package com.example.placementpreparation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class placemensyllabus extends AppCompatActivity {

    PDFView syll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placemensyllabus);



        syll=(PDFView)findViewById(R.id.pdfView);

        syll.fromAsset("PLACEMENTSYLLABUS.pdf").load();
    }
}