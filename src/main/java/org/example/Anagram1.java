package org.example;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        //// анаграмма * канонада, анаконда - true
        String str1 = "канонада";
        String str2 = "анаконда";
        System.out.println(isAnagram(str1, str2)); }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; }
        var str1Chars = str1.toCharArray();
        Arrays.sort(str1Chars);
        var str2Chars = str2.toCharArray();
        Arrays.sort(str2Chars);
        for (int i = 0; i < str2.length(); i++) {
            if (str1Chars[i] != str2Chars[i]) {
                return false; }}
        return true; }
}

