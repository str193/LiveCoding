package org.example;

import java.util.regex.Pattern;

public class Regular1 {
    public static void main(String[] args) {
        // Проверить соответствуют ли элементы массива шаблону email-а с помощью регулярных выражений
        String[] emailsList = {"test@mail.ru", "123-kkdf@gmail.com", "123@343.com", "qwerty@.com",
                "123123@yandex.com", "test.test@gmail.com", "sdfsdfs@gmail."};
        for (String email : emailsList) {
            System.out.println(isEmailCorrect(email));
        }
    }

    private static boolean isEmailCorrect(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._+-]+[@][a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        return pattern.matcher(email).matches();
    }

}

