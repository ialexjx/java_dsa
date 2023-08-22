package org.dsa.com.array.problems;

public class FindMaximumElementFromArray {
    public static void main(String[] args) {

        // Initialize array
        int array[] = {12, 32, 14, 65, 91, 23, 30};
        System.out.println("The Elements of the array are :- ");

        //Print all the elements of the array
        for (int i : array) {
            System.out.print(" " + i);
        }

        // Let's suppose number at index 0 is the maximum of the array and assign it to the variable maxNumber.
        int maxNumber = array[0];

        //  Now compare the each element of the array and swap the elements if there is an element which is greater than the max
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }

        System.out.println("\n The maximum number of the array is :-  " + maxNumber);
    }
}
