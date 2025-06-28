package com.neetcode.arrayandhashingquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countStore = new HashMap<>();
        for (int num : nums) {
            countStore.put(num, countStore.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : countStore.keySet()) {
            int numAppearance = countStore.get(key);
            if (buckets[numAppearance] == null) {
                buckets[numAppearance] = new ArrayList<>();
            }
            buckets[numAppearance].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result.add(num);
                    if (result.size() == k) {
                        break;
                    }
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
