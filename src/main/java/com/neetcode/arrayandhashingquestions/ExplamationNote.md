### Question 1: Contains Duplicate

**Goal:** Check if any number appears more than once in a list of numbers.

**Analogy:** Imagine you have a box of numbered balls and you need to see if you have any two balls with the same number.

**Method: Using a Hash Set (A Digital Checklist)**

This is a highly efficient way to solve the problem.

*   **Why use a Set?** A `HashSet` is a special data structure that only allows unique items. If you try to add a number that's already in the set, it won't add it again. We can use this property to our advantage.

*   **Steps:**
    1.  **Create an empty checklist:** Initialize an empty `HashSet`. This set will keep track of the numbers we've seen so far.
    2.  **Go through the numbers one by one:** Loop through each number in the input list.
    3.  **Check the list:** For each number, ask the `HashSet`: "Have you seen this number before?"
    4.  **Found a duplicate?** If the set says "Yes," you've found a duplicate! You can immediately stop and return `true`.
    5.  **No duplicate yet?** If the set says "No," add the current number to the set so you can remember you've seen it.
    6.  **Finish the loop:** If you get through the entire list without the set ever finding a duplicate, it means every number was unique. In this case, return `false`.

### Question 2: Valid Anagram

**Goal:** Determine if two strings are anagrams of each other (i.e., they are made of the same letters, just in a different order). For example, "listen" and "silent" are anagrams.

**Analogy:** Imagine you have two piles of Scrabble tiles. You want to know if both piles contain the exact same set of letters and the same count for each letter.

**Method: Sorting the Letters**

The simplest way to check for an anagram is to put the letters of each word in a standard order.

*   **Why sort?** If two words are anagrams, they are made of the exact same letters. So, if you sort the letters of both words alphabetically, the result will be identical.
    *   `"listen"` sorted becomes `"eilnst"`
    *   `"silent"` sorted becomes `"eilnst"`

*   **Steps:**
    1.  **Quick check:** First, check if the two strings have the same length. If they don't, they can't possibly be anagrams, so you can return `false` right away.
    2.  **Convert to character lists:** Turn each string into a list of its individual characters.
    3.  **Sort both lists:** Sort the character lists for both original strings alphabetically.
    4.  **Compare:** Check if the two sorted lists are exactly equal. If they are, the strings are anagrams, and you should return `true`. Otherwise, return `false`.

### Question 3: Two Sum

**Goal:** Given a list of numbers and a target number, find the two numbers in the list that add up exactly to that target. Return their positions (indices) in the list.

**Analogy:** You have a menu of items with prices (the list of numbers) and a specific total amount you want to spend (the target). You need to find two items on the menu that cost exactly that total amount.

**Method: Using a HashMap (A "Lookup" Table)**

This method is very fast because it avoids checking every single pair of numbers.

*   **Why use a HashMap?** A `HashMap` lets you store and retrieve information instantly. We can use it to remember a number we've seen and, more importantly, *where* we saw it (its index).

*   **Steps:**
    1.  **Create an empty lookup table:** Initialize a `HashMap`. This map will store numbers from the list as keys and their indices as values.
    2.  **Look at each number one by one:** Loop through your list of numbers.
    3.  **Calculate the difference:** For each number you look at, calculate the "complement" – the other number you would need to find to reach the target.
        *   `complement = target - current_number`
    4.  **Check the lookup table:** Ask the `HashMap`: "Have I already seen this complement number in the list?"
    5.  **Found a pair!** If the map says "Yes," you've found your pair! You can immediately return the index of the complement (which you stored in the map) and the index of the current number.
    6.  **No pair yet?** If the complement is not in the map, add the *current number* and its index to the map. This is so you can use it for a potential match later in the loop.
    7.  **No solution:** If you go through the whole list and never find a matching pair, it means no such pair exists.

### Question 4: Group Anagrams

**Goal:** From a list of words, group together all the words that are anagrams of each other.

**Analogy:** You have a huge pile of words, and you want to sort them into boxes. Each box should only contain words that are anagrams of each other.

**Method: Using a HashMap with a "Signature" Key**

The key idea is to create a unique "signature" for each anagram group. The easiest signature to create is the sorted version of a word.

*   **Why this method?** All anagrams, when their letters are sorted, produce the exact same string. We can use this sorted string as a "key" to group them.
    *   "eat", "tea", and "ate" all have the signature `"aet"`.

*   **Steps:**
    1.  **Create an organizer:** Initialize an empty `HashMap`. This map will use the sorted-word signature as the label (key) for each group (value, which will be a list of words).
    2.  **Go through each word:** Loop through every word in your input list.
    3.  **Create the signature:** For each word, create its signature by converting it to a character array, sorting it, and turning it back into a string.
    4.  **Find the right group:** Use this signature to find the correct group (the list) in your organizer map.
    5.  **Add the word to its group:** Add the original word (e.g., "eat") to the list associated with its signature ("aet"). If a group for this signature doesn't exist yet, the map will create a new empty list for it before adding the word.
    6.  **Return the groups:** After you've checked all the words, the values in your map are the lists of grouped anagrams. Return all of these lists.

### Question 5: Top K Frequent Elements

**Goal:** From a list of numbers, find the `k` numbers that appear most frequently.

**Analogy:** You have a big bag of marbles of many different colors. You want to find the top `k` colors that you have the most of.

**Method: Count and Bucket**

This is a clever method that avoids fully sorting all the numbers by their frequency, which can be slow.

*   **Step 1: Count the Frequencies**
    *   First, you need to know how many times each number appears. A `HashMap` is perfect for this.
    *   Loop through the input list and store the counts. The number will be the key, and its frequency (how many times it appears) will be the value.

*   **Step 2: Group by Frequency using "Bucket Sort"**
    *   Now, we group the numbers by their counts. Imagine a row of buckets, labeled from 0 up to the maximum possible frequency.
    *   Create an array of lists (our "buckets"). The index of the array represents the frequency.
    *   Go through your frequency map. If a number appeared 3 times, put that number into the list at `bucket[3]`. If a number appeared 5 times, put it into `bucket[5]`.

*   **Step 3: Collect the Top K Elements**
    *   To find the most frequent numbers, you just need to check your buckets starting from the end (the highest frequency) and working your way down.
    *   Create an empty list for your results.
    *   Loop from the last bucket down to the first. For each bucket that isn't empty, add all the numbers from that bucket to your result list.
    *   Stop as soon as your result list contains `k` numbers.

### Question 6: Encode and Decode Strings

**Goal:** Design a system that can take a list of words, turn it into a single string (encode), and then be able to turn that single string back into the original list of words (decode).

**Analogy:** You want to send a list of separate messages (e.g., "I'm", "fine", "!") as one long, continuous text message. The receiver must be able to perfectly split the text back into "I'm", "fine", and "!".

**Method: Length Prefixing with a Delimiter**

*   **The Challenge:** You can't just join the words together (e.g., `"Imfine!"`), because you lose the information about where each word ends. A word could even contain the start of the next word.

*   **The Solution:** Before each word, we will add its length and a special character (a "delimiter," like `#`) that we know won't be in the words themselves.

*   **Encode (List to Single String):**
    1.  Start with an empty string builder (which is an efficient way to build strings).
    2.  For each word in the input list:
    3.  Get the length of the word.
    4.  Append the length, then the `#` delimiter, then the word itself to the string builder.
    5.  **Example:** `["hello", "world"]` becomes `5#hello5#world`.
    6.  **Example:** `["neet", "code"]` becomes `4#neet4#code`.
    7.  Convert the string builder to the final encoded string.

*   **Decode (Single String to List):**
    1.  Start at the beginning of the encoded string (let's say at index `i = 0`).
    2.  Create an empty list to store the decoded words.
    3.  **Loop** as long as your position `i` is inside the string:
        a. Find the `#` delimiter. The characters you read before it form the number that tells you the length of the next word.
        b. Extract that length.
        c. Use that length to extract the actual word, which starts right after the `#`.
        d. Add the extracted word to your results list.
        e. **Crucially**, update your position `i` to be at the start of the *next* encoded block (right after the word you just extracted).
    4.  Return the list of words.

### Question 7: Product of Array Except Self

**Goal:** Given a list of numbers, create a new list where each element at index `i` is the product of all numbers in the original list *except* for the one at index `i`.

**Analogy:** Imagine you are in a line of people, and each person is holding a number. For each person, you want to calculate the product of the numbers held by everyone else in the line, excluding their own number.

**Method: The Prefix and Postfix Pass**

This is a clever and efficient method that avoids using division. It solves the problem in two passes (loops) over the list.

*   **Why this method?** The product of everything except yourself is simply `(product of everything to your left) * (product of everything to your right)`.

*   **Steps:**
    1.  **Create the result list:** Initialize a new list of the same size as the input, filled with `1`s.
    2.  **The Prefix Pass (Left-to-Right):**
        *   We'll loop through the list from left to right. We use a variable, let's call it `prefix_product`, which starts at `1`.
        *   For each position `i`, we first set `result[i]` to the current `prefix_product`. This stores the product of all the numbers that came *before* it.
        *   Then, we update `prefix_product` by multiplying it with the number at the current position, `nums[i]`, to prepare it for the next step.
    3.  **The Postfix Pass (Right-to-Left):**
        *   Now, we do a similar thing but from the other direction. We'll use a new variable, `postfix_product`, which also starts at `1`.
        *   We loop through the list from right to left.
        *   For each position `i`, we multiply the *existing* value in `result[i]` (which currently holds the prefix product) by the `postfix_product`. This gives us the final answer for that position.
        *   Then, we update `postfix_product` by multiplying it with the number at `nums[i]` to get it ready for the next step in the loop.
    4.  **Return the result:** After the second pass, the `result` list will hold the correct products.

### Question 8: Valid Sudoku

**Goal:** Check if a 9x9 Sudoku board is valid. This means checking that there are no repeated numbers in any row, any column, or any of the nine 3x3 sub-grids.

**Analogy:** You are a referee for a Sudoku game. You need to check the board for rule violations. You have three sets of checklists: one for each of the 9 rows, one for each of the 9 columns, and one for each of the nine 3x3 squares.

**Method: Using Hash Sets for Checklists**

We can use `HashSet`s as our digital checklists because they are very fast at telling us if we've "seen" a number before in a particular context (row, column, or box).

*   **Steps:**
    1.  **Prepare the checklists:** Create three arrays of `HashSet`s:
        *   `rows`: An array of 9 sets, one for each row.
        *   `cols`: An array of 9 sets, one for each column.
        *   `boxes`: An array of 9 sets, one for each 3x3 box.
    2.  **Scan the entire board:** Loop through every single cell of the 9x9 grid, from top-left to bottom-right.
    3.  **For each cell:**
        a. Get the value in the cell. If it's an empty dot (`.`), just skip it and move to the next cell.
        b. **Check for violations:** For the number in the current cell, check it against your three checklists:
            *   Check the set for the current **row**. Have we seen this number in this row before? If yes, the board is invalid. Return `false`.
            *   Check the set for the current **column**. Have we seen this number in this column before? If yes, the board is invalid. Return `false`.
            *   Check the set for the current **3x3 box**. Have we seen this number in this box before? If yes, the board is invalid. Return `false`. (A simple formula `(row / 3) * 3 + (col / 3)` can tell you which of the 9 boxes you are in).
        c. **Update the checklists:** If there were no violations, add the current number to all three corresponding sets (the row set, the column set, and the box set) so you can check against it later.
    4.  **No violations found:** If you get through the entire board without finding any rule violations, the Sudoku is valid. Return `true`.