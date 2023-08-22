package org.dsa.com.array.problems;

public class FindAnGivenElementFromAnArray {
    public static void main(String[] args) {
        // Initialize array
        int array[] = {12, 32, 14, 65, 91, 23, 30};
        int numberToFind = 30;              //The number we have to search in the array.
        int indexOfTheNumber = 0;           //The index of the number we have to search.
        boolean flag = false;

        //Print the given array
        System.out.println("Given array is :- ");
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println("\n The number we have to find out from the array is :- " + numberToFind);

        //Compare each element from the array to the number we have to search, if found then copy the index and flag it as true
        for (int i = 0; i < array.length; i++) {
            if (numberToFind == array[i]) {
                indexOfTheNumber = i;
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Number " + numberToFind + " is present at the index " + indexOfTheNumber);
        } else {
            System.out.println("Given number is not present in the given array");
        }
    }
}
