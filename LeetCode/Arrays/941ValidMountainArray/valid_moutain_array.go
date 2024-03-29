/*
* Created on 29 March 2024
* @author Sai Sumanth
 */

/*
	Link - https://leetcode.com/problems/valid-mountain-array/description/
	Topics - arrays
	Solved ? ✅
*/

package main

import (
	"fmt"
)

func main() {
	fmt.Println("Valid Mountain Array - Leetcode")
	res := validMountainArray2([]int{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})
	fmt.Println(res)
}

func validMountainArray(arr []int) bool {
	len := len(arr)
	if len < 3 {
		return false
	}
	peakFound := false

	for i := 0; i < len-1; i++ {
		if arr[i] >= arr[i+1] {

			peakFound = true
		}
		if peakFound && arr[i] <= arr[i+1] {
			return false
		}
	}

	return peakFound
}

func validMountainArray2(arr []int) bool {
	len := len(arr)
	left, right := 0, len-1

	if len < 3 {
		return false
	}

	/// climb up
	for (left < len-1) && (arr[left+1] > arr[left]) {
		left++
	}

	/// climb down
	for right > 0 && (arr[right-1] > arr[right]) {
		right--
	}
	// both left and right should stop at same point
	//
	// [0,1,2,3,4,5,6,7,8,9] -> In this case left == right but left should not end at the end of the array
	//
	// [9,8,7,6,5,4,3,2,1,0] -> In this case left == right but right should not be 0
	//
	return left == right && left != len-1 && right != 0
}
