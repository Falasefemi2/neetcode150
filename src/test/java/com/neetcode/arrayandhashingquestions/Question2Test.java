package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Question2Test {

    Question2 question2 = new Question2();

    @Test
    public void testIsAnagram() {
        String s = "racecar";
        String t = "carrace";

        assertTrue(question2.isAnagram(s, t));
    }

    @Test
    public void testNoAnagram() {
        String s = "jar";
        String t = "jam";

        assertFalse(question2.isAnagram(s, t));
    }
}
