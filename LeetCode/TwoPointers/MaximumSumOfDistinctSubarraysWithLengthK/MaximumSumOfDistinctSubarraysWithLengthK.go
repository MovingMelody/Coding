/*
* Created on 31 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Maximum Sum of Distinct Subarrays With Length K")
	// fmt.Println(maximumSubarraySum([]int{4, 3, 3, 3, 2}, 5))
	fmt.Println(maximumSubarraySum([]int{1, 1, 1, 7, 8, 9}, 3))
}

/*
We need to find the max sum subarray of size k but the subarray should contain all distinct elements
*/
func maximumSubarraySum(nums []int, k int) int64 {
	var res int64 = 0
	var window_sum int64 = 0
	mp, l := make(map[int]int), len(nums)
	distinctValues := 0
	/// calculate first window sum
	for i := 0; i < k; i++ {
		window_sum += int64(nums[i])
		mp[nums[i]]++
		if mp[nums[i]] == 1 {
			distinctValues++
		}
	}

	// if first three elements are distinct
	if distinctValues == k {
		res = window_sum
	}

	for i := k; i < l; i++ {
		mp[nums[i-k]]--
		if mp[nums[i-k]] == 0 {
			distinctValues--
		}

		// update the freq of newly added number in the current sliding window
		mp[nums[i]]++
		if mp[nums[i]] == 1 {
			distinctValues++
		}

		// calculate current window sum
		window_sum = window_sum + int64(nums[i]) - int64(nums[i-k])

		if window_sum > res && distinctValues == k {
			res = window_sum
		}
	}
	return res
}
