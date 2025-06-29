package com.neetcode.slidingwindowquestion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Question15Test {
    Question15 question15 = new Question15();

    @Test
    public void testMaxProfitWhenProfitExists() {
        int[] prices = { 10, 1, 5, 6, 7, 1 };
        int output = 6;

        int result = question15.maxProfit(prices);
        assertEquals(output, result);
    }

    @Test
    public void testMaxProfitWhenPricesOnlyDrop() {
        int[] prices = { 10, 8, 7, 5, 2 };
        int output = 0;

        int result = question15.maxProfit(prices);
        assertEquals(output, result);
    }

    @Test
    public void testEmptyOrSingleElementArray() {
        int[] prices = { 5 };
        int output = 0;

        int result = question15.maxProfit(prices);
        assertEquals(output, result);
    }
}