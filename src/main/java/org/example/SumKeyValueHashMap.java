package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumKeyValueHashMap {
    public static void main(String[] args) {
        // Посчитать сумму ключей и значений в HashMap: Map<Integer>, List<Integer>
        // Тут надо сложить все ключи и сложить все инты во всех списках, а затем сложить сумму ключей и значений
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, List.of(1, 2, 3));
        map.put(2, List.of(4, 5));
        map.put(3, List.of(6, 7, 8, 9));
        int result = sumKeysAndValues(map);
        System.out.println("Сумма ключей и значений: " + result);  // Вывод: 55
    }
    public static int sumKeysAndValues(Map<Integer, List<Integer>> map) {
        int sumKeys = 0;
        int sumValues = 0;
        // Суммируем ключи
        for (int key : map.keySet()) {
            sumKeys += key;
        }
        // Суммируем значения (все целые числа во всех списках)
        for (List<Integer> values : map.values()) {
            for (int value : values) {
                sumValues += value;     } }
        // Возвращаем сумму ключей и значений
        return sumKeys + sumValues; }
}