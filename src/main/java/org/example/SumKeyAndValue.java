package org.example;

import java.util.HashMap;
import java.util.Map;

public class SumKeyAndValue {
    public static void main(String[] args) {
        //  Нужно посчитать сумму ключей и значений в hashmap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 6);
        //С помощью стримов
        int sum1 = map.entrySet().stream().mapToInt(x -> x.getKey() + x.getValue()).sum();
        System.out.println(sum1);


        //Второй способ
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            sum += entry.getKey() + entry.getValue();   }
        System.out.println(sum);  }

}
