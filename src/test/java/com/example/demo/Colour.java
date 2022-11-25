package com.example.demo;


import static java.lang.Integer.parseInt;

public class Colour {
    float red;
    float green;
    float blue;
    public Colour(double red, double green, double blue){
        this.red= (float) red;
        this.green=(float) green;
        this.blue=(float) blue;
    }
    String currentColour;
    String s;

    public Colour(String s) {
        this.s=s;
        float [] ColArray = new float[2];
        int count=0;
        for (int i =0;i<2;i++){
            currentColour=s.substring(count,count+8);
            ColArray[i]= (float) (parseInt(currentColour,2)/255.00);
            count+=8;
        }
        this.red=ColArray[0];
        this.green=ColArray[1];
    }

    public float getRed() {
        return red;
    }

    public float getGreen() {
        return green;
    }

    public float getBlue() {
        return blue;
    }
}
