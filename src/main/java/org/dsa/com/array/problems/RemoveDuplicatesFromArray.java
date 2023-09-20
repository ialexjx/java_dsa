package org.dsa.com.array.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int array[] = {12,32,34,31,12,41,41,50};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< array.length; i++){
            set.add(array[i]);
        }
        System.out.println(set);
    }
}
