package org.example;

public class Count2 {
    public static void main(String[] args) {
        // Скобочная последовательность через switch case
        String str = "([{}])";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str) {
        if (str == null) {
            return false; }
        int a = 0;
        int b = 0;
        int c = 0;
        for (char temp : str.toCharArray()) {
            switch (temp) {
                case '(':
                    a++;
                    break;
                case ')':
                    a--;
                    break;
                case '[':
                    b++;
                    break;
                case ']':
                    b--;
                    break;
                case '{':
                    c++;
                    break;
                case '}':
                    c--;
                    break;
            } }
        return a == 0 && b == 0 && c == 0;
    }
}

