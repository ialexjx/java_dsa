package org.dsa.com.sorting.algo.problems;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {12, 32, 14, 65, 91, 23, 30};

        //compare the adjacent elements of array and swap
         for(int i=0; i< array.length; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[j]>array[i]){
                    System.out.println();
                }
            }
         }
    }
}
