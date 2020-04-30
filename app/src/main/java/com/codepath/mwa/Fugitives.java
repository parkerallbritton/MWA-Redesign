package com.codepath.mwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fugitives extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fugitives);

        Button btnJason = (Button) findViewById(R.id.btnJason);
        btnJason.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/topten/jason-derek-brown/@@download.pdf");}
        });
        

        Button btnYaser = (Button) findViewById(R.id.btnYaser);
        btnYaser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/topten/yaser-abdel-said/@@download.pdf");}
        });

        Button btnAlexis = (Button) findViewById(R.id.btnAlexis);
        btnAlexis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/topten/alexis-flores/@@download.pdf");}
        });

        Button btnEugene= (Button) findViewById(R.id.btnEugene);
        btnEugene.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/topten/eugene-palmer/@@download.pdf");}
        });

        Button btnRobert = (Button) findViewById(R.id.btnRobert);
        btnRobert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/topten/robert-william-fisher/@@download.pdf");}
        });

        Button btnBhadreshkumar = (Button) findViewById(R.id.btnBhadreshkumar);
        btnBhadreshkumar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/wanted/topten/bhadreshkumar-chetanbhai-patel/@@download.pdf");}
        });
    }

    public void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
