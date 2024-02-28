/*
* Created on 28 Feb 2024
* @author Sai Sumanth
 */

// Problem Link -  https://leetcode.com/problems/duplicate-zeros/description/
package main

import (
	"fmt"
)

func main() {
	fmt.Println("GO")
	/*
		Given a fixed-length integer array arr, duplicate each occurrence of zero,
		shifting the remaining elements to the right.

		Note that elements beyond the length of the original array are not written.
		Do the above modifications to the input array in place and do not return anything.

		Example 1:

		Input: arr = [1,0,2,3,0,4,5,0]
		Output: [1,0,0,2,3,0,0,4]
		Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
		Example 2:

		Input: arr = [1,2,3]
		Output: [1,2,3]
		Explanation: After calling your function, the input array is modified to: [1,2,3]


		Constraints:

		1 <= arr.length <= 104
		0 <= arr[i] <= 9
	*/
	arr := []int{1, 0, 2, 3, 0, 4, 5, 0}
	fmt.Println(arr)

	duplicateZeros(arr)
	fmt.Println(arr)
}

func duplicateZeros(arr []int) {
	len := len(arr)
	for i := 0; i < len; i++ {
		if arr[i] == 0 {
			/// shift elements by one place
			for j := len - 1; j > i; j-- {
				arr[j] = arr[j-1]
			}
			fmt.Println("Array after one zero ", arr)
			i++
		}
	}
}
