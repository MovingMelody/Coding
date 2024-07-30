### Tags/Topics

`arrays`, `sorting`, `two-pointers`, `sliding-window`, `hashing`, `hash-table`, `kadens`, `cyclic-sort`

🧬 → Algorithm Problem <br/>
💎 → Gem

[Java Cheat Sheet Notion Link ↗][def34]

<!-- Popular Algorithms  -->

### Popular Algorithms

| Algorithm                                                                                | Description                                                                                                                                                               |
| ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [🧬 💎 Find the Duplicate Number - Floyd's Cycle Detection Algo - Tortoise & Hare][def9] |                                                                                                                                                                           |
| [Linear Search Algorithm + Recursion Version LS][def16]                                  |                                                                                                                                                                           |
| [Binary Search Algorithm + Order-Agnostic BS][def19]                                     |                                                                                                                                                                           |
| [Bubble Sort Algorithm][def28]                                                           | Compare every two adjacent elements and swap them if the first is > than second element. Largest element will be kept at the end after each pass                          |
| [Selection Sort Algorithm][def29]                                                        | Pick the ith smallest element in each iteration and put it at correct index. Idea is to find the min/max element in an unsorted array and then put it at correct position |
| [Insertion Sort Algorithm][def31]                                                        |                                                                                                                                                                           |
| [HashMaps & Hashing Concept][def41]                                                      |                                                                                                                                                                           |

<!-- Arrays -->

### Arrays

- [ ] [Valid Mountain Array][def10] `Easy`
- [ ] [Rotate Array][def6] `Medium` `Two Pointers`
- [ ] 💎 [Product of Array Except Itself][def5] `Medium` `Prefix Sum` `Suffix Sum`
- [ ] [Minimum Size Subarray Sum][def4] `Medium` `Two Pointers` `Sliding Window`
- [ ] [LC 349. Intersection of Two Arrays][def3] `Easy`
- [x] [Check If arrays is sorted & Rotated][def] `Easy`
- [x] [Remove Duplicates From Sorted Array][def2] `Easy`
- [ ] 💎 [Move Zeroes][move_zeros] `Easy`
- [ ] 🧬 [Majority Element - Moore's Voting Algorithm][def12] `Easy`
- [x] 💎 [Number of Arithmetic Triplets][def18] `Easy`
- [ ] 💎 [Remove Duplicates From Sorted Array II][def20] `Medium`

<!-- Strings  -->

### Strings

| Solved                  | Problem Details              | Description |
| ----------------------- | ---------------------------- | ----------- |
| <ul><li> [ ] </li></ul> | [Valid Anagram][def7] `Easy` |             |

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

<!-- Two Pointers  -->

### Two Pointers

- [ ] [167 Two Sum II - Input Array Is Sorted][def11] `Medium`
- [ ] [💎 125 Valid Pallindrome][def14] `Easy`
- [x] [💎 680 Valid Pallindrome II][def15] `Easy`
- [ ] [💎 LC 13. 3Sum][def17] `Medium`

<!-- Stack  -->

### Stack

| Solved                  | Problem Details                                                                             | Description                                                                                                     |
| ----------------------- | ------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| <ul><li> [ ] </li></ul> | [Implement Stack Operations - Push, Pop, Peek, Increment(uptoIndex, incrementValue)][def35] | Implement the given stack operations in O(1) Time Complexity. Especially INC operation is bit interesting here. |

<!-- Dynamic Programming  -->

### Dynamic Programming

| Solved                  | Problem Details                                 | Description                                                                             |
| ----------------------- | ----------------------------------------------- | --------------------------------------------------------------------------------------- |
| <ul><li> [ ] </li></ul> | [121. Best Time to Buy and Sell a Stock][def30] | Keep track of min price before the ith price and subtract min price from current price. |

<!-- HashTable  -->

### HashTable

| Solved                  | Problem Details                                           | Description                                                                                                                                                                                                                                                                 |
| ----------------------- | --------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <ul><li> [ ] </li></ul> | [💎 1002. Find Common Characters][def8] `Easy`            |                                                                                                                                                                                                                                                                             |
| <ul><li> [ ] </li></ul> | [202. Happy Number][def32] `Easy` `Floyd Cycle Detection` | Solution1: Store 'n' value in HashMap until (!set.contains(n)) and return true if n becomes 1. Solution2: Use Two-Pointers Fast & Slow and detect cycle using floyds cycle algo. Slow and Fast pointers will move until they become equal. return if slow == 1 or fast == 1 |
| <ul><li> [ ] </li></ul> | [205. Isomorphic Strings][def33] `Easy`                   | Use HashMap and store the key value mappings, next time when key comes again in 's' then it's value should be equal to current char of 't'                                                                                                                                  |
| <ul><li> [x] </li></ul> | [2090. Word Pattern][def36] `Easy`                        | Same as Isomorphic Strings Problem                                                                                                                                                                                                                                          |
| <ul><li> [x] </li></ul> | [💎 2248. Intersection of Multiple Arrays][def37] `Easy`  | Combination of Sorting and Hashing. Super Interesting Problem.                                                                                                                                                                                                              |
| <ul><li> [ ] </li></ul> | [13. Roman to Integer][def38] `Medium`                    |                                                                                                                                                                                                                                                                             |
| <ul><li> [ ] </li></ul> | [💎 12. Integer to Roman][def39] `Medium`                 |                                                                                                                                                                                                                                                                             |
| <ul><li> [x] </li></ul> | [💎 49. Group Anagrams][def40] `Medium`                   | Just one loop is enough. Sort each string and use that sorted one as key in hashmap and put the actual string as value. Anagrams will be grouped under each key                                                                                                             |
| <ul><li> [ ] </li></ul> | [💎 128. Longest Consecutive Sequence][def42] `Medium`    | Brute force way is to sort the array and find the longest sequence. Optimized way: Put all the elements in a HashSet and loop through the array again check if (x-1) exists in set or not. If not the x might be the starting point of longest sequence.                    |
| <ul><li> [ ] </li></ul> | [💎 Encode & Decode Strings][def43] `Medium`              |                                                                                                                                                                                                                                                                             |

<!-- Bit Manipulation  -->

### Bit Manipulation

- [ ] [✨ Missing Number][def13] `Easy` `Math` `cyclic-sort`

### Cyclic Sort

Problems that can be solved using cyclic sort technique

- [Find the Duplicate Number - Using Cyclic Sort][def9]
- [645. Set Mismatch][def44]
- [442. Find all Duplicates in an Array][def45]
- [448. Find All Numbers Disappeared in an Array][def46]
- [268. Missing Number][def47]

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
