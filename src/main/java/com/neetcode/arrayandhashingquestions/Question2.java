package com.neetcode.arrayandhashingquestions;

import java.util.Arrays;

public class Question2 {
    public boolean isAnagram(String s, String t) {
        char[] array1 = s.toLowerCase().toCharArray();
        char[] array2 = t.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
