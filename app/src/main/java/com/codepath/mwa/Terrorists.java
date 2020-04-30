package com.codepath.mwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terrorists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrorists);

        Button btnSajid = (Button) findViewById(R.id.btnSajid);
        btnSajid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/sajid-mir/@@download.pdf");}
        });

        Button btnHusam = (Button) findViewById(R.id.btnHusam);
        btnHusam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/husam-abd-al-rauf/@@download.pdf");}
        });

        Button btnAhlam = (Button) findViewById(R.id.btnAhlam);
        btnAhlam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/ahlam-ahmad-al-tamimi/@@download.pdf");}
        });

        Button btnJoanne= (Button) findViewById(R.id.btnJoanne);
        btnJoanne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/joanne-deborah-chesimard/@@download.pdf");}
        });

        Button btnLiban = (Button) findViewById(R.id.btnLiban);
        btnLiban.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/liban-haji-mohamed/@@download.pdf");}
        });

        Button btnRaddulan = (Button) findViewById(R.id.btnRaddulan);
        btnRaddulan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/raddulan-sahiron/@@download.pdf");}
        });

        Button btnAhmad = (Button) findViewById(R.id.btnAhmad);
        btnAhmad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/ahmad-abousamra/@@download.pdf");}
        });

        Button btnAbdullah = (Button) findViewById(R.id.btnAbdullah);
        btnAbdullah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/abdullah-ahmed-abdullah/@@download.pdf");}
        });

        Button btnHasan = (Button) findViewById(R.id.btnHasan);
        btnHasan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/hasan-izz-al-din/@@download.pdf");}
        });

        Button btnRamadan = (Button) findViewById(R.id.btnRamadan);
        btnRamadan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/wanted_terrorists/ramadan-abdullah-mohammad-shallah");}
        });
    }

    public void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

