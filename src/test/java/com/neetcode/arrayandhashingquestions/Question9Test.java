package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question9Test {

    Question9 question9 = new Question9();

    @Test
    public void testLongestConsecutive() {
        int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
        int expected = 4;

        int actual = question9.longestConsecutive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestConsecutive2() {
        int[] nums = { 0, 3, 2, 5, 4, 6, 1, 1 };
        int expected = 7;

        int actual = question9.longestConsecutive(nums);
        assertEquals(expected, actual);
    }
}
