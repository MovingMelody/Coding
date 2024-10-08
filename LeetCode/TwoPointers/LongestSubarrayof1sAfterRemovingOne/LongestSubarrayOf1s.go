/*
* Created on 08 Oct 2024
*
* @author Sai Sumanth
 */
package main

import (
	"fmt"
	"math"
)

func main() {
	nums := []int{0, 1, 1, 1, 0, 1, 1, 0, 1}
	res := longestSubarray(nums)
	fmt.Println("longest sub array of 1s after removing one element: ", res)
}

// nums[i] is either 0 or 1
func longestSubarray(nums []int) int {
	longest := math.MinInt
	lastZeroIndex := -1
	lp := 0
	for i, x := range nums {
		// [1,1,0,1] for such cases
		if x == 1 && i == len(nums)-1 {
			if i-lp > longest {
				longest = i - lp
			}
		}

		// every time zero appears calculate the sub array length from last pointer
		if x == 0 {
			if lastZeroIndex != -1 {
				newLen := i - lp - 1
				if newLen > longest {
					longest = newLen
				}
				lp = lastZeroIndex + 1
			}
			lastZeroIndex = i
		}
	}
	if longest == math.MinInt {
		return len(nums) - 1
	}
	return longest
}
