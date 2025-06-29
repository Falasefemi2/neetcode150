package com.neetcode.slidingwindowquestion;

public class Question17 {
    public int characterReplacement(String s, int k) {
        if (s == null || s.isEmpty() || k < 0) {
            return 0;
        }
        int[] freq = new int[26];
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'A';
            freq[charIndex] += 1;

            maxFreq = Math.max(maxFreq, freq[charIndex]);

            while ((i - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A'] -= 1;
                left += 1;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
