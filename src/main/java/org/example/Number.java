package org.example;

import java.util.List;

public class Number {
    public static void main(String[] args) {
        //  Напиши программу, которая четные числа * 100, а от нечетных - 100
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = list.stream().map(x -> x % 2 == 0 ? x * 100 : x - 100).toList();
        System.out.println("Before " + list);
        System.out.println("After " + list2);
        System.out.println();


        // Сделай коллекцию с одним отрицательным числом и пусть все в конце будут положительные
        // Чтобы преобразовала программа все отрицательные и в положительные
        List<Integer> list3 = List.of(1, 2, 3, -4, 5);
        List<Integer> list4 = list3.stream().map(Math::abs).toList();
        System.out.println("Before " + list3);
        System.out.println("After " + list4);
        System.out.println();


        // Создай лист стринговых имен и выведи все, которые начинаются на Б например
        // Пять имен и три из них на Б начинаться
        List<String> list5 = List.of("Борис", "Алексей", "Богдан", "Юрий", "Борислав");
        List<String> list6 = list5.stream().filter(x -> x.startsWith("Б")).toList();
        System.out.println("Before " + list5);
        System.out.println("After " + list6);
        System.out.println();


        //  Создать int массив выведи уникальные значения с помощью стримов
        List<Integer> list7 = List.of(1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10);
        List<Integer> list8 = list7.stream().distinct().toList();
        System.out.println("Before " + list7);
        System.out.println("After " + list8);
    }
}