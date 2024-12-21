package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberWithStream2 {
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
        System.out.println();

        //сумма нечетных число
        List<Integer> list9 = List.of(-10, 85, -6, -3, 8);
        int max1 = list9.stream().filter(x -> x%2 != 0).reduce(Integer::sum).get();
        System.out.println("Before " + list9);
        System.out.println("Sum of odd numbers: "+max1);
        System.out.println();

        //максимальное число
        List<Integer> list10 = List.of(-10, 85, -6, -3, 8);
        int max2 = list10.stream().max(Integer::compare).get();
        System.out.println("Before " + list10);
        System.out.println("Maximum number: "+max2);
        System.out.println();

        //  Удалить дубликаты из сортированного списка с помощью коллекций
        int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
        Set<Integer> set = new HashSet<>();
        for (int element : sortedList){
            set.add(element);
        }
        System.out.println("Before " + Arrays.toString(sortedList));
        System.out.println("Sorted set: "+set);
    }

}