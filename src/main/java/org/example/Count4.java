package org.example;

import java.util.List;

public class Count4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<Integer> list2 = list.stream().map(n->n%2 ==0 ? n*100 : n-100).toList();
        System.out.println("Before "+list);
        System.out.println("чётные умн.на 100, от нечётных отнять 100 "+list2);
        System.out.println();

        List<Integer> list3=List.of(1,2,3,-4,5);
        List<Integer> list4=list3.stream().map(Math::abs).toList();
        System.out.println("Before "+list3);
        System.out.println("преобразовать отриц.числа в положит. "+list4);
        System.out.println();

        List<String> list5 = List.of("Андрей", "Максим", "Антон", "Павел", "Егор");
        List<String>list6 = list5.stream().filter(n->n.startsWith("А")).toList();
        System.out.println("Before "+list5);
        System.out.println("вывести имена начин. с буквы А "+list6);
    }
}
