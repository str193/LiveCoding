package org.example;

public class CountSimbol {
    public static void main(String[] args) {
        String str = "Aligator";
        char a = 'a'; // Используем одинарные кавычки для символа

        System.out.println(method(str, a)); // Вызов метода и вывод результата
    }

    public static int method(String str, char a) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            // Сравниваем символы без учета регистра
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(a)) {
                counter++;
            }
        }
        return counter; // Возвращаем счетчик после завершения цикла
    }
}