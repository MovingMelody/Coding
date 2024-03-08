/*
* Created on 28 Feb 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
	"time"
)

func main() {
	fmt.Println("GO")
	/*
		Given an integer array nums, rotate the array to the right by k steps, where k is non-negative

		Example 1:

		Input: nums = [1,2,3,4,5,6,7], k = 3
		Output: [5,6,7,1,2,3,4]
		Explanation:
		rotate 1 steps to the right: [7,1,2,3,4,5,6]
		rotate 2 steps to the right: [6,7,1,2,3,4,5]
		rotate 3 steps to the right: [5,6,7,1,2,3,4]
		Example 2:

		Input: nums = [-1,-100,3,99], k = 2
		Output: [3,99,-1,-100]
		Explanation:
		rotate 1 steps to the right: [99,-1,-100,3]
		rotate 2 steps to the right: [3,99,-1,-100]
	*/
	timeNow := time.Now()
	len := 5
	n := make([]int, len)
	// k := 999999
	k := 2
	for i := 0; i < len; i++ {
		n[i] = i*8 + 2
	}
	fmt.Println("Array before Rotating: ", n)

	// 1. Brute Force 💀
	// rotate(n, k)

	// 2. With Extra Space 😌
	// rotateArrayWithExtraSpace(n, k)

	// 3. Without extra space and O(n) time 😎
	mostOptimized(n, k)

	fmt.Printf("Array after %d Rotations %v\n", k, n)
	fmt.Printf("Process finished in %v\n", time.Since(timeNow))

}

// first approach bruteforce
func rotate(nums []int, k int) {
	len := len(nums)
	lastElement := 0
	for r := 0; r < k; r++ {
		lastElement = nums[len-1]
		for i := len - 1; i > 0; i-- {
			nums[i] = nums[i-1]
		}
		nums[0] = lastElement
	}
	// fmt.Println("Array after Rotation : ", nums)
}

// this method uses extra space
func rotateArrayWithExtraSpace(nums []int, k int) {
	len := len(nums)
	extraSpace := make([]int, len)

	for i := 0; i < len; i++ {
		extraSpace[(i+k)%len] = nums[i]
	}
	copy(nums, extraSpace)
}

func mostOptimized(nums []int, k int) {
	len := len(nums)
	l, r := 0, len-1
	k = k % len

	// 1. first reverse the whole array
	reverseArray(nums, l, r)

	// 2. Reverse the first k elements
	reverseArray(nums, l, k-1)

	// 3. Reverse the remaining elements
	reverseArray(nums, k, len-1)

}

func reverseArray(nums []int, l, r int) {
	temp := 0
	for l < r {
		temp = nums[l]
		nums[l] = nums[r]
		nums[r] = temp
		l++
		r--
	}
}
