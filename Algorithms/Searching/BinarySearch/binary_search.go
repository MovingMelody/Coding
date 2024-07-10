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
	nums := []int{1, 3, 4, 5, 6, 66, 77, 888, 8999, 9999}

	numsD := []int{9999, 8999, 888, 77, 66, 6, 5, 4, 3, 1}

	/// Normal Binary Search - works only for array sorted in ascending order
	fmt.Println(binarySearch(nums, 4))

	/// Order-Agnostic Binary Search
	fmt.Println(orderAgnosticBinarySearch(numsD, 4))

}

// Time -> O(logn)
// if an array contains 100 elements then the worst case time complexity
// is (log 100 base 2) = 6.6(approx 7 times)
func binarySearch(nums []int, target int) int {

	low, high, mid := 0, len(nums)-1, 0

	for low <= high {
		// In 64-bit computer, the highest number you can get is 18,446,744,073,709,551,616
		// So if the number is bigger than that number, you get overflow
		// that's why we use the below formula to calculate the mid instead mid = low + high/2
		mid = low + (high-low)/2

		if nums[mid] == target {
			return mid
		} else if nums[mid] > target {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}

	return -1
}

// Order-Agnostic Binary Search (can be applied on both ascending/descending order Arrays)
func orderAgnosticBinarySearch(nums []int, target int) int {
	length := len(nums)
	low, high := 0, length-1

	// find whether array is sorted in ascending order or desc
	isAsc := nums[0] < nums[length-1]

	for low <= high {
		mid := low + (high-low)/2
		if nums[mid] == target {
			return mid
		}

		if isAsc {
			if nums[mid] > target {
				high = mid - 1
			} else {
				low = mid + 1
			}
		} else {
			if nums[mid] > target {
				low = mid + 1
			} else {
				high = mid - 1
			}
		}
	}

	return -1
}
