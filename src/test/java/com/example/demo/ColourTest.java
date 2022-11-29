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
        Colour colourTester =new Colour(.4F,.3F,.7F);

    }

    @Test
    void testColourConstructor1Getters() {
        Colour colourTester =new Colour(.4F,.3F,.7F);
        redValue=colourTester.getRed();
        Assertions.assertEquals(.4F,redValue);
        greenValue=colourTester.getGreen();
        Assertions.assertEquals(.3F,greenValue);
        blueValue=colourTester.getBlue();
        Assertions.assertEquals(.7F,blueValue);
    }

    @Test
    void testColourConstructor1Setters() {
        Colour colourTester =new Colour(.4F,.3F,.7F);
        colourTester.setRed(.7F);
        Assertions.assertEquals(.7F,colourTester.getRed());
        colourTester.setGreen(.8F);
        colourTester.setBlue(.9F);
        Assertions.assertEquals(.8F,colourTester.getGreen());
        Assertions.assertEquals(.9F,colourTester.getBlue());
    }


    @Test
    void testColourConstructor2() {
        Colour colourTester2= new Colour("001100110101010101010101");
    }

    @Test
    void testColourConstructor2Getters() {
        Colour colourTester2= new Colour("001100110101010101010101");
        redValue=colourTester2.getRed();
        greenValue=colourTester2.getGreen();
        blueValue=colourTester2.getBlue();
        Assertions.assertEquals((float)(parseInt("00110011",2))/255,redValue);
        Assertions.assertEquals((float)(parseInt("01010101",2))/255,greenValue);
        Assertions.assertEquals((float)(parseInt("01010101",2))/255,blueValue);
    }

    @Test
    void testColourConstructor2Setters() {
        Colour colourTester2= new Colour("001100110101010101010101");
        colourTester2.setRed("01110000");
        Assertions.assertEquals((float)(parseInt("01110000",2))/255,colourTester2.getRed());
        colourTester2.setGreen("10000000");
        Assertions.assertEquals((float)(parseInt("10000000",2))/255,colourTester2.getGreen());
        colourTester2.setBlue("10000111");
        Assertions.assertEquals((float)(parseInt("10000111",2))/255,colourTester2.getBlue());
    }


    @Test
    void testColourEqualsMethod() {
        Colour equalsTester1= new Colour(.4F,.3F,.7F);
        Colour equalsTester2= new Colour(.4F,.3F,.7F);
        Assertions.assertTrue(equalsTester1.equals(equalsTester2));
        Colour equalsTester3= new Colour(.1F,.3F,.7F);
        Assertions.assertFalse(equalsTester1.equals(equalsTester3));
    }

    @Test
    void testColourConstructorsExceptionHandling() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Colour(9.4F, .7f,.8F));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Colour("0011001101010101010101011010101010101"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Colour("001100110101010101230101"));



    }
}

