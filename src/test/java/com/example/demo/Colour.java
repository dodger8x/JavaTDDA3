package com.example.demo;




public class Colour {
    float red;
    float green;
    float blue;
    public Colour(double red, double green, double blue){
        this.red= (float) red;
        this.green=(float) green;
        this.blue=(float) blue;
    }

    public Colour(String s) {
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
