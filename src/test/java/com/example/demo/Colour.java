package com.example.demo;




import static java.lang.Integer.parseInt;


public class Colour {
    float red;
    float green;
    float blue;
    public Colour(float red, float green, float blue){
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
            throw new IllegalArgumentException($e.getMessage());

        }
        this.red= red;
        this.green=green;
        this.blue=blue;

    }
    String currentColour;
    String rgbValue;

    public Colour(String rgbValue) {
        this.rgbValue =rgbValue;
        try{
            if(rgbValue.length()!=24) {
                throw new IllegalArgumentException("Binary rgb value must be 24 characters long");
            }
        }catch(Exception $e) {
            throw new IllegalArgumentException($e.getMessage());
        }

        float [] ColArray = new float[3];
        int count=0;
        for (int i =0;i<3;i++){
            currentColour= this.rgbValue.substring(count,count+8);
            try{
                ColArray[i]= (float) (parseInt(currentColour,2)/255.00);
            }catch(Exception $e){
                throw new IllegalArgumentException("24 digit rgb value must be in binary");
            }

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

    public void setRed(float newRed) {
        if(newRed<0||newRed>1){
            throw new IllegalArgumentException("Red value must be between 0 and 1");
        }else{
            this.red=newRed;
        }

    }


    public void setGreen(float newGreen) {
        if(newGreen<0||newGreen>1){
            throw new IllegalArgumentException("Green value must be between 0 and 1");
        }else{
            this.green=newGreen;
        }
    }

    public void setBlue(float newBlue) {
        if(newBlue<0||newBlue>1){
            throw new IllegalArgumentException("Blue value must be between 0 and 1");
        }else{
            this.blue=newBlue;
        }
    }

    public void setRed(String binaryRedValue) {
        float newRed;

        try{
            if(binaryRedValue.length()!=8) {
                throw new IllegalArgumentException("Binary red value must be 8 digits long");
            }
        }catch(Exception $e){
            throw new IllegalArgumentException($e.getMessage());
        }
        try{
            newRed=(float) (parseInt(binaryRedValue,2)/255.00);
        }catch(Exception $e){
            throw new IllegalArgumentException("8 digit value must be binary");
        }
        this.red=newRed;
    }
    
    public void setGreen(String binaryGreenValue) {
        float newGreen;

        try{
            if(binaryGreenValue.length()!=8) {
                throw new IllegalArgumentException("Binary green value must be 8 digits long");
            }
        }catch(Exception $e){
            throw new IllegalArgumentException($e.getMessage());
        }
        try{
            newGreen=(float) (parseInt(binaryGreenValue,2)/255.00);
        }catch(Exception $e){
            throw new IllegalArgumentException("8 digit value must be binary");
        }
        this.green=newGreen;
    }

    public void setBlue(String binaryBlueValue) {
        float newBlue;

        try{
            if(binaryBlueValue.length()!=8) {
                throw new IllegalArgumentException("Binary blue value must be 8 digits long");
            }
        }catch(Exception $e){
            throw new IllegalArgumentException($e.getMessage());
        }
        try{
            newBlue=(float) (parseInt(binaryBlueValue,2)/255.00);
        }catch(Exception $e){
            throw new IllegalArgumentException("8 digit value must be binary");
        }
        this.blue=newBlue;
    }
}
