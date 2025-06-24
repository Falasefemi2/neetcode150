package com.neetcode.arrayandhashingquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> words = new HashMap<>();

        for (String current : strs) {
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            words.computeIfAbsent(sorted, k -> new ArrayList<>()).add(current);
        }
        return new ArrayList<>(words.values());
    }
}
