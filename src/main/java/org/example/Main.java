package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Palindrome testleri
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar"));       // true
        System.out.println(checkForPalindrome("hello"));         // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true

        // WorkintechList testleri
        WorkintechList<String> myList = new WorkintechList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("apple"); // tekrar eklenmeyecek
        myList.add("orange");
        System.out.println("Sorted list: " + myList);
        myList.remove("banana");
        System.out.println("After remove: " + myList);

        // Decimal to Binary testleri
        System.out.println("5 in binary: " + convertDecimalToBinary(5));   // 101
        System.out.println("13 in binary: " + convertDecimalToBinary(13)); // 1101
        System.out.println("6 in binary: " + convertDecimalToBinary(6));   // 110
    }

    // Challenge I: Palindrome check
    public static boolean checkForPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> stack = new LinkedList<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Challenge III: Decimal to Binary
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";
        Deque<Integer> stack = new LinkedList<>();
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
