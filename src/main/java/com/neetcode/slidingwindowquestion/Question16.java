package com.neetcode.slidingwindowquestion;

import java.util.HashSet;
import java.util.Set;

public class Question16 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
