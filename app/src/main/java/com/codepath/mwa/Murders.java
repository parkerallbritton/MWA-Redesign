package com.codepath.mwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Murders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murders);

        Button btnBob = (Button) findViewById(R.id.btnBob);
        btnBob.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/bob-tang/@@download.pdf");}
        });


        Button btnJorge = (Button) findViewById(R.id.btnJorge);
        btnJorge.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/jorge-ernesto-rico-ruvira/@@download.pdf");}
        });

        Button btnRyan = (Button) findViewById(R.id.btnRyan);
        btnRyan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/ryan-d-rivera-meister/@@download.pdf");}
        });

        Button btnEvelin= (Button) findViewById(R.id.btnEvelin);
        btnEvelin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/evelin-martinez/@@download.pdf");}
        });

        Button btnAndre = (Button) findViewById(R.id.btnAndre);
        btnAndre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/andre-j-fleurentin/@@download.pdf");}
        });

        Button btnDennis = (Button) findViewById(R.id.btnDennis);
        btnDennis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/dennis-m-cunningham/@@download.pdf");}
        });

        Button btnManuel = (Button) findViewById(R.id.btnManuel);
        btnManuel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/manuel-virgen-galvan/@@download.pdf");}
        });

        Button btnCesar = (Button) findViewById(R.id.btnCesar);
        btnCesar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/murders/cesar-soltero-herrera/@@download.pdf");}
        });


    }

    public void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
