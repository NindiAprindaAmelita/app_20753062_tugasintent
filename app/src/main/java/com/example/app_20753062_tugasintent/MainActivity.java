package com.example.app_20753062_tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button itsme =findViewById(R.id.itsme);

        itsme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Intent i= new Intent(MainActivity.this,ItsME.class);
           startActivity(i);
            }
        }); }

    public void panggil(View view) {
        String nomor = "085379977848";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void IG(View view) {
        String url = "https://www.instagram.com/nindiiaprindaa/?next=%2F";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }

}