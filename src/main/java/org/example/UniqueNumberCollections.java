package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberCollections {
    public static void main(String[] args) {
        int[] sortedList = {1,2,2,3,4,4,4,5,5,7,8,8,9,9,10};
        Set<Integer> set = new HashSet<>();
        for(int element : sortedList){
            set.add(element);
        }
        System.out.println("Before sorting: " + Arrays.toString(sortedList));
        System.out.println("After sorting: " + set);
        System.out.println();

        List<Integer> list = List.of(1,2,2,3,4,4,4,5,5,7,8,8,9,9,10);
        List<Integer> list2 = list.stream().distinct().toList();
        System.out.println("Before sorting: " + list);
        System.out.println("After sorting: " + list2);

    }
}
