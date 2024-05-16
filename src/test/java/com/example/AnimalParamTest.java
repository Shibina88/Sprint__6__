package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    private final String animalType;
    private final List<String> expectedFood;


    public AnimalParamTest(String animalType, List<String> expectedFood) {
        this.animalType = animalType;
        this.expectedFood = expectedFood;
    }


    @Parameterized.Parameters
    public static Object[][] testParams() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},


        };
    }

    @Test
    public void animalTypeTest() throws Exception {
        Animal animal = new Animal();

        List<String> actualFood = animal.getFood(animalType);

        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", expectedFood, actualFood);

    }


}

