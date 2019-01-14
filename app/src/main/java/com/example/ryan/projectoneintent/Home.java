package com.example.ryan.projectoneintent;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void panggil(View view) {
        String nomor = "081123456789" ;
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void buka(View view) {
        String url = "https://www.youtube.com/c/DroidRyan" ;
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
    public void alamat(View view) {
        Intent alamat= new Intent(Home.this, Alamat.class);
        startActivity(alamat);
    }
}
