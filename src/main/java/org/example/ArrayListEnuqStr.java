package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListEnuqStr {
    public static void main(String[] args) {
        //  Реализуй метод, который на вход примет ArrayList строк
        //  и удаляет из него все дубликаты, не используя метод contains ()
        ArrayList<String> list = new ArrayList<>();
        list.add("Russia");
        list.add("Spain");
        list.add("Italia");
        list.add("Spain");
        list.add("Rome");
        System.out.println("Первый список: " + list);
        Set<String> list2 = new HashSet<>();
        for (String s : list) {
            list2.add(s);
        }
        System.out.println("Второй список: " + list2);


        //  Ещё вариант с set только другой метод вызываем .addAll()
        Set<String> list3 = new HashSet<>();
        list3.addAll(list);
        System.out.println(list3);
    }
}