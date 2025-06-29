package com.neetcode.slidingwindowquestion;

import java.util.Arrays;

public class Question18 {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.isEmpty()) {
            return true;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        int[] freq = new int[26];
        int[] freqWindow = new int[26];

        for (int i = 0; i < len1; i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len2; i++) {
            freqWindow[s2.charAt(i) - 'a']++;

            if (i >= len1) {
                freqWindow[s2.charAt(i - len1) - 'a']--;
            }

            if (i >= len1 - 1 && Arrays.equals(freq, freqWindow)) {
                return true;
            }
        }
        return false;
    }
}
