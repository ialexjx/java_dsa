package org.dsa.com.number.problems;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int remainder;
        int sum =0;
        int armstrong = number;
        while(number > 0){
            remainder = number % 10;
           sum = sum + (remainder * remainder * remainder);
           number = number/10;
        }
        if(sum == armstrong){
            System.out.println("Number is armstrong number");
        }else{
            System.out.println("Number is not armstrong number");
        }
    }
}
