package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTest {
    float redValue;
    float greenValue;

    @Test
    void testColour() {
       Colour colourTester =new Colour(.4,.3,.7);
       redValue=colourTester.getRed();
       Assertions.assertEquals((float).4,redValue);
       greenValue=colourTester.getGreen();
    }


}

