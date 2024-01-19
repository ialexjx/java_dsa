package org.dsa.com.recursion;

public class UnderstandingRecursion {
    public static void main(String[] args) {
        System.out.println("Hello there");
        printNameOfAkshat();
    }

    static void printNameOfAkshat(){
        System.out.println("Hello, my name is Akshat");
        printNameOfMohit();
    }

    static void printNameOfMohit(){
        System.out.println("Hello, my name is Mohit");
        printNameOfShaurya();
    }

    static void printNameOfShaurya(){
        System.out.println("Hello, my name is Shaurya");
        printNameOfAlex();
    }

    static void printNameOfAlex(){
        System.out.println("Hello, my name is Alex");
    }
}
