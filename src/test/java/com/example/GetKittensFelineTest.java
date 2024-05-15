package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class GetKittensFelineTest {
    private final int expectedResult;
    private final int kittensQuantity;
    Feline feline = new Feline();

    public GetKittensFelineTest(int kittensQuantity, int expectedResult) {
        this.expectedResult = expectedResult;
        this.kittensQuantity = kittensQuantity;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {2, 2},
                {8, 8},
                {4, 4},
                {0, 0},
        };
    }

    @Test
    public void kittensQuantityTest() {
        assertEquals(expectedResult, feline.getKittens(kittensQuantity));
    }
}