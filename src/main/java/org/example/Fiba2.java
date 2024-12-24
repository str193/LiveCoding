package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fiba2 {
    public static void main(String[] args) {
        //  Вывести число фиббоначи, первых 11 чисел
        //  каждое число последовательности, равно двух предшедствующих в каждом элементе
        // 0, 1, 1, 2, 3, 5
        int a = 11;
        int[] numbers = new int[a];
        numbers[1] = 1;
        numbers[2] = 2;
        for (int i = 3; i < a; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
        int result = Stream.iterate(new int[]{0, 1},
                        number -> new int[]{number[1], number[0] + number[1]})
                .limit(a)
                .map(x -> x[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(Arrays.toString(numbers));
        System.out.println(result);
    }
}