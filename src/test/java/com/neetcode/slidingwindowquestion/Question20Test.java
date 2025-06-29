package com.neetcode.slidingwindowquestion;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question20Test {

    Question20 question20 = new Question20();

    @Test
    public void testMaxSlidingWindow() {
        int[] nums = { 1, 2, 1, 0, 4, 2, 6 };
        int k = 3;
        int[] expected = { 2, 2, 4, 4, 6 };

        int[] result = question20.maxSlidingWindow(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxSlidingWindow_singleElementWindow() {
        int[] nums = { 1, 3, 2 };
        int k = 1;
        int[] expected = { 1, 3, 2 };

        int[] result = question20.maxSlidingWindow(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMaxSlidingWindow_fullWindow() {
        int[] nums = { 4, 3, 5, 4, 3 };
        int k = 5;
        int[] expected = { 5 };

        int[] result = question20.maxSlidingWindow(nums, k);
        assertArrayEquals(expected, result);
    }
}
