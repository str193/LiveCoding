package org.example;

import java.util.Arrays;

public class Fiba {
    public static void main(String[] args) {
        //  вывести в консоль числа Фиббоначи первых 11 чисел
        int s = 11;
        int[] nums = new int[s];
        nums[1] = 1;
        for (int i = 2; i < s; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        int sum = Arrays.stream(nums).sum();
        System.out.println("11 первых чисел Фиббоначи: " + Arrays.toString(nums));
        System.out.println("Сумма чисел Фиббоначи: " + sum); }
}

