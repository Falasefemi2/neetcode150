<!-- @format -->

### Question 15: Best Time to Buy and Sell Stock

**Goal:** You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

**Analogy:** You are watching the stock market and want to make the most money possible. You can only buy once and sell once. You want to find the lowest price to buy and the highest price to sell *after* you've bought.

**Method: The Sliding Window Approach (or One-Pass Approach)**

This problem can be solved efficiently in a single pass, which is conceptually similar to a sliding window where the window size changes.

- **Why this method?** We need to find the largest difference between two numbers in the array, but with the constraint that the smaller number (buy price) must come before the larger number (sell price). A simple brute-force check of all pairs would be too slow. By iterating through the array once, we can keep track of the lowest price seen so far and calculate the potential profit at each step.

- **Steps:**
  1.  **Initialize variables:**
      - `minPrice`: Set this to a very large number (or the first price in the array) to keep track of the lowest stock price encountered so far.
      - `maxProfit`: Set this to 0 to store the maximum profit found.
  2.  **Iterate through the prices:** Loop through the `prices` array one day at a time.
  3.  **Update the minimum price:**
      - At each day, check if the current `price` is lower than `minPrice`. If it is, you've found a new best day to buy, so update `minPrice` to the current price.
  4.  **Calculate potential profit:**
      - If the current `price` is *not* lower than `minPrice`, it means you could potentially sell on this day. Calculate the profit you would make by selling at the current `price` and buying at `minPrice` (`profit = price - minPrice`).
      - Compare this `profit` with your `maxProfit` so far. If it's higher, update `maxProfit`.
  5.  **Return the result:** After the loop has finished, `maxProfit` will hold the highest possible profit. Return `maxProfit`.
