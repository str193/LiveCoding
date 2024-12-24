package org.example;

import java.util.Map;
import java.util.Stack;

public class Count1 {
    public static void main(String[] args) {
        String str = "([{}])";
        //System.out.println(isStringCorrect(str)); // Вызываем метод для проверки
        System.out.println(isValid(str));
    }

    /*public static boolean isStringCorrect(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        if (arr.length % 2 != 0) {
            return false;
        } else {
            for (char c : arr) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }*/

    public static boolean isValid(String str) {
        Map<Character, Character> valid = Map.of(')', '(', ']', '[', '}', '{');
        Stack<Character> newStack = new Stack<>();
        for (Character s : str.toCharArray()) {
            if (valid.containsValue(s)) {
                newStack.add(s);
            } else if (valid.containsKey(s)) {
                if (newStack.isEmpty() || newStack.pop() != valid.get(s)) {
                    return false;
                }
            }
        }
        return newStack.isEmpty();
    }
}

