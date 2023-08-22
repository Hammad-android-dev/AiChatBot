package com.example.aibot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.aibot.databinding.FragmentAiModelsBinding;
import com.example.aibot.databinding.FragmentPrivacyPolicyBinding;


public class PrivacyPolicy extends Fragment {

  FragmentPrivacyPolicyBinding binding;
WebView web3;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentPrivacyPolicyBinding  .inflate(inflater,container,false);
        binding.getRoot();
        binding.webpolicy.loadUrl("file:///android_asset/privacy policy.html");

      return binding.getRoot();
    }
}