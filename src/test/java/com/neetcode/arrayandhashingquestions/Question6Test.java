package com.neetcode.arrayandhashingquestions;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Question6Test {
    Question6 question6 = new Question6();

    @Test
    public void testDecode() {
        String encoded = "4#neet4#code4#love3#you";
        List<String> expected = Arrays.asList("neet", "code", "love", "you");

        List<String> result = question6.decode(encoded);

        assertEquals(expected, result);
    }

    @Test
    public void testEncode() {
        List<String> words = Arrays.asList("neet", "code", "love", "you");
        String encoded = question6.encode(words);

        List<String> decoded = question6.decode(encoded);
        assertEquals(words, decoded);
    }
}
