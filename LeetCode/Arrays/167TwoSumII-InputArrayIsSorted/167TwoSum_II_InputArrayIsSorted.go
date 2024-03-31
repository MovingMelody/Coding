/*
* Created on 30 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

/*
   Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
   Topics - two-pointers, arrays
   Solved ? ✅
*/
/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
*/
func main() {
	fmt.Println("Two Sum II - Input Array is Sorted - Leetcode")
	fmt.Println(twoSum([]int{2, 7, 11, 15}, 9))
}

func twoSum(numbers []int, target int) []int {
	res := make([]int, 2)
	l, r := 0, len(numbers)-1
	for l < r {
		sum := numbers[l] + numbers[r]
		if sum == target {
			res[0] = l + 1
			res[1] = r + 1
			break
		} else if sum > target {
			r--
		}else{
			l++
		}
	}

	return res
}
