### Tags/Topics

`arrays`, `sorting`, `two-pointers`, `sliding-window`, `hashing`, `hash-table`, `kadens`, `cyclic-sort`

🧬 → Algorithm Problem <br/>
💎 → Gem

### Basic Concepts

- [Imp Code Snippets/Logics](imp_logics.md)
- [Java Cheat Sheet Notion Link ↗][def34]
- [Var Args - Java][def51]
- [Loops & Conditions][def52]
- [Strings & StringBuilder - Java][def53]
- [Boxing, Unboxing, Auto-boxing - Java][def54]
- [Patterns][def59]
- [Second Largest Element][def86]

<!-- Popular Algorithms  -->

### Popular Algorithms

| Algorithm                                                                                | Description                                                                                                                                                                                                                                                                                                               |
| ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [🧬 💎 Find the Duplicate Number - Floyd's Cycle Detection Algo - Tortoise & Hare][def9] |                                                                                                                                                                                                                                                                                                                           |
| [Linear Search Algorithm + Recursion Version LS][def16]                                  |                                                                                                                                                                                                                                                                                                                           |
| [Binary Search Algorithm + Order-Agnostic BS][def19]                                     |                                                                                                                                                                                                                                                                                                                           |
| [Bubble Sort Algorithm][def28]                                                           | Compare every two adjacent elements and swap them if the first is > than second element. Largest element will be kept at the end after each pass                                                                                                                                                                          |
| [Selection Sort Algorithm][def29]                                                        | Pick the ith smallest element in each iteration and put it at correct index. Idea is to find the min/max element in an unsorted array and then put it at correct position                                                                                                                                                 |
| [Insertion Sort Algorithm][def31]                                                        |                                                                                                                                                                                                                                                                                                                           |
| [Merge Sort - Two Way Iterative Approach][def78]                                         |                                                                                                                                                                                                                                                                                                                           |
| [How to merge 3 lists at a time using 3-way merging approach][def82]                     | Merge 3 sorted lists using 3 pointers. But in general we will be using only 2-way merging method to merge n lists. let's suppose n is 3. first merge the lists A,B and then merge C with A,B result. So in this way two lists will be merged in each step. The same approach will be used in merge sort algorithm as well |
| [Merge Sort - Recursive Approach][def79]                                                 |                                                                                                                                                                                                                                                                                                                           |
| [HashMaps & Hashing Concept][def41]                                                      |                                                                                                                                                                                                                                                                                                                           |
| [Sieve Of Eratosthenes - Prime Numbers][def71]                                           | Find all the primes in a given range                                                                                                                                                                                                                                                                                      |
| [SQRT of a Number][def72]                                                                | Find the SQRT of a Number using Binary Search. Even if number is not a perfect square                                                                                                                                                                                                                                     |
| [Euclidean Algorithm - GCD of Two Nums][def73]                                           | Find GCD of two nums. Brute force, Eculidean Algorithm (Repeated Subtraction & Repeated Division)                                                                                                                                                                                                                         |

<!-- Arrays -->

### Arrays

| Problem Details                                                              | Description                                                                                                                                          |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Valid Mountain Array][def10] `Easy`                                         |                                                                                                                                                      |
| [Rotate Array][def6] `Medium` `Two Pointers`                                 |                                                                                                                                                      |
| 💎 [Product of Array Except Itself][def5] `Medium` `Prefix Sum` `Suffix Sum` |                                                                                                                                                      |
| [Minimum Size Subarray Sum][def4] `Medium` `Two Pointers` `Sliding Window`   |                                                                                                                                                      |
| [LC 349. Intersection of Two Arrays][def3] `Easy`                            |                                                                                                                                                      |
| [Check If arrays is sorted & Rotated][def] `Easy`                            |                                                                                                                                                      |
| [Remove Duplicates From Sorted Array][def2] `Easy`                           |                                                                                                                                                      |
| 💎 [Move Zeroes][move_zeros] `Easy`                                          |                                                                                                                                                      |
| 🧬 [Majority Element - Moore's Voting Algorithm][def12] `Easy`               |                                                                                                                                                      |
| 💎 [Number of Arithmetic Triplets][def18] `Easy`                             |                                                                                                                                                      |
| 💎 [Remove Duplicates From Sorted Array II][def20] `Medium`                  |                                                                                                                                                      |
| 💎💎 [ 442. Find all Duplicates in an Array][def49] `Medium`                 |                                                                                                                                                      |
| 💎 [41. First Missing Positive][def55] `Hard`                                |                                                                                                                                                      |
| 💎 [2028. Find missing observations][def84] `Medium`                         | Nice Math Problem. It's all about dividing `missingRollSum` into n parts. Each roll min val will be `missingRollSum/n` and consider quotient as well |

<!-- 2D Arrays  -->

### 2D Arrays

| Status                  | Problem Details                     | Description |
| ----------------------- | ----------------------------------- | ----------- |
| <ul><li> [x] </li></ul> | [289. Game of Life][def74] `Medium` |             |

<!-- Strings  -->

### Strings

| Problem Details                                                                  | Description                                                                                                                                                                                               |
| -------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [Valid Anagram][def7] `Easy`                                                     |                                                                                                                                                                                                           |
| [796. Rotate String - Find if s can become g after some rotations][def56] `Easy` | **BruteForce:** return (s+s).contains(g). **Optimal:** Get the starting index (s.char(i) == g.charAt(i)) and check if the strings are equal. Use (i%len) if pointers goes out of index.                   |
| [Reverse words in a String][def58] `Medium`                                      |                                                                                                                                                                                                           |
| [💎💎 14. Longest Common Prefix][def90]                                          | **BruteForce:** find the minlen of all string and check the each char of each string until minlen. **Optimal:** sort the given list of strings. find the max common prefix len for first and last strings |
| [💎 Generate All Substrings, Subsequences, Permutations of String ][def101]      |                                                                                                                                                                                                           |

<!-- Binary Search  -->

### Binary Search

| Solved                  | Problem Details                                                       | Description                                                                                                                                                                                                                                                                                                         |
| ----------------------- | --------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <ul><li> [x] </li></ul> | [Find Smallest letter greater than target][def21] `Easy`              | Find the ceil of a given letter in the array                                                                                                                                                                                                                                                                        |
| <ul><li> [x] </li></ul> | [Search Insert Position][def25]                                       | Same as finding the Ceil of a given target                                                                                                                                                                                                                                                                          |
| <ul><li> [x] </li></ul> | 💎 [First & Last position of element in sorted array][def22] `Medium` | Find the given target using normal Binary Search. once the target is found at mid, it could be the potential first or last index, but more target elements may exists before or after mid. so if we are finding the first index then set end pointer to mid - 1 or if it's last index, set start pointer to mid + 1 |
| <ul><li> [x] </li></ul> | 💎 [852 Peak Index in a Mountain Array][def23]                        |                                                                                                                                                                                                                                                                                                                     |
| <ul><li> [x] </li></ul> | 💎 [Find in Mountain Array][def24] `Hard`                             | Find the peak index first. Then apply order-agnostic binary search on both the arrays (before peak and after peak)                                                                                                                                                                                                  |
| <ul><li> [ ] </li></ul> | [33. Search Element in Rotated Sorted Array][def26]                   | First, determine which part of the array is sorted (the part before the mid or the part after the mid using condition `(nums[start] <= middle)` ). Then figure out where the target lies in the left part or right part of array                                                                                    |
| <ul><li> [ ] </li></ul> | [81. Search Element in Rotated Sorted Array 2][def27]                 | Same as above problem. But one extra condition `if(middle == nums[start] && middle == nums[end])` will be added since duplicate elements are there `[1, 0, 1, 1, 1]`. In that condition we have to move start and end pointers as long as both the values are same.                                                 |

<!-- Sorting -->

### Sorting

| Problem                                                            | Description                        |
| ------------------------------------------------------------------ | ---------------------------------- |
| [3301. Maximize the Total Height of Unique Towers][def96] `Medium` | Hashmaps & Sorting usecase problem |

<!-- Two Pointers  -->

### Two Pointers

| Revised Status          | Problem Details                                          | Description                            |
| ----------------------- | -------------------------------------------------------- | -------------------------------------- |
| <ul><li> [ ] </li></ul> | [167 Two Sum II - Input Array Is Sorted][def11] `Medium` |                                        |
| <ul><li> [ ] </li></ul> | [💎 125 Valid Pallindrome][def14] `Easy`                 |                                        |
| <ul><li> [ ] </li></ul> | [💎 680 Valid Pallindrome II][def15] `Easy`              |                                        |
| <ul><li> [ ] </li></ul> | [💎 LC 13. 3Sum][def17] `Medium`                         |                                        |
| <ul><li> [ ] </li></ul> | [💎 88 Merge Sorted Array][def48] `Medium`               |                                        |
| <ul><li> [ ] </li></ul> | [💎 Duplicate Zeros][def87] [code][def89]                | use extra array to generate the result |

### Sliding Window

| Problem Details                                                       | Description                                                                                                                                                                                                                                                                                                 |
| --------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [💎 209. Minimum Size Subarray Sum][def99]                            | Keep on calculating the sum. and check if sum >= target then decrease the windown size from left and update min length                                                                                                                                                                                      |
| [💎 1493. Longest Subarray of 1's After Deleting One Element][def102] | Maintain a sliding window where there is at most one zero in it.                                                                                                                                                                                                                                            |
| [1423. Maximum Points You Can Obtain from Cards][def105]              | **With Extra Space(prefix sum):** Calculate total sum of array now maintain the subarray of len n-k and remove it's sum from total sum. **Constant Window Optimal:** Calculate the first k elements sum(first window) now subtract one element from left and add one element from right to that window sum. |
| [3. Longest substring without repeating characters][def106]           | Use hashmap and keep track of each char last appeared index. if the repeat is found then move the window's left pointer                                                                                                                                                                                     |

<!-- Prefix Sum & Suffix Sum  -->

### Prefix Sum & Suffix Sum

| Problem Details                                              | Description                                                                                                                                                                                                     |
| ------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [💎 GFG: Longest Sub-Array with Sum K (+ve and -ve)][def104] | This problem looks like a **sliding window** problem but it can't be solved using sliding window approach because array contains -ve & +ve numbers. So we need to use **HashMap** and store the prefixsum,index |

<!-- Recursion  -->

### Recursion

| Revision                | Problem Details                                       | Description                                                                                    |
| ----------------------- | ----------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| <ul><li> [ ] </li></ul> | [💎💎 Recursion Concept][def57]                       | Fibonacci, Factorial, Sum Of Digits, Reverse a Number, Pow(x,n), Binary Search Using Recursion |
| <ul><li> [ ] </li></ul> | [💎💎 Recursion on Arrays][def77]                     | Reverse Array, IsArraySorted, Linear Search, Search in Rotated Sorted Array                    |
| <ul><li> [ ] </li></ul> | [💎💎 Find all Indexes of target in Array ][def77]    | A Recursive fn whole return type is List. With & without passing the list in arguments.        |
| <ul><li> [ ] </li></ul> | [💎 50. Pow(x,n)][def60]                              | Naive Recursive approach to Recursive calls Optimized approach                                 |
| <ul><li> [ ] </li></ul> | [Count Zeros (or any digit) in a Number][def50]       | Count Zeros in a given number using recursion                                                  |
| <ul><li> [ ] </li></ul> | [Number of Steps to Reduce a Number to Zero][def76]   |                                                                                                |
| <ul><li> [ ] </li></ul> | [💎 Print Triangle Patterns using Recursion][def75]   |                                                                                                |
| <ul><li> [ ] </li></ul> | [Bubble Sort & Selection Sort Using Recursion][def80] |                                                                                                |
| <ul><li> [ ] </li></ul> | [💎 Recursion on Strings][def81]                      | Remove a specific char, Subsets, Subsequences, Generate all subsets of array                   |
| <ul><li> [ ] </li></ul> | [231. Is Power of 2][def83] `Easy`                    | Call the fn recursively until number becomes 1 or any other odd number. If 1 return true.      |

<!-- Stack  -->

### Stack

| Problem Details                                                                                | Description                                                                                                     |
| ---------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| [💎 Implement Stack Operations - Push, Pop, Peek, Increment(uptoIndex, incrementValue)][def35] | Implement the given stack operations in O(1) Time Complexity. Especially INC operation is bit interesting here. |
| [2696. Minimum String Length After Removing Substrings][def100]                                | Pretty good problem to get started with Stack Data structure.                                                   |

<!-- Heap/PriorityQueue  -->

### Heap/PriorityQueue

| Problem Details                                           | Description                                  |
| --------------------------------------------------------- | -------------------------------------------- |
| [2530. Maximal Score After Applying K Operations][def103] | pretty good problem to get started with Heap |

<!-- Dynamic Programming  -->

### Dynamic Programming

| Solved                  | Problem Details                                    | Description                                                                             |
| ----------------------- | -------------------------------------------------- | --------------------------------------------------------------------------------------- |
| <ul><li> [ ] </li></ul> | [💎 121. Best Time to Buy and Sell a Stock][def30] | Keep track of min price before the ith price and subtract min price from current price. |

<!-- HashTable  -->

### HashTable/Counting

| Problem Details                                                | Description                                                                                                                                                                                                                                                                 |
| -------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [💎 1002. Find Common Characters][def8] `Easy`                 |                                                                                                                                                                                                                                                                             |
| [202. Happy Number][def32] `Easy` `Floyd Cycle Detection`      | Solution1: Store 'n' value in HashMap until (!set.contains(n)) and return true if n becomes 1. Solution2: Use Two-Pointers Fast & Slow and detect cycle using floyds cycle algo. Slow and Fast pointers will move until they become equal. return if slow == 1 or fast == 1 |
| [205. Isomorphic Strings][def33] `Easy`                        | Use HashMap and store the key value mappings, next time when key comes again in 's' then it's value should be equal to current char of 't'                                                                                                                                  |
| [2090. Word Pattern][def36] `Easy`                             | Same as Isomorphic Strings Problem                                                                                                                                                                                                                                          |
| [💎 2248. Intersection of Multiple Arrays][def37] `Easy`       | Combination of Sorting and Hashing. Super Interesting Problem.                                                                                                                                                                                                              |
| [13. Roman to Integer][def38] `Medium`                         |                                                                                                                                                                                                                                                                             |
| [💎 12. Integer to Roman][def39] `Medium`                      |                                                                                                                                                                                                                                                                             |
| [💎 49. Group Anagrams][def40] `Medium`                        | Just one loop is enough. Sort each string and use that sorted one as key in hashmap and put the actual string as value. Anagrams will be grouped under each key                                                                                                             |
| [💎 128. Longest Consecutive Sequence][def42] `Medium`         | Brute force way is to sort the array and find the longest sequence. Optimized way: Put all the elements in a HashSet and loop through the array again check if (x-1) exists in set or not. If not the x might be the starting point of longest sequence.                    |
| [💎 Encode & Decode Strings][def43] `Medium`                   |                                                                                                                                                                                                                                                                             |
| [Find the Length of the Longest Common Prefix][def88] `Medium` | SOLVED. store all the prefixes of each num in one array in hashset and iterate through another set to find the longest prefix                                                                                                                                               |
| [💎💎 1497. Check If Array Pairs Are Divisible by k][def97]    | suppose k = 5, now we can say 7 and 3 is a pair whose sum is divisible by 5 by checking the modulo of 7 and 3. Sum of Mod of each number should be equal to k. 7%5 is 2 and 3%5 is 3. so 2 + 3 is 5, that's how we can find a pair.                                         |

<!-- Maths & Bit Manipulation  -->

### Maths & Bit Manipulation

| Solved                  | Problem Details                                           | Description                                                                                                                                                                                                                                             |
| ----------------------- | --------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <ul><li> [x] </li></ul> | [✨ Bit Manipulation Basics][def63]                       | Find the ith Bit(set or not); Swap Two Numbers using XOR; Set the ith Bit of a Number; Clear the ith Bit; Count the set bits                                                                                                                            |
| <ul><li> [x] </li></ul> | [💎 67. Add Binary][def69]                                | Add two given binary numbers using math.                                                                                                                                                                                                                |
| <ul><li> [x] </li></ul> | [Binary to Decimal][def62]                                |                                                                                                                                                                                                                                                         |
| <ul><li> [x] </li></ul> | [✨ Missing Number][def13] `Easy`                         |                                                                                                                                                                                                                                                         |
| <ul><li> [x] </li></ul> | [389. Find the Difference][def61] `Easy`                  |                                                                                                                                                                                                                                                         |
| <ul><li> [ ] </li></ul> | [231. Is Power of 2][def64] `Easy`                        | If a number if power of two then and between n & n-1 should be 0. If n is power of two then obviously there will be only one 1 in binary representation.                                                                                                |
| <ul><li> [ ] </li></ul> | [2220. Minimum Bit Flips to Convert Number][def65] `Easy` | we have to flip the bits if they are not same. so xor will be 1 if the two bits are different. so Integer.countBits(start ^ goal)                                                                                                                       |
| <ul><li> [ ] </li></ul> | [78. Subsets][def66] `Medium`                             | Use binary numbers as marking and pick the elements from given array when the bit in each number is 1                                                                                                                                                   |
| <ul><li> [x] </li></ul> | [136. Single Number][def67] `Easy`                        | Since every number is repeated twice except one. perform xor of all the numbers. Same numbers xor results in zero                                                                                                                                       |
| <ul><li> [ ] </li></ul> | [137. Single Number II][def68] `Medium`                   | Check each bit (32 bits) of all given numbers. Sum of the no. of ones at each ith bit position across all numbers should be a multiple of 3; if not, set the ith bit in the result.                                                                     |
| <ul><li> [ ] </li></ul> | [XOR of numbers from L to R][def70] `Easy`                | Start writing xor of numbers from 1 to 8 or 12, you'll observe a pattern. So based on that if we want xor of range getXorOfN(left-1) ^ getXorOfN(right); 4 to 7 means (1 to 7) ^ (1 to 3)                                                               |
| <ul><li> [ ] </li></ul> | [💎 453. Minimum Moves to Equal Array Elements][def98]    | Instead of thinking abt how to increment elements to make them equal, consider how many decrements it would take to reduce all the elements equal to smallest value. Incrementing all elements except one is the same as decrementing only one element. |

<!-- Cyclic Sort  -->

### Cyclic Sort

Problems that can be solved using cyclic sort technique

- [Find the Duplicate Number - Using Cyclic Sort][def9]
- [645. Set Mismatch][def44]
- [442. Find all Duplicates in an Array][def49]
- [448. Find All Numbers Disappeared in an Array][def46]
- [268. Missing Number][def47]
- [CSES Missing Number][def92]

<!-- Bucket Sort  -->

### Bucket Sort

Problems that can be solved using Bucket sort technique

- [💎 Minimum Time Difference][def85]

### CSES Problem Set

**Introductory Problems:** [Weird Algorithm][def91], [Missing Number][def92], [Repetitions][def93], [Increasing Array][def94], [Permutations][def95]

**Dynamic Programming:**

[def]: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
[def2]: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
[def3]: https://leetcode.com/problems/intersection-of-two-arrays/
[move_zeros]: LeetCode/Arrays/MoveZeros
[def4]: https://leetcode.com/problems/minimum-size-subarray-sum/description/
[def5]: https://leetcode.com/problems/product-of-array-except-self/description/
[def6]: https://leetcode.com/problems/rotate-array/description/
[def7]: https://leetcode.com/problems/valid-anagram/description/
[def8]: LeetCode/HashTable/1002FindCommonCharacters.java
[def9]: LeetCode/Arrays/FindTheDuplicateNumber.java
[def10]: https://leetcode.com/problems/valid-mountain-array/description/
[def11]: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
[def12]: LeetCode/Arrays/MajorityElement_169/MajorityElement.java
[def13]: LeetCode/BitManipulation/MissingNumber_268
[def14]: LeetCode/Strings/125ValidPallindrome
[def15]: LeetCode/TwoPointers/ValidPallindromeII_680
[def16]: Algorithms/Searching/LinearSearch
[def17]: LeetCode/Arrays/ThreeSum_15
[def18]: LeetCode/Arrays/NumberOfArithmeticTriplets_2367
[def19]: Algorithms/Searching/BinarySearch
[def20]: LeetCode/Arrays/RemoveDuplicatesFromSortedArrayII
[def21]: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
[def22]: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
[def23]: LeetCode/Arrays/PeakIndexInaMountainArray
[def24]: https://leetcode.com/problems/find-in-mountain-array/description/
[def25]: LeetCode/Arrays/35SearchInsertPosition
[def26]: LeetCode/Arrays/SearchInRotatedSortedArray
[def27]: LeetCode/Arrays/SearchInRotatedSortedArrayII
[def28]: Algorithms/Sorting/BubbleSort.java
[def29]: Algorithms/Sorting/SelectionSort.java
[def30]: LeetCode/Arrays/BestTimeToBuyAndSellStock/BestTimeToBuyAndSellStock.java
[def31]: Algorithms/Sorting/InsertionSort.java
[def32]: LeetCode/HashTable/HappyNumber
[def33]: LeetCode/HashTable/IsomorphicStrings
[def34]: https://coherent-candle-2b4.notion.site/Java-Cheat-Sheet-8c0f17dceeea4c949c001802df290977?pvs=4
[def35]: RandomProblems/StackGoogleQuestion.java
[def36]: LeetCode/HashTable/WordPattern
[def37]: LeetCode/HashTable/IntersectionOfMultipleArrays
[def38]: LeetCode/HashTable/RomanToInteger
[def39]: LeetCode/HashTable/IntegerToRoman
[def40]: LeetCode/HashTable/GroupAnagrams
[def41]: DataStructures/HashMap
[def42]: LeetCode/HashTable/LongestConsecutiveSequence
[def43]: LeetCode/HashTable/EncodeDecodeStrings
[def44]: https://leetcode.com/problems/set-mismatch/
[def45]: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
[def46]: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
[def47]: https://leetcode.com/problems/missing-number/description/
[def48]: LeetCode/TwoPointers/MergeSortedArray
[def49]: LeetCode/Arrays/FindAllDuplicatesInArray
[def51]: OOPS_JAVA/VarArgs.java
[def52]: OOPS_JAVA/LoopsAndConditions.java
[def53]: OOPS_JAVA/StringsIntro.java
[def54]: OOPS_JAVA/StringsIntro.java
[def55]: LeetCode/Arrays/FirstMissingPositive
[def56]: https://leetcode.com/problems/rotate-string/description/
[def57]: Algorithms/Recursion
[def58]: LeetCode/TwoPointers/ReverseWordsInString
[def59]: RandomProblems/Patterns.java
[def60]: Algorithms/Recursion/Pow.java
[def61]: https://leetcode.com/problems/find-the-difference/description/
[def62]: Algorithms/Maths/BinaryToDecimal.java
[def63]: Algorithms/Maths/BitManipulationBasics.java
[def64]: https://leetcode.com/problems/power-of-two/description/
[def65]: LeetCode/BitManipulation/MinBitFlipsToConvert
[def66]: LeetCode/BitManipulation/SubSets
[def67]: https://leetcode.com/problems/single-number/
[def68]: LeetCode/BitManipulation/SingleNumberII
[def69]: LeetCode/BitManipulation/AddBinary
[def70]: https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1
[def71]: Algorithms/Maths/SieveOfEratosthenes.java
[def72]: Algorithms/Maths/SquareRootOfNumber.java
[def73]: Algorithms/Maths/GCD.java
[def74]: LeetCode/Arrays/GameOfLife
[def50]: Algorithms/Recursion/CountZerosInNumber.java
[def76]: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
[def77]: Algorithms/Recursion/RecursionOnArrays.java
[def75]: Algorithms/Recursion/PatternsUsingRecursion.java
[def78]: Algorithms/Sorting/MergeSort2WayIterative.java
[def79]: Algorithms/Sorting/MergeSort.java
[def80]: Algorithms/Recursion/SortingUsingRecursion.java
[def81]: Algorithms/Recursion/RecursionOnStrings.java
[def82]: Algorithms/Sorting/3-way-merging.py
[def83]: Algorithms/Recursion/PowerOfTwo.java
[def84]: LeetCode/Arrays/FindMissingObservations
[def85]: LeetCode/Maths/MinimumTimeDifference
[def86]: DataStructures/Arrays/SecondLargestElementInArray/SecondLargestElementInArray.go
[def87]: https://leetcode.com/problems/duplicate-zeros/description/
[def88]: https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/?envType=daily-question&envId=2024-09-24
[def89]: LeetCode/Arrays/01DuplicateZeros/duplicate_zeros.go
[def90]: LeetCode/Strings/LongestCommonPrefix
[def91]: RandomProblems/WeirdAlgorithm.java
[def92]: RandomProblems/MissingNumber.java
[def93]: RandomProblems/CSESRepetitions.java
[def94]: RandomProblems/CsesIncreasingArray.java
[def95]: RandomProblems/CSESPermutations.java
[def96]: LeetCode/Sorting/MaximizeTheTotalHeightOfUniqueTowers
[def97]: LeetCode/HashTable/CheckIfArrayPairsAreDivisibleByK
[def98]: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
[def99]: LeetCode/Arrays/209MinimumSizeSubarraySum
[def100]: LeetCode/Stack/2696
[def101]: DataStructures/Strings/substring_subsequence_permutations.go
[def102]: LeetCode/TwoPointers/LongestSubarrayof1sAfterRemovingOne
[def103]: LeetCode/Heaps/LC2530
[def104]: LeetCode/HashTable/LongestSubarrayWithSumK
[def105]: LeetCode/TwoPointers/LC1423
[def106]: LeetCode/TwoPointers/LC3
