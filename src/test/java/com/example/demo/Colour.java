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
        int count=0;
        currentColour=s.substring(count,count+8);
        this.red= (float) (parseInt(currentColour,2)/255.00);
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
