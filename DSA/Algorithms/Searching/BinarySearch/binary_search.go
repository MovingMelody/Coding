/*
* Created on  March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Binary Search implementation in GO Lang")
	fmt.Println(search([]int{1}, 1))
}

// Time -> O(logn)
// if an array contains 100 elements then the worst case time complexity
// is (log 100 base 2) = 6.6(appro 7) times
func search(nums []int, target int) (res int) {
	res = -1
	low, high, mid := 0, len(nums)-1, 0

	for low <= high {
		// In 64-bit computer, the highest number you can get is 18,446,744,073,709,551,616
		// So if the number is bigger than that number, you get overflow
		// that's why we use the below formula to calculate the mid instead mid = low + high/2
		mid = low + (high-low)/2
		fmt.Println("Mid is ", mid)
		if nums[mid] == target {
			res = mid
			return
		} else if nums[mid] > target {
			high = mid - 1
		} else {
			low = mid + 1
		}
		fmt.Println(low, " ", high)
	}

	return res
}
