package com.neetcode.twopointersquestions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Question14Test {
    Question14 question14 = new Question14();

    @Test
    public void testTrap() {
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };
        int output = 9;

        int result = question14.trap(height);
        assertEquals(output, result);
    }
}
