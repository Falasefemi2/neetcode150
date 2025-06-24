package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Question3Test {
    Question3 question3 = new Question3();

    @Test
    public void testTwoSum() {
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;

        int[] expected = { 0, 1 };
        int[] actual = question3.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum2() {
        int[] nums = { 4, 5, 6 };
        int target = 10;

        int[] expected = { 0, 2 };
        int[] actual = question3.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum3() {
        int[] nums = { 5, 5 };
        int target = 10;

        int[] expected = { 0, 1 };
        int[] actual = question3.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }
}
