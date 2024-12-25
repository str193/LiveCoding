package org.example;

public class Revert1 {
    public static void main(String[] args) {
        String str = "раз два три четыре пять";
        char[] chars = str.toCharArray();
        int i = 0;
        int k = chars.length-1;

        for (; i < k; i++, k--) {
            char temp = chars[i];
            chars[i] = chars[k];
            chars[k] = temp;
        }

        // Преобразование массива символов обратно в строку
        String reversedStr = new String(chars);
        System.out.println("Before: "+str);
        System.out.println("After: "+reversedStr);
        System.out.println();
    }
}
