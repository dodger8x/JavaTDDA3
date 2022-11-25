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
    String rgbValue;

    public Colour(String rgbValue) {
        this.rgbValue =rgbValue;
        float [] ColArray = new float[3];
        int count=0;
        for (int i =0;i<3;i++){
            currentColour= this.rgbValue.substring(count,count+8);
            ColArray[i]= (float) (parseInt(currentColour,2)/255.00);
            count+=8;
        }
        this.red=ColArray[0];
        this.green=ColArray[1];
        this.blue=ColArray[2];
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
