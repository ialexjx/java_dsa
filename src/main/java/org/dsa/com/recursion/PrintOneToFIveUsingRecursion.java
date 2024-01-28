package org.dsa.com.recursion;

public class PrintOneToFIveUsingRecursion {
    public static void main(String[] args) {
        printNumber(1);
    }
    public static void printNumber(int n){
        System.out.println(n);
        if (n == 5){
            return;
        }
        printNumber(n+1);
    }
}
