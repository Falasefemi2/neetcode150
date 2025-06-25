package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Question5Test {
    Question5 question5 = new Question5();

    @Test
    public void testTopKFrequent() {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        int k = 2;

        int[] result = question5.topKFrequent(nums, k);
        int[] expected = { 2, 3 };

        Arrays.sort(result);
        Arrays.sort(expected);

        assertArrayEquals(expected, result);
    }
}
