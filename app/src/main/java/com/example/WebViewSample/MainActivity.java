package com.example.WebViewSample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    private String TAG = "debug";
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        wv = (WebView)findViewById(R.id.wv);
        // リンク先もwebviewで表示するための処理
        wv.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return false;
            }
        });
        wv.loadUrl("https://www.google.com/");

    }
}