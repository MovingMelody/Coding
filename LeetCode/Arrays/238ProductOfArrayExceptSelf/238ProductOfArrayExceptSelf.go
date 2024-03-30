/*
* Created on 30 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

/*
   Link - https://leetcode.com/problems/product-of-array-except-self/description/
   Topics - arrays, prefix-sum
   Solved ? ✅ (But Took Editorial Help for O(1) Space)
*/
/*
Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Follow up: Can you solve the problem in O(1) extra space complexity?
(The output array does not count as extra space for space complexity analysis.)
*/
func main() {
	fmt.Println("238 Product Of Array Except Self - Leetcode")
	// using two loops
	fmt.Println(productExceptSelf([]int{1, 2, 3, 4}))

	// using division operation 😁 (but this approach doesn't work if array contains 0😑)
	fmt.Println(productExceptSelfBetterApproach([]int{1, 2, 3, 4}))

	// optimized approach - suffix, prefix product ✨
	fmt.Println(productExceptSelfOptimized([]int{2, 3, 4, 5}))

	// Most Optimized 😎
	fmt.Println(productExceptSelfMostOptimized([]int{2, 3, 4, 5}))
}

// 1. Brute Force Approach 💀
// using nested loops
// Time Complexity - O(n^2)
// Space Complexity - O(n) Extra Space
func productExceptSelf(nums []int) []int {
	fmt.Println("Brute Force")
	res := make([]int, len(nums))
	for i := 0; i < len(nums); i++ {
		product := 1
		for j := 0; j < len(nums); j++ {
			if i != j {
				product *= nums[j]
			}
		}
		res[i] = product
	}
	return res
}

// 2. Better Approach - Using Division Operation
// but fails for arrays having 0 as element
func productExceptSelfBetterApproach(nums []int) []int {
	fmt.Println("Using Division Operation")
	// better approach - using division operation
	wholeProduct := 1
	for i := 0; i < len(nums); i++ {
		wholeProduct *= nums[i]
	}
	for i := 0; i < len(nums); i++ {
		nums[i] = wholeProduct / nums[i]
	}
	return nums
}

// 3. Optimized Approach ✨
// Time Complexity - O(n)
// Space Complexity - O(n)
func productExceptSelfOptimized(nums []int) []int {
	fmt.Println("Optimized Approach ✨ but with extra space")
	l := len(nums)
	res := make([]int, l)

	/// Extra arrays
	prefixP := make([]int, l)
	suffixP := make([]int, l)

	prefixP[0] = nums[0]
	suffixP[l-1] = nums[l-1]

	/// calculate suffix product and prefix product
	for i := 1; i < l; i++ {
		prefixP[i] = nums[i] * prefixP[i-1]
		suffixP[l-i-1] = nums[l-i-1] * suffixP[l-i]
	}

	fmt.Println("Prefix Product : ", prefixP)
	fmt.Println("Suffix Product : ", suffixP)

	for i := 1; i < l-1; i++ {
		res[i] = prefixP[i-1] * suffixP[i+1]
	}
	res[0] = suffixP[1]
	res[l-1] = prefixP[l-2]

	return res
}

// Most optimized approach 😎
// Time - O(n)
// Space - O(1) {The output array does not count as extra space for space complexity analysis}
func productExceptSelfMostOptimized(nums []int) []int {
	fmt.Println("Most Optimized 😎")
	len := len(nums)
	res := make([]int, len)
	prefixProd := 1
	for i := 0; i < len; i++ {
		res[i] = prefixProd
		prefixProd *= nums[i]
	}

	suffixProd := 1
	for i := len-1; i >= 0; i-- {
		res[i] *= suffixProd
		suffixProd *= nums[i]
	}
	return res
}
