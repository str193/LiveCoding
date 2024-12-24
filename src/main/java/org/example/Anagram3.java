package org.example;

public class Anagram3 {
    public static void main(String[] args) {
        //Напиши программу является ли аннаграммой одно другому стол , стул - false
        System.out.println(isAnagram("стул", "стол")); // Выведет false
    }
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        boolean[] m = new boolean[word2Chars.length];
        for (char symbol : word1Chars) {
            for (int i = 0; i < word2Chars.length; i++) {
                if (symbol == word2Chars[i]) {
                    if (!m[i]) {
                        m[i] = true;
                        break;
                    }
                    if (i == word2Chars.length - 1) {
                        return false;
                    } } }
            return true;
        }
        return false; }}