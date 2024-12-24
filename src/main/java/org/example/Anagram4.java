package org.example;

import java.util.Arrays;

public class Anagram4 {
    public static void main(String[] args) {
        String str1 = "стол";
        String str2 = "стул";
        boolean result = isAnagram(str1, str2);
        System.out.println(result);  // Вывод: false
    }
    public static boolean isAnagram(String str1, String str2) {
        // Удаляем пробелы и приводим строки к нижнему регистру
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        // Проверяем, имеют ли строки одинаковую длину
        if (str1.length() != str2.length()) {
            return false;
        }
        // Преобразуем строки в массивы символов и сортируем их
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Сравниваем отсортированные массивы символов
        return Arrays.equals(arr1, arr2);
    } }