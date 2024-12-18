package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RevertHaspMapStrInt {
    public static void main(String[] args) {
        //    На вход поступает HashMap<Integer, String>, вернуть HashMap<String, Integer>
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Moscow");
        map.put(2, "Saint Petersburg");
        map.put(3, "Vladivostok");
        //  Так же стримом
        Map<String, Integer> map2 = map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey,
                        (v1, v2) -> v1));
        map2.forEach((k, v) -> System.out.println(k + ": " + v));




        HashMap<String, Integer> map3 = new HashMap<>();
        // entrySet в мапу кладешь комбинацию ключа и значения из entrySet можешь вызвать get Kie и get Value
        for (Map.Entry<Integer, String> e : map.entrySet()){ //for(<Integer, String> name : names) { sout("name") }
            map3.put(e.getValue(), e.getKey());    }
        System.out.println(map3); }
}
