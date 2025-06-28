package com.neetcode.arrayandhashingquestions;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numStore = new HashSet<>();
        for (int num : nums) {
            if (numStore.contains(num)) {
                return true;
            }
            numStore.add(num);
        }
        return false;
    }
}
