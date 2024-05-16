package com.example;

import java.util.List;

public class Animal {// класс родитель Животные

    public List<String> getFood(String animalKind) throws Exception { //включает ожидаемые исключения
        if ("Травоядное".equals(animalKind)) { // типы животных по питанию Травоядные и хищники
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else { //негативный тест на третий вид несуществующего вида типа питания Исключение
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() { //1. метод получения видов животных
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}