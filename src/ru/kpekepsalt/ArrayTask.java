package ru.kpekepsalt;

import java.util.*;
import java.util.stream.Collectors;

/**
Имеется массив чисел,
 получить список вида {число, количество вхождений числа в массив},
 список должен быть отсортирован по количеству вхождений, внутри по возрастания числа.
 **/

public class ArrayTask<K>{

    public List<K> countArrayEntriesToList(K[] data)
    {
        Map<K, Integer> map = countArrayEntriesToMap(data);
        map = sortByValue(map);
        List<K> list = new ArrayList<>();
        map.forEach((key, value) -> {
            list.add(key);
            list.add((K)value);
        });
        return list;
    }

    public Map<K, Integer> countArrayEntriesToMap(K[] data)
    {
        Map<K, Integer> map = new HashMap<>();
        Arrays.stream(data).forEach(number -> {
            int exists = map.getOrDefault(number, 0);
            map.put(number, ++exists);
        });
        return map;
    }

    public Map<K, Integer> sortByValue(Map<K, Integer> unsortMap)
    {
        return unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }
}
