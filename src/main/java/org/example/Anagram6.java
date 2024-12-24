package org.example;

public class Anagram6 {
    public static void main(String[] args) {
        System.out.println(isAnagram("обезьянство", "оветьянсзбо"));
        System.out.println(isAnagram("место", "тесмоп"));
        System.out.println(isAnagram("мечеть", "чеметь"));
    }

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
