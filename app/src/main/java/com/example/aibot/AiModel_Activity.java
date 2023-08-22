package com.example.aibot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;



public class AiModel_Activity extends AppCompatActivity {
    int pos;

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_model);
     webView=findViewById(R.id.web1);
     pos=getIntent().getIntExtra("pos",0);
        switch (pos){
            case 0:
              webView.loadUrl("  file:///android_asset/ANN.html");
                break;
            case 1:
                webView.loadUrl("  file:///android_asset/CNN.html");
                break;
            case 2:
                webView.loadUrl( "  file:///android_asset/RNN.html");
                break;
            case 3:
                webView.loadUrl( "  file:///android_asset/TNN.html");
                break;
            case 4:
                webView.loadUrl( "  file:///android_asset/GNN.html");
                break;
            case 5:
                webView.loadUrl( "  file:///android_asset/SVM.html");
                break;
        }

    }
}