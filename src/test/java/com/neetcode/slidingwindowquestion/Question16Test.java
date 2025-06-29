package com.neetcode.slidingwindowquestion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Question16Test {
    Question16 question16 = new Question16();

    @Test
    public void testLengthOfLongestSubstring() {
        String input = "zxyzxyz";
        int expected = 3;
        int result = question16.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleLengthOfLongestString() {
        String input = "xxxx";
        int expected = 1;
        int result = question16.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testAllUniqueCharacters() {
        String input = "abcdef";
        int expected = 6;
        int result = question16.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String input = "";
        int expected = 0;
        int result = question16.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleCharacter() {
        String input = "z";
        int expected = 1;
        int result = question16.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void testWithSpacesAndSymbols() {
        String input = "a b!c@a";
        int expected = 6;
        int result = question16.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }
}
