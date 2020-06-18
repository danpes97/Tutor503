package com.cleverdare.tutor503.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.cleverdare.tutor503.Clases.Url;
import com.cleverdare.tutor503.R;

public class VerVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_ver);
        String urlVideo = ((Url) VerVideoActivity.this.getApplication()).getU();
        WebView videoWeb = findViewById(R.id.videoWebView);
        videoWeb.loadData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/" + urlVideo +
                "\" frameborder=\"0\" allowfullscreen></iframe>", "text/html" , "utf-8");
        videoWeb.getSettings().setJavaScriptEnabled(true);
        videoWeb.setWebChromeClient(new WebChromeClient() {
        } );
    }
}