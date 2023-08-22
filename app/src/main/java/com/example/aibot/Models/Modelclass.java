package com.example.aibot.Models;

public class Modelclass {
int image;
String modelname;

    public Modelclass(int image, String modelname) {
        this.image = image;
        this.modelname = modelname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
}
