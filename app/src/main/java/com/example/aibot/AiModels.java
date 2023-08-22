package com.example.aibot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aibot.Adapter.Adapter;
import com.example.aibot.Datarepositry.Database;
import com.example.aibot.Models.Modelclass;
import com.example.aibot.databinding.FragmentAiModelsBinding;

import java.util.ArrayList;
import java.util.List;


public class AiModels extends Fragment {

FragmentAiModelsBinding binding;


    List<Modelclass> modelclasses;
    Adapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentAiModelsBinding.inflate(inflater,container,false);
        binding.getRoot();

        modelclasses=new ArrayList<>();
        modelclasses=(List<Modelclass>) Database.datalist;
      binding.recyclar1.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelclasses,getLayoutInflater());
       binding.recyclar1.setAdapter(adapter);

        return binding.getRoot();

    }
}