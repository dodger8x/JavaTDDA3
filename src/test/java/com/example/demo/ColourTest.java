package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static java.lang.Integer.parseInt;

public class ColourTest {
    float redValue;
    float greenValue;
    float blueValue;
    @Test
    void testColourConstructor1() {
       Colour colourTester =new Colour(.4,.3,.7);
       redValue=colourTester.getRed();
       Assertions.assertEquals((float).4,redValue);
       greenValue=colourTester.getGreen();
       Assertions.assertEquals((float).3,greenValue);
       blueValue=colourTester.getBlue();
       Assertions.assertEquals((float).7,blueValue);

    }

    @Test
    void testColourConstructor2() {
        Colour colourTester2= new Colour("001100110101010101010101");
        redValue=colourTester2.getRed();
        greenValue=colourTester2.getGreen();
        blueValue=colourTester2.getBlue();
        Assertions.assertEquals((float)(parseInt("00110011",2))/255,redValue);
        Assertions.assertEquals((float)(parseInt("01010101",2))/255,greenValue);
        Assertions.assertEquals((float)(parseInt("01010101",2))/255,blueValue);
    }

    @Test
    void testColourEqualsMethod() {
        Colour equalsTester1= new Colour(.4,.3,.7);
        Colour equalsTester2= new Colour(.4,.3,.7);
        Assertions.assertTrue(equalsTester1.equals(equalsTester2));
    }
}

