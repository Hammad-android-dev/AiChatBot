package com.example.aibot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.aibot.databinding.FragmentBingBinding;


public class Bing extends Fragment {
WebView web1;
FragmentBingBinding binding;
@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding= FragmentBingBinding.inflate(inflater,container,false);
       binding.getRoot();
        binding.webbing.loadUrl("https://www.skype.com/en/features/skype-web/");
        WebSettings webSettings=binding.webbing.getSettings();
        webSettings.setJavaScriptEnabled(true);

        binding.webbing.setWebViewClient(new WebViewClient());
        return binding.getRoot();
    }
}