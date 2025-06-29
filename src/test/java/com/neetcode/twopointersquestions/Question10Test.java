package com.neetcode.twopointersquestions;

import static org.junit.Assert.*;

import org.junit.Test;

import com.neetcode.twopointersquestions.Question10;

public class Question10Test {
    Question10 question10 = new Question10();

    @Test
    public void testIsPalindrome() {
        String words = "Was it a car or a cat I saw?";

        assertTrue(question10.isPalindrome(words));
    }
}
