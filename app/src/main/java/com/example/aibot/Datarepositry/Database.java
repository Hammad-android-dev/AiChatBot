package com.example.aibot.Datarepositry;

import com.example.aibot.Models.Modelclass;
import com.example.aibot.R;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Modelclass>datalist=new ArrayList<>();
    static {
        datalist.add(new Modelclass(R.drawable.img_1,"Artificial Neural Networks"));
        datalist.add(new Modelclass(R.drawable.img_2,"Convolutional Neural Networks"));
        datalist.add(new Modelclass(R.drawable.img_3,"Recurrent Neural Networks "));
        datalist.add(new Modelclass(R.drawable.img_4,"Transformer Networks:"));
        datalist.add(new Modelclass(R.drawable.cube,"Generative Adversarial "));
        datalist.add(new Modelclass(R.drawable.img_6,"Support Vector Machines "));
    }
}
