package com.example.demo;




import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

public class Colour {
    float red;
    float green;
    float blue;
    public Colour(double red, double green, double blue){
        try{
            if(red<0||red>1){
                throw new IllegalArgumentException("Red value must be between 0 and 1");
            }
            if(green<0||green>1){
                throw new IllegalArgumentException("Green value must be between 0 and 1");
            }
            if(blue<0||blue>1){
                throw new IllegalArgumentException("Blue value must be between 0 and 1");
            }
        } catch(Exception $e){
            System.out.println($e.getMessage());
            exit(-1);

        }
        this.red= (float) red;
        this.green=(float) green;
        this.blue=(float) blue;

    }
    String currentColour;
    String rgbValue;

    public Colour(String rgbValue) {
        this.rgbValue =rgbValue;
        try{
            if(rgbValue.length()!=24) {
                throw new IllegalArgumentException("Binary value must be 24 characters long");
            }
        }catch(Exception $e) {
            System.out.println($e.getMessage());
            exit(-1);
        }

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


    public boolean equals(Colour c2){
        return red == c2.getRed() & green == c2.getGreen() & blue == c2.getBlue();
    }
}
