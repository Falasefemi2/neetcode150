package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Question7Test {
    Question7 question7 = new Question7();

    @Test
    public void testProductExceptSelf() {
        int[] nums = { 1, 2, 4, 6 };
        int[] expected = { 48, 24, 12, 8 };

        int[] result = question7.productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }
}
