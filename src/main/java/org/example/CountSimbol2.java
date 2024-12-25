package org.example;

public class CountSimbol2 {
    public static void main(String[] args) {
        // Вызов метода и вывод результата
        System.out.println(method('s', "Sports"));
        // Вернет количество символов 's' в строке "Sports"
    }

    public static int method(char s, String str) {
        char[] chars = str.toLowerCase().toCharArray(); // Приводим строку к нижнему регистру
        int counter = 0; // Счетчик вхождений символа

        // Проходим по всем символам строки
        for (char ch : chars) {
            if (ch == s) {
                counter++; // Увеличиваем счетчик, если символ совпадает
            }
        }

        return counter; // Возвращаем количество вхождений
    }
}
