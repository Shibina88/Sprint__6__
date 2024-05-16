package com.example;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void felineFamilyTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, feline.getFamily());
    }

    @Test
    public void felineFoodIsMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, feline.eatMeat());
    }
}