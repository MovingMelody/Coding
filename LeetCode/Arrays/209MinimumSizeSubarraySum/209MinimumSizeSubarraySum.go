/*
* Created on 31 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
	"math"
)

/*
   Link - https://leetcode.com/problems/minimum-size-subarray-sum/description/
   Topics - sliding-window, two-pointers, arrays
   Solved ? ✅
*/

func main() {
	// Sliding Window, Two Pointers
	fmt.Println("Minimum Size Subarray Sum - Leetcode 209")

	fmt.Println(minSubArrayLen(17, []int{2, 3, 1, 2, 4, 3}))
}

/*
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or
equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
*/

func minSubArrayLen(target int, nums []int) int {
	sum, res := 0, math.MaxInt
	leftPointer := 0
	for i := 0; i < len(nums); i++ {
		sum += nums[i]
		for sum >= target {
			currSize := i - leftPointer + 1
			if currSize < res {
				res = currSize
			}
			fmt.Println("Current Min Size is :", currSize)
			sum -= nums[leftPointer]
			leftPointer++
		}
	}
	if res == math.MaxInt {
		return 0
	}
	return res
}
