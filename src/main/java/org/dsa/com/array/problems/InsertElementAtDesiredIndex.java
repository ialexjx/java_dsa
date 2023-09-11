package org.dsa.com.array.problems;

import java.util.Scanner;

public class InsertElementAtDesiredIndex {
    public static void main(String[] args) {
        int array[] = {12, 32, 14, 65, 91, 23, 30};
        int array2[] = new int[array.length+1];
        int position = 0;
        int element = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where you want to add the element in the array");
        position = sc.nextInt();
        System.out.println("Enter the element you want to insert ");
        element = sc.nextInt();

        //Copy elements from original array to the new array :-
        for(int i=0; i<position; i++){
            array2[i] = array[i];
        }
        array2[position] = element;         // the new element added to the desired place

        for(int i=position; i<array.length; i++){           // copy rest of the elements of original array to the new array.
            array2[i+1] = array[i];
        }

        for(int i : array2){
            System.out.print(i+" ");
        }
    }
}
