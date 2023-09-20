package org.dsa.com.array.problems;

public class TwoNumberSum {
    // This program finds out the two numbers which have the desired sum
    public static void main(String[] args) {
        int array[] = {12,32,34,31,12,41,41,50};
        int sum = 62;
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == sum){
                    num1 = array[i];
                    num2 = array[j];
                }
            }
            break;
        }
        System.out.println("The numbers are :- "+ num1 +" "+num2);

    }
}
