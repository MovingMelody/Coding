/*
* Created on 31 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
	"math"
	"slices"
)

/*
   Link -
   Topics - arrays
   Solved ? ✅
*/

func main() {
	fmt.Println("Second Largest Element in Array")
	nums := []int{1, 3, 4, 2, 6, 5} // second largest is 5

	naive(nums)

	optimal(nums)
}

// sort the given array and find the second largest
// Time Complexity - O(n * log n)
func naive(nums []int) {
	fmt.Println("BRUTE FORCE APPROACH")
	slices.Sort(nums)
	fmt.Println("Second Largest is : ", nums[len(nums)-2])
}

// Linear Time
func optimal(nums []int) {
	fmt.Println("OPTIMAL APPROACH")
	// find the largest element first
	largest, secondLargest := math.MinInt, math.MinInt

	for _, v := range nums {
		if v > largest {
			largest = v
		}
	}

	fmt.Println("first largest is : ", largest)

	// Now find the second largest
	for _, v := range nums {
		if (secondLargest < v) && (v != largest) {
			secondLargest = v
		}
	}

	fmt.Println("Second largest is : ", secondLargest)

}
