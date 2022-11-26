package com.example.centrealmanardevarenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    String iframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        iframe = "https://www.islamicfinder.org/prayer-widget/6173508/shafi/5/0/15.0/15.0";
        webView.loadUrl(iframe);

        webView.setWebViewClient(new Callback());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.identité:

                IdentitéCenter();

                return true;

            case R.id.vision:

                VisionCenter();
                return true;

            case R.id.mission:

                MissionCenter();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void MissionCenter() {
        Intent intent= new Intent(this,MissionActivity.class);
        startActivity(intent);
        finish();

    }

    private void VisionCenter() {
        Intent intent= new Intent(this,VisionActivity.class);
        startActivity(intent);
        finish();

    }

    private void IdentitéCenter() {

        Intent intent= new Intent(MainActivity.this, valeurActivity.class);
        startActivity(intent);
        finish();
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event){
            return false;
        }

        @Override
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            return super.onRenderProcessGone(view, detail);
        }


    }
}