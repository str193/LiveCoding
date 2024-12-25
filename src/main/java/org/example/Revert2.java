package org.example;

public class Revert2 {
    public static void main(String[] args) {
        String str = "раз два три четыре пять";
        char[] chars = str.toCharArray();
        int first = 0;
        int second = chars.length-1;

        while(first<second) {
            char temp = chars[first];
            chars[first]=chars[second];
            chars[second]=temp;
            first++;
            second--;
        }

        // Преобразование массива символов обратно в строку
        String reversedStr = new String(chars);
        System.out.println("Before: "+str);
        System.out.println("After: "+reversedStr);
        System.out.println();
    }
}
