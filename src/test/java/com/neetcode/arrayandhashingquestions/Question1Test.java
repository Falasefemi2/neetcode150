package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Question1Test {

    Question1 question1 = new Question1();

    @Test
    public void testHasDuplicate() {
        int[] nums = { 1, 2, 3, 3 };
        assertTrue(question1.hasDuplicate(nums));
    }

    @Test
    public void testNoDuplicate() {
        int[] nums = { 1, 2, 3, 4 };
        assertFalse(question1.hasDuplicate(nums));
    }

    @Test
    public void testAllDuplicates() {
        int[] input = { 7, 7, 7, 7 };
        assertTrue(question1.hasDuplicate(input));
    }
}
