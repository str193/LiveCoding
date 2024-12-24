package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите метод вычисления факториала:");
        System.out.println("1. Через цикл\n2. Через рекурсию");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите число для вычисления факториала через цикл:");
            int number = scanner.nextInt();
            System.out.println("Факториал числа " + number + " равен " + factorialIterative(number));
        } else if (choice == 2) {
            System.out.println("Введите число для вычисления факториала через рекурсию:");
            int number = scanner.nextInt();
            System.out.println("Факториал числа " + number + " равен " + factorialRecursive(number));
        } else {
            System.out.println("Некорректный выбор.");
        }
        scanner.close();
    }

    // Метод для вычисления факториала через цикл
    public static int factorialIterative(int number) {
        //return n == 1 ? 1 : n * factorial(n - 1); тоже самое
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    // Метод для вычисления факториала через рекурсию
    public static long factorialRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }
}


