package com.example.aibot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.aibot.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BottomNavigationView bnv;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame1, new AiModels());
        transaction.addToBackStack(null);
        transaction.commit();

        binding.bottom1.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (R.id.aimodels == item.getItemId()) {
                    replacefragment(new AiModels());
                } else if (R.id.Chatgpt == item.getItemId()) {
                    replacefragment(new ChatGpt());
                } else if (R.id.bing == item.getItemId()) {
                    replacefragment(new Bing());
                } else if (R.id.privacy == item.getItemId()) {
                    replacefragment(new PrivacyPolicy());
                }
                return true;
            }
        });

    }

    public void replacefragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame1, fragment);

        transaction.addToBackStack(null);
        transaction.commit();
    }
}