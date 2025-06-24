package com.neetcode.arrayandhashingquestions;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Question4Test {
    Question4 question4 = new Question4();

    @Test
    public void testGroupAnagrams() {
        String[] input = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> actual = question4.groupAnagrams(input);

        Set<Set<String>> actualSet = new HashSet<>();
        for (List<String> group : actual) {
            actualSet.add(new HashSet<>(group));
        }

        Set<Set<String>> expectedSet = new HashSet<>();
        expectedSet.add(new HashSet<>(Arrays.asList("stop", "pots", "tops")));
        expectedSet.add(new HashSet<>(Arrays.asList("act", "cat")));
        expectedSet.add(new HashSet<>(Collections.singletonList("hat")));

        assertEquals(expectedSet, actualSet);
    }
}
