package org.dsa.com.array.problems;

public class FindTheAverageOfArray {
    public static void main(String[] args) {
        int array[] = {12, 32, 14, 65, 91, 23, 30};
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        double average = sum/array.length;
        System.out.println(average);
    }
}
