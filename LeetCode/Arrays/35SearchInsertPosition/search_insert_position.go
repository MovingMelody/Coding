/*
* Created on 10 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Search Insert Position LeetCode - Go Lang")
	fmt.Println(searchInsert([]int{1, 3}, 2))
}

/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

func searchInsert(nums []int, target int) int {
	res := len(nums)
	start, end := 0, res-1

	for start <= end {
		mid := start + (end-start)/2
		if nums[mid] == target {
			return mid
		} else if nums[mid] > target {
			end = mid - 1

		} else {
			start = mid + 1
		}
	}
	// ceil of a number algorithm (find the index of smallest number which is greater than target)
	// so start will always be in quest of finding that ceil of target. so start will be our insert position
	return start
}
