package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> integerStringEntry : sourceMap.entrySet()) {
            map.merge(integerStringEntry.getValue(), integerStringEntry.getKey(), Integer :: min);
        }
        return map;
    }
}
