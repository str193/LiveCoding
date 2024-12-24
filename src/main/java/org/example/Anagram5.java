package org.example;

import java.util.Arrays;

public class Anagram5 {
    public static void main(String[] args) {
        //  Написать функцию, которая проверяет, является ли одно слово аннаграммой другого
        // На вход падается 2 строки. На выходе true или false:   "жуткая", "утяжка" – true,  "канонада", "анаконда" – true,   "стол", "стул" - false
        System.out.println(isAnagram("обезьянство", "оветьянсзбо"));
        System.out.println(isAnagram("место", "тесмоп"));
        System.out.println(isAnagram("мечеть", "чеметь")); }

    public static boolean isAnagram(String strFirst, String strSecond) {
        if (strFirst.length() != strSecond.length()) {
            return false; }
        var strFirstChars = strFirst.toCharArray();
        Arrays.sort(strFirstChars);
        var strSecondChars = strSecond.toCharArray();
        Arrays.sort(strSecondChars);
        for (int i = 0; i < strSecond.length(); i++) {
            if (strFirstChars[i] != strSecondChars[i]) {
                return false;  } }
        return true; }
}