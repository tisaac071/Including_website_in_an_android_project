package com.zarkmedia.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebview=(WebView)findViewById(R.id.Webvieww);

        WebSettings webSettings=mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
//the website that is to be loaded
        mywebview.loadUrl("https://www.must.ac.ug");

//This helps not to open a link in another browser but rather that same activity
        mywebview.setWebViewClient(new WebViewClient());


    }
// check what happens if back button is pressed
    @Override
    public void onBackPressed() {

        if (mywebview.canGoBack()){
            mywebview.goBack();
        }else {
        super.onBackPressed();
    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate the menu, this adds item to the action bar if present
       // getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
