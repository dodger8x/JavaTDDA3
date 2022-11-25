package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTest {
    float redValue;
    @Test
    void testColour() {
       Colour colourTester =new Colour(.4,.3,.7);
       redValue=colourTester.getRed();

    }


}

