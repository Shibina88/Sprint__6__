package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                actual);
    }

    @Test
    public void animalExceptionTest() throws Exception {
        Animal animal = new Animal();
        assertThrows("Problems with exception", Exception.class, () -> animal.getFood("Гуманоид"));
    }
}