package com.neetcode.twopointersquestions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Question13Test {
    Question13 question13 = new Question13();

    @Test
    public void testMaxArea() {
        int[] heights = { 1, 7, 2, 5, 4, 7, 3, 6 };
        int output = 36;

        int result = question13.maxArea(heights);
        assertEquals(output, result);
    }
}
