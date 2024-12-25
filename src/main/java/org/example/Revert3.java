package org.example;

import java.util.Scanner;

public class Revert3 {
    public static void main(String[] args) {
        // Развернуть строку через Scanner
        System.out.println("Введите приветствие:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        StringBuilder stringBuilder = new StringBuilder();

        // Исправленный цикл for
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        // Преобразование StringBuilder в строку и вывод
        System.out.println(stringBuilder.toString());
    }
}