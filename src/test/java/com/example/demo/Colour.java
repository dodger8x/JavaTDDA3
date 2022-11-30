package com.example.demo;


import static java.lang.Integer.parseInt;

/**
 * Represents a Colour using red, blue and green values
 */
public class Colour {
    private float red;
    private float green;
    private float blue;

    /**
     * Constructor for colour which takes in 3 floats representing red, green and blue
     * @param red float which represents the red value
     * @param green float which represents the green value
     * @param blue float which represents the blue value
     */

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

    /**
     * Constructor for colour which takes in a 24 character binary string representing rgb values
     * @param rgbValue String where first, middle  and last 8 characters represent red green and blue values respectively
     */
    public Colour(String rgbValue) {
        String currentColour;
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
            currentColour= rgbValue.substring(count,count+8);
            try{
                ColArray[i]= (parseInt(currentColour,2)/255.00F);
            }catch(Exception $e){
                throw new IllegalArgumentException("24 digit rgb value must be in binary");
            }

            count+=8;
        }
        this.red=ColArray[0];
        this.green=ColArray[1];
        this.blue=ColArray[2];
    }

    /**
     * Getter for red
     * @return red
     */
    public float getRed() {
        return red;
    }

    /**
     * Getter for green
     * @return green
     */
    public float getGreen() {
        return green;
    }

    /**
     * Getter for blue
     * @return blue
     */
    public float getBlue() {
        return blue;
    }

    /**
     * Compares 2 colours to see if they have the same value and are therefore equal
     * @param c2 The 2nd colour to be compared
     * @return True or False statement depending on if the 2 colours are equal
     */
    public boolean equals(Colour c2){
        return red == c2.getRed() & green == c2.getGreen() & blue == c2.getBlue();
    }

    /**
     * Setter for red
     * @param newRed Float value red is to be set to
     */
    public void setRed(float newRed) {
        if(newRed<0||newRed>1){
            throw new IllegalArgumentException("Red value must be between 0 and 1");
        }else{
            this.red=newRed;
        }

    }

    /**
     * Setter for green
     * @param newGreen Float value green is to be set to
     */

    public void setGreen(float newGreen) {
        if(newGreen<0||newGreen>1){
            throw new IllegalArgumentException("Green value must be between 0 and 1");
        }else{
            this.green=newGreen;
        }
    }

    /**
     * Setter for blue
     * @param newBlue Float value blue is to be set to
     */

    public void setBlue(float newBlue) {
        if(newBlue<0||newBlue>1){
            throw new IllegalArgumentException("Blue value must be between 0 and 1");
        }else{
            this.blue=newBlue;
        }
    }

    /**
     * Setter for red
     * @param binaryRedValue String 8 digit value which contains red value in binary
     */
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

    /**
     * Setter for green
     * @param binaryGreenValue String 8 digit value which contains green value in binary
     */
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

    /**
     * Setter for blue
     * @param binaryBlueValue String 8 digit value which contains blue value in binary
     */
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
