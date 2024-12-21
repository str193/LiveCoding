package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class NumberWithStream1 {
    public static void main(String[] args) {
        //Вывести минимальное число 45, 15, 24, 12, 95
        Stream<Integer> nums = Stream.of(45, 15, 24, 12, 95);
        int min = nums.min(Integer::compare).get();
        System.out.println("Befor: 45, 15, 24, 12, 95");
        System.out.println("Минимальное число: " + min);
        System.out.println();

        //Вывести максимальное число 45, 15, 24, 12, 95
        Stream<Integer> nums1 = Stream.of(45, 15, 24, 12, 95);
        int max = nums1.max(Integer::compare).get();
        System.out.println("Befor: 45, 15, 24, 12, 95");
        System.out.println("Максимальное число: " + max);
        System.out.println();

        //Отсортируй от маленького к большому 45, 15, 24, 12, 95
        Stream<Integer> nums2 = Stream.of(45, 15, 24, 12, 95);
        System.out.println("Befor: 45, 15, 24, 12, 95");
        System.out.print("Sorted: ");
        nums2.sorted()
                .map(x -> x + " ")
                //нужно преобразовать данные из одного типа в другой
                // добавили пробел между условиями
                .forEach(System.out::print);
        System.out.println();
        System.out.println();

        //Посчитай количество, пусть в консоль выведется 5
        Stream<Integer> nums3 = Stream.of(45, 15, 24, 12, 95);
        System.out.println("Befor: 45, 15, 24, 12, 95");
        System.out.println("Count: " + nums3.count());
    }
}