package com.neetcode.twopointersquestions;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Question11Test {

    Question11 question11 = new Question11();

    @Test
    public void testTwoSum() {
        int[] num = { 1, 2, 3, 4 };
        int target = 3;

        int[] expected = { 1, 2 };
        int[] actual = question11.twoSum(num, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSumLastElements() {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 7;

        int[] expected = { 3, 4 };
        int[] actual = question11.twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSumNoSolution() {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 10;

        int[] expected = {};
        int[] actual = question11.twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

}
