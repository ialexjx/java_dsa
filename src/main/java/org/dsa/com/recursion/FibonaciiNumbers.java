package org.dsa.com.recursion;

public class FibonaciiNumbers {
    public static void main(String[] args) {
        System.out.println(fibonacii(5));
        System.out.println(fibonaciiModified(5));
    }

    public static int fibonacii(int n){
        if(n == 1){
           return 0;
        } else if (n == 2) {
            return 1;
        }else {
           return fibonacii(n-1) + fibonacii(n-2);
        }

    }

    public static int fibonaciiModified(int n){
        if(n < 2){
            return n;
        }else {
            return fibonacii(n - 1) + fibonacii(n - 2);
        }

    }
}
