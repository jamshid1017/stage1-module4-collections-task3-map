package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();
        String[] words = sentence.split("[ ,.]");
        for (String word : words) {
            if (!word.isBlank()) {
                wordMap.merge(word.toLowerCase(), 1, Integer::sum);
            }
        }

        return wordMap;
    }

}
