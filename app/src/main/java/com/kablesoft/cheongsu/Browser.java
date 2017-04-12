package com.kablesoft.cheongsu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TextView;


public class Browser extends ActionBarActivity {
    private WebView webView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);
        webView = (WebView)findViewById(R.id.browser_wv);
        textView = (TextView) findViewById(R.id.titleview_browser);
    }
}