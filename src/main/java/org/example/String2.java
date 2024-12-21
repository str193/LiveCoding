package org.example;

public class String2 {
    public static void main(String[] args) {
        // Заменить каждое второе вхождение в строке
        String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String target = "Object-oriented programming";
        String replacement = "OOP";

        String[] parts = str.split(target);
        StringBuilder sb = new StringBuilder(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            if (i % 2 == 0) {
                sb.append(replacement);
            } else {
                sb.append(target);
            }
            sb.append(parts[i]);
        }
        System.out.println(sb);

        // Развернуть строку двумя способами
        // Вариант 1: С использованием одного массива
        String str1 = "Раз, два, три";
        char[] chars1 = str1.toCharArray();
        int start = 0;
        int end = chars1.length - 1;
        while (start < end) {
            char temp = chars1[start];
            chars1[start] = chars1[end];
            chars1[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(chars1));

        // Вариант 2: Без StringBuilder
        char[] chars2 = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            chars2[i] = str1.charAt(str1.length() - 1 - i);
        }
        System.out.println(new String(chars2));

        // Вариант 3: С использованием StringBuilder
        StringBuilder newStr = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            newStr.append(str1.charAt(i));
        }
        System.out.println(newStr);

        // Вариант 4: С использованием while
        String str4 = "I love Java";
        char[] chars4 = str4.toCharArray();
        int countFirst = 0;
        int countSecond = chars4.length - 1;
        while (countFirst < countSecond) {
            char temp = chars4[countFirst];
            chars4[countFirst] = chars4[countSecond];
            chars4[countSecond] = temp;
            countFirst++;
            countSecond--;
        }
        System.out.println(new String(chars4));

        // Найти самую длинную подстроку из одинаковых символов
        String str5 = "11225553377755544411";
        System.out.println(findLongestSubstring(str5));

        // Пример с другим входным значением
        String str6 = "155559999977441111330000000000009";
        System.out.println(findLongestSubstring(str6));
    }

    // Метод для поиска самой длинной подстроки из одинаковых символов
    public static String findLongestSubstring(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        StringBuilder maxSubstring = new StringBuilder();
        StringBuilder currentSubstring = new StringBuilder();
        char[] chars = str.toCharArray();
        char currentChar = chars[0];

        for (char c : chars) {
            if (c == currentChar) {
                currentSubstring.append(c);
            } else {
                currentChar = c;
                currentSubstring = new StringBuilder().append(c);
            }

            if (currentSubstring.length() > maxSubstring.length()) {
                maxSubstring = new StringBuilder(currentSubstring);
            }
        }
        return maxSubstring.toString();
    }
}
