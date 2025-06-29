package com.neetcode.slidingwindowquestion;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question19Test {

    Question19 question19 = new Question19();

    @Test
    public void testMinWindow() {
        String s = "OUZODYXAZV";
        String t = "XYZ";
        String expected = "YXAZ";
        assertEquals(expected, question19.minWindow(s, t));
    }

    @Test
    public void testExample2() {
        String s = "xyz";
        String t = "xyz";
        String expected = "xyz";
        assertEquals(expected, question19.minWindow(s, t));
    }

    @Test
    public void testExample3() {
        String s = "x";
        String t = "xy";
        String expected = "";
        assertEquals(expected, question19.minWindow(s, t));
    }

    @Test
    public void testEmptyStrings() {
        String s = "";
        String t = "";
        String expected = "";
        assertEquals(expected, question19.minWindow(s, t));
    }

    @Test
    public void testNoMatch() {
        String s = "abc";
        String t = "z";
        String expected = "";
        assertEquals(expected, question19.minWindow(s, t));
    }
}
