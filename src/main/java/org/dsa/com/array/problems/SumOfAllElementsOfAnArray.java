package org.dsa.com.array.problems;

public class SumOfAllElementsOfAnArray {
    public static void main(String[] args) {
        int array[] = {12, 32, 14, 65, 91, 23, 30};
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of all the elements of the array is :- "+sum);
    }
}

