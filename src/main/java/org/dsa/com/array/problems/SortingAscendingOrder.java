package org.dsa.com.array.problems;

public class SortingAscendingOrder {
    public static void main(String[] args) {
        int array[] = {12,32,112,45,156,45,45,90};
        int temp = 0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
