package com.neetcode.slidingwindowquestion;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question18Test {

    Question18 question18 = new Question18();

    @Test
    public void testCheckInclusion() {
        String s1 = "abc";
        String s2 = "lecabee";
        assertTrue(question18.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationNotExists() {
        String s1 = "abc";
        String s2 = "lecaabee";
        assertFalse(question18.checkInclusion(s1, s2));
    }

    @Test
    public void testExactMatch() {
        String s1 = "abcd";
        String s2 = "dcba";
        assertTrue(question18.checkInclusion(s1, s2));
    }

    @Test
    public void testEmptyStrings() {
        String s1 = "";
        String s2 = "";
        assertTrue(question18.checkInclusion(s1, s2));
    }

    @Test
    public void testS1LongerThanS2() {
        String s1 = "abcde";
        String s2 = "abc";
        assertFalse(question18.checkInclusion(s1, s2));
    }
}
