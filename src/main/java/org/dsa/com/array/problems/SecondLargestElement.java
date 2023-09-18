package org.dsa.com.array.problems;

public class SecondLargestElement {
    public static void main(String[] args) {
        int array[] = {12,32,112,45,156,45,45,90};
        int largest = array[1];
        int secondLargest = array[2];
        for(int i = 0; i< array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }
            if(array[i] > secondLargest && array[i] < largest){
                secondLargest = array[i];
            }
        }
        System.out.println("Second Largest element of the array is :- "+secondLargest);
    }
}
