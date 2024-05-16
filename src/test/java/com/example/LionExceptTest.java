package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionExceptTest {
    private final String sex;

    public LionExceptTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] testParam() {
        return new Object[][]{
                {"Неизвестно"},
                {null}, {"Мальчик"},
        };
    }

    @Test
    public void doesHaveManeTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            new Lion(sex, null);
        });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedResult, exception.getMessage());
    }

}
