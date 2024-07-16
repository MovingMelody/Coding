### Tags/Topics

`arrays`, `sorting`, `two-pointers`, `sliding-window`, `hashing`, `hash-table`, `kadens`

🧬 → Algorithm Problem <br/>
💎 → Gem

### Topic-wise Important Problems

<!-- Popular Algorithms  -->

### Popular Algorithms

- [ ] [🧬 💎 Find the Duplicate Number - Floyd's Cycle Detection Algo - Tortoise & Hare][def9]
- [ ] [Linear Search Algorithm + Recursion Version LS][def16]
- [ ] [Binary Search Algorithm + Order-Agnostic BS][def19]

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
- [ ] 🧬 [Majority Element][def12] `Easy`
- [x] 💎 [Number of Arithmetic Triplets][def18] `Easy`
- [ ] 💎 [Remove Duplicates From Sorted Array II][def20] `Medium`

<!-- Strings  -->

### Strings

| Solved                 | Problem Details              | Description |
| ---------------------- | ---------------------------- | ----------- |
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
| <ul><li> [ ] </li></ul> | [Search Element in Rotated Sorted Array][def26]                       | First, determine which part of the array is sorted (the part before the mid or the part after the mid). Then figure out where the target lies in the left part or right part of array                                                                                                                               |

<!-- Two Pointers  -->

### Two Pointers

- [ ] [167 Two Sum II - Input Array Is Sorted][def11] `Medium`
- [ ] [💎 125 Valid Pallindrome][def14] `Easy`
- [x] [💎 680 Valid Pallindrome II][def15] `Easy`
- [ ] [💎 LC 13. 3Sum][def17] `Medium`

<!-- Recursion  -->

### Recursion

- [ ]

<!-- HashTable  -->

### HashTable

- [ ] [✨ 1002 Find Common Characters][def8] `Easy` `Strings` `Hash-Table`

<!-- Bit Manipulation  -->

### Bit Manipulation

- [ ] [✨ Missing Number][def13] `Easy` `Math`

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
