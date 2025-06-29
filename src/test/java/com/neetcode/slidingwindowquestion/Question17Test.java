package com.neetcode.slidingwindowquestion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Question17Test {
    Question17 question17 = new Question17();

    @Test
    public void testCharacterReplacement() {
        String s1 = "XYYX";
        int k1 = 2;
        int expected1 = 4;
        assertEquals(expected1, question17.characterReplacement(s1, k1));

        String s2 = "AAAA";
        int k2 = 0;
        int expected2 = 4;
        assertEquals(expected2, question17.characterReplacement(s2, k2));

        String s3 = "ABAB";
        int k3 = 2;
        int expected3 = 4;
        assertEquals(expected3, question17.characterReplacement(s3, k3));

        String s4 = "ABCDE";
        int k4 = 0;
        int expected4 = 1;
        assertEquals(expected4, question17.characterReplacement(s4, k4));

    }
}
