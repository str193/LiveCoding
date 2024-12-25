package org.example;

import java.util.stream.Stream;

public class Count3 {
    public static void main(String[]args){
        Stream<Integer> minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
        int biggest = minValue.max(Integer::compare).get();
        System.out.println("max number: " + biggest);

        minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
        int min = minValue.min(Integer::compare).get();
        System.out.println("min number: " + min);

        minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
        System.out.println("count number: " + minValue.count());

        minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
        int count1 = minValue.filter(n->n%2 !=0).reduce(Integer::sum).get();
        System.out.println("count1: " + count1);

        minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
        int count2 = minValue.filter(n->n%2  !=0).mapToInt(n->n).sum();
        System.out.println("count2: " + count2);
    }
}
