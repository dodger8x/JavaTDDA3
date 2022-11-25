package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTest {
    float redValue;
    float greenValue;
    float blueValue;
    @Test
    void testColour() {
       Colour colourTester =new Colour(.4,.3,.7);
       redValue=colourTester.getRed();
       Assertions.assertEquals((float).4,redValue);
       greenValue=colourTester.getGreen();
       Assertions.assertEquals((float).3,greenValue);
       blueValue=colourTester.getBlue();
       Assertions.assertEquals((float).7,blueValue);
       Colour colourTester2= new Colour("110101010101010101010101");


    }


}

