package org.dsa.com.array.problems;

import java.util.Scanner;

public class RemovingDesiredElementFromTheArray {
    public static void main(String[] args) {
        int array[] = {12, 32, 14, 65, 91, 23, 30};
        int array2[] = new int[array.length - 1];
        int element = 0;
        int position = 0;
        System.out.println("Enter the element you want to delete from the array");
        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();

        for (int i = 0; i < array.length; i++) {    //Fetch the position of the element you want to delete
            if (array[i] == element) {
                position = i;
            }
        }

        for (int i = 0; i < position; i++) {    //Now copy all the elements before that element's position
            array2[i] = array[i];
        }

        //Now copy all the elements after the element's position in the new array
        for (int i = position + 1; i < array.length; i++) {
            array2[i - 1] = array[i];
        }

        for (int i : array2) {
            System.out.print(i + " ");
        }
    }

}

