package com.neetcode.twopointersquestions;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Question12Test {
    Question12 question12 = new Question12();

    @Test
    public void testThreeSum() {
        int[] input = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1));

        List<List<Integer>> result = question12.threeSum(input);
        assertEquals(expected.size(), result.size());
        assertTrue("Result should contain all expected triplets", result.containsAll(expected));
        assertTrue("Result should not contain extra triplets", expected.containsAll(result));
    }
}
