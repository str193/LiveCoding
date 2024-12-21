package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class String1 {
    public static void main(String[] args) {
        // Убираем все пробелы из строки
        String str = "Мы готовимся к интервью";
        String strWithoutSpaces = str.replaceAll("\\s", "");
        System.out.println(strWithoutSpaces);

        // Рекурсивный разворот строки
        String a = "I am a tester";
        System.out.println(reverseRecursively(a, a.length() - 1));

        // Повтор строки с разделителем
        repeatStringWithDelimiter("I am a tester", 3, "\n");

        // Замена регистра букв в строке
        String swappedCase = swapCase("I am a tester");
        System.out.println(swappedCase);

        // Перевернутая строка
        String reversedString = reverseString("I am a tester");
        System.out.println(reversedString);

        // Проверка корректности email
        System.out.println(isEmailCorrect("example@test.com"));

        // Подсчет символов в слове
        getCountCharInWord();

        // Подсчет слов с использованием HashMap
        countWordsInString("Упади семь раз и восемь раз поднимись");
    }

    // Метод для рекурсивного разворота строки
    public static String reverseRecursively(String str, int index) {
        if (index == 0) {
            return str.charAt(0) + "";
        }
        return str.charAt(index) + reverseRecursively(str, index - 1);
    }

    // Метод для повторения строки с разделителем
    public static void repeatStringWithDelimiter(String str, int n, String delimiter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
            if (i < n - 1) {
                stringBuilder.append(delimiter);
            }
        }
        System.out.println(stringBuilder);
    }

    // Метод для замены регистра букв
    public static String swapCase(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    // Метод для переворота строки
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Метод проверки корректности email
    public static boolean isEmailCorrect(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        return pattern.matcher(email).matches();
    }

    // Метод подсчета символов в слове
    public static void getCountCharInWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.println("Введите символ: ");
        char symbol = scanner.nextLine().charAt(0);
        scanner.close();

        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == symbol) {
                count++;
            }
        }
        System.out.println("Количество символов '" + symbol + "': " + count);
    }

    // Метод подсчета слов с использованием HashMap
    public static void countWordsInString(String string) {
        String[] arr = string.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : arr) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(hashMap);
    }
}
