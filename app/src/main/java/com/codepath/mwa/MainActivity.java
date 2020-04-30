package com.codepath.mwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNews = (Button) findViewById(R.id.btnNews);
        btnNews.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToUrl("https://www.fbi.gov/news");}
        });



    }

    public void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void openFugitives(View view) {

        startActivity(new Intent(MainActivity.this, Fugitives.class));
    }

    public void openParentalKidnapping(View view) {

        Toast.makeText(this, "Show Parental Kidnappings list.", Toast.LENGTH_LONG).show();
    }

    public void openMissing(View view) {

        Toast.makeText(this, "Show Missing list.", Toast.LENGTH_LONG).show();
    }

    public void openMurder(View view) {

        startActivity(new Intent(MainActivity.this, Murders.class));
    }

    public void openTerrorist(View view) {

        startActivity(new Intent(MainActivity.this, Terrorists.class));
    }

    public void openWhiteCollar(View view) {

        Toast.makeText(this, "Show white collar list.", Toast.LENGTH_LONG).show();
    }


}
