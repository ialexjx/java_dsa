package org.dsa.com.array.problems;

import java.util.HashSet;
import java.util.Set;

public class TotalDuplicatesInArray {
    public static void main(String[] args) {
        int array[] = {12,32,12,45,56,45,45,90};
        int duplicates = 0;
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<array.length; i++){
            if(set.add(array[i]) != true)
            {
                duplicates++;
            }
        }
        System.out.println("Total number of duplicates is :- "+ duplicates);
    }
}
