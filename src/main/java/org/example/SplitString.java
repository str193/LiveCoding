package org.example;

public class SplitString {
    public static void main(String[] args) {
        String str = "I love photo";
        // Разделить строку на три отдельных слова
        String[] arrays = str.split(" ");

        // Используем цикл для вывода каждого слова
        for (String array : arrays) {
            System.out.println(array);
        }
    }
}