package StackQues;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String s) {
        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Pop characters from the stack and append to the result
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String inputString = "hello";
        String reversedString = reverseString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}
