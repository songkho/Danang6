package com.idh.songk.danang;

import android.app.Activity;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class usimtext extends Activity {

    private AdView mAdView;

    ImageView imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usimdata);

        imageView2 = (ImageView)findViewById(R.id.imageView2);


        //-------------- START ---------------- 하단광고

        MobileAds.initialize(this, "ca-app-pub-2821664824480291~7504679339");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2821664824480291/2184494920");

        //--------------- END --------------- 하단광고




    }

   


}
