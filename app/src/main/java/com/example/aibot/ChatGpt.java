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
import com.example.aibot.databinding.FragmentChatGptBinding;


public class ChatGpt extends Fragment {

FragmentChatGptBinding binding;
    WebView web;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentChatGptBinding.inflate(inflater,container,false);
        binding.getRoot();



        binding.webGpt.loadUrl("https://chat.openai.com/");
        WebSettings webSettings=binding.webGpt.getSettings();
        webSettings.setJavaScriptEnabled(true);

        binding.webGpt.setWebViewClient(new WebViewClient());
        return binding.getRoot();
    }
}