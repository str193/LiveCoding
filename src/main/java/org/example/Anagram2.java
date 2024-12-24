package org.example;

public class Anagram2 {
    public static void main(String[] args) {
        String str1 = "канонада";
        String str2 = "анаконда";
        System.out.println(isAnagram(str1, str2)); }


    public static boolean isAnagram(String firstAnagram, String secondAnagram) {
        if (firstAnagram.length() != secondAnagram.length()) {
            return false; }
        char[] firstChars = firstAnagram.toCharArray();
        char[] secondChars = secondAnagram.toCharArray();
        boolean[] marker = new boolean[secondChars.length];
        for (char temp : firstChars) {
            for (int i = 0; i < secondChars.length; i++) {
                if (temp == secondChars[i]) {
                    if (!marker[i]) {
                        marker[i] = true;
                        break; } }
                if (i == secondChars.length - 1) {
                    return false;  }  }  }
        return true; }
}

