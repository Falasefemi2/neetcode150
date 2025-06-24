package com.neetcode.arrayandhashingquestions;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (numsToIndex.containsKey(compliment)) {
                return new int[] { numsToIndex.get(compliment), i };
            }
            numsToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
