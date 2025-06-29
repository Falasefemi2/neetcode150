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

### Question 16: Longest Substring Without Repeating Characters

**Goal:** Given a string `s`, find the length of the longest substring without repeating characters.

**Method: Sliding Window with a Set**

- **Why this method?** A sliding window is perfect for finding the longest substring that meets a certain condition. We use a set to keep track of the characters currently in our window, allowing for quick checks for duplicates.

- **Steps:**
  1.  Initialize a `Set` to store characters in the current window, `left` pointer to 0, and `maxLen` to 0.
  2.  Iterate through the string with a `right` pointer (the loop variable `i`).
  3.  If the current character is already in the set, shrink the window from the left until the duplicate is removed.
  4.  Add the current character to the set.
  5.  Update `maxLen` with the new maximum length (`right - left + 1`).
  6.  Return `maxLen`.

### Question 17: Longest Repeating Character Replacement

**Goal:** You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times. Return the length of the longest substring containing the same letter you can get after performing the above operations.

**Method: Sliding Window with Frequency Map**

- **Why this method?** The problem asks for the longest substring, which suggests a sliding window. We need to keep track of the frequency of characters in the window to know if we can make them all the same with `k` replacements.

- **Steps:**
  1.  Initialize a frequency map (`freq`), `left` pointer to 0, `maxLen` to 0, and `maxFreq` to 0 (to track the count of the most frequent character in the window).
  2.  Iterate through the string with a `right` pointer.
  3.  Increment the frequency of the current character and update `maxFreq`.
  4.  Check if the window is valid: `(window length - maxFreq) > k`. If not, shrink the window from the left.
  5.  Update `maxLen`.
  6.  Return `maxLen`.

### Question 18: Permutation in String

**Goal:** Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

**Method: Sliding Window with Frequency Maps**

- **Why this method?** We are looking for a substring in `s2` that is an anagram of `s1`. A sliding window of the same size as `s1` can be moved across `s2` to check for this condition efficiently.

- **Steps:**
  1.  Create frequency maps for `s1` and the initial window in `s2`.
  2.  If the maps are equal, return `true`.
  3.  Slide the window over `s2`, updating the window's frequency map by adding the new character and removing the old one.
  4.  After each slide, compare the frequency maps. If they match, return `true`.
  5.  If the end of `s2` is reached without a match, return `false`.

### Question 19: Minimum Window Substring

**Goal:** Given two strings `s` and `t`, return the minimum window in `s` which will contain all the characters in `t`.

**Method: Sliding Window with Two Pointers and a Map**

- **Why this method?** This is a classic sliding window problem. We need to find a substring that satisfies a condition (contains all characters of `t`), and we want the shortest such substring.

- **Steps:**
  1.  Create a frequency map (`need`) for the characters in `t`.
  2.  Use two pointers, `left` and `right`, to define the window.
  3.  Expand the window by moving `right`. Keep a count of how many characters from `t` we have satisfied.
  4.  Once the window is valid (contains all characters of `t`), start shrinking it from the `left`.
  5.  Each time you have a valid window, check if it's the smallest one found so far and update the result.
  6.  Continue until `right` reaches the end of `s`.

### Question 20: Sliding Window Maximum

**Goal:** You are given an array of integers `nums`, there is a sliding window of size `k` which is moving from the very left of the array to the very right. You can only see the `k` numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

**Method: Sliding Window with a Deque**

- **Why this method?** A deque (double-ended queue) is ideal for this problem because it allows us to efficiently find the maximum element in the current window. We can keep the deque in decreasing order of values, so the maximum is always at the front.

- **Steps:**
  1.  Initialize a `Deque` to store indices of elements in the current window and a `result` array.
  2.  Iterate through `nums`.
  3.  Remove indices from the front of the deque that are no longer in the window.
  4.  Remove indices from the back of the deque whose corresponding elements are smaller than the current element (maintaining the decreasing order).
  5.  Add the current index to the deque.
  6.  If the window is fully formed, add the element at the index at the front of the deque to the `result` array.
  7.  Return `result`.