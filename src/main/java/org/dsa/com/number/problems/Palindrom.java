package org.dsa.com.number.problems;

public class Palindrom {
    public static boolean isPalindrome(int x) {
        int number = x, r = 0, reverseNumber = 0;
        if (x > 0) {
            while (x != 0) {
                r = x % 10;
                reverseNumber = reverseNumber * 10 + r;
                x = x / 10;
            }
            System.out.println(reverseNumber);
            return reverseNumber == number;

        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }
}
