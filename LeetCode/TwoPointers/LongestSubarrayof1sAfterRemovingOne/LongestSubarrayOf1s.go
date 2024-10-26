/*
* Created on 08 Oct 2024
*
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

func main() {
	nums := []int{0, 1, 1, 1, 0, 1, 1, 0, 1}
	res := longestSubarray(nums)
	fmt.Println("longest sub array of 1s after removing one element: ", res)
}

// nums[i] is either 0 or 1
func longestSubarray(nums []int) int {
	lastZero, leftPointer, longest := -1, 0, 0
	for i := 0; i < len(nums); i++ {
		if nums[i] == 0 {
			if lastZero != -1 {
				leftPointer = lastZero + 1
			}
			lastZero = i
		}
		if i-leftPointer > longest {
			longest = i - leftPointer
		}
	}
	return longest
}
