<!-- @format -->

Question 1
We are told to check if there is a duplicate in an array of number.

- sort the array: this ensure duplicates numbers are placed side to side.
- Loop through the array from 0 to to length - 2 and compare each element with the next one.
- if 2 element are the same return true.
- if the loop continues and finds no duplicates return false.

Question 2
We are told to find if 2 strings are anagrams to one another

- Convert both strings to lowercase to ignore case differences.
- Convert each string into a character array.
- Sort both character arrays. Sorting ensures that if the strings are anagrams, their characters will be in the same order.
- Compare the two sorted arrays using Arrays.equals(). If they are equal, the strings are anagrams; otherwise, they are not.

Question 3
We are told to return the index of an array of integers and a given target

- Initialize a HashMap to store each number in the array along with its index.
- Loop through the array. For each number:
- Calculate its complement (i.e., target - current number).
- Check if this complement already exists in the map.
- If it does, return the pair of indices — the index of the complement and the current index.
- If no such pair is found by the end of the loop, return an empty array.

Question 4
We are told to group an array of anagrams

- Create a HashMap where:
  - The key is the sorted version of the string (this represents the anagram group)
  - The value is a list of original strings that match this group
- Loop through each word in the input array:
  - Convert the word to a character array
  - Sort the character array to get a standard form
  - Convert the sorted array back to a string (this becomes the key
- Store the word in the HashMap:
  - Use computeIfAbsent() to create a new list if the key is new
  - Add the original word to the correct anagram group
- Return all the values in the map as the final grouped anagrams

Question 5
We are told to get the frequennt 2 numbers in array

- Count Frequencies
  - Use a HashMap<Integer, Integer> to count how many times each number appears in the array.
  - The key is the number, the value is how many times it appears.
- Use Bucket Sort
  - Create a bucket array where each index i holds a list of numbers that appeared exactly i times.
  - So bucket[3] would contain numbers that appeared 3 times, etc.
- Collect the Top K Frequent Elements
  - Loop from the end of the bucket array (highest frequency) down to 0.
  - Add elements to your result list until you've added k of them.
- Convert List to Array
