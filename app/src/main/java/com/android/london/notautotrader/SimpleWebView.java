package com.android.london.notautotrader;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleWebView extends AppCompatActivity {
    private WebView webView;
    private Bundle bundle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getIntent().getExtras();
        if (savedInstanceState == null && bundle != null) {
            String url = bundle.getString("linkTo");
            setContentView(R.layout.activity_simple_web_view);

            webView = findViewById(R.id.simpleWebView);
            webView.requestFocus(View.FOCUS_DOWN);

            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(url);
            webView.getSettings().setJavaScriptEnabled(true);
        }
        else {
            finish();
        }
    }
}
