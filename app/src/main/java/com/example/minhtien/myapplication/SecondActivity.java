package com.example.minhtien.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;

import com.ads.MyAds;
import com.ads.MyAdsInterface;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class SecondActivity extends Activity{
    AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Create a banner ad. The ad size and ad unit ID must be set before calling loadAd.
        mAdView = new AdView(this);
        mAdView.setAdSize(AdSize.MEDIUM_RECTANGLE);

        mAdView.setAdUnitId("ca-app-pub-8634259134319673/5360298746");

        // Create an ad request.
        AdRequest.Builder adRequestBuilder = new AdRequest.Builder();

        // Optionally populate the ad request builder.
        adRequestBuilder.addTestDevice("64784F27D802A346B5A8F7D52D3CD378");

        // Add the AdView to the view hierarchy.
        layout.addView(mAdView);

//        mAdView.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//
//            }
//        });

        // Start loading the ad.
        mAdView.loadAd(adRequestBuilder.build());

        setContentView(layout);


//        MobileAds.initialize(this, "ca-app-pub-8634259134319673~6932397142");
//        final MyAds myAds = new MyAds();
//        myAds.init(this,"ca-app-pub-8634259134319673/1487586747");
//        myAds.showAds();
    }

    @Override
    public void onResume() {
        super.onResume();

        // Resume the AdView.
        mAdView.resume();
    }

    @Override
    public void onPause() {
        // Pause the AdView.
        mAdView.pause();

        super.onPause();
    }

    @Override
    public void onDestroy() {
        // Destroy the AdView.
        mAdView.destroy();

        super.onDestroy();
    }
}
