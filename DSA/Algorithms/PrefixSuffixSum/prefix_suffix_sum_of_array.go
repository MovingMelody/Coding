/*
* Created on 30 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

// Prefix Sum & Suffix Sum Array Techniques
func main() {
	fmt.Println("Prefix Sum of an Array")

	fmt.Println(prefixSum([]int{1, 2, 3, 4, 5, 10}))

	fmt.Println("Suffix Sum of an Array")
	fmt.Println(suffixSum([]int{1, 2, 3, 4, 5, 10}))
}

/*
In an array of integers n, the prefix sum array is the array whose every element
is the sum of all elements, of the original array, up to the current index.

Example:

Given an array of n=5 , array[]={1,2,3,4,5}
Its Prefix Sum array will be p[]
p[0]=array[0]=1;
p[1]=array[0]+array[1]=1+2=3;
p[2]=array[0]+array[1]+array[2]=1+2+3=6;
p[3]=array[0]+array[1]+array[2]+array[3]=1+2+3+4=10;
p[4]=array[0]+array[1]+array[2]+array[3]+array[4]=1+2+3+4+5=15;
Final Prefix Sum Array would be={1,3,6,10,15}

*/
// [1, 2, 3, 4, 5, 10] -> [1, 3, 6, 10, 15, 25]
func prefixSum(nums []int) []int {
	/// start from second element and store the sum of 1st and 2nd in second place
	for i := 1; i < len(nums); i++ {
		nums[i] = nums[i-1] + nums[i]
	}
	return nums
}

// [1, 2, 3, 4, 5, 10] -> [25, 24, 22, 19, 15, 10]
func suffixSum(nums []int) []int {
	for i := len(nums) - 2; i >= 0; i-- {
		nums[i] = nums[i] + nums[i+1]
	}
	return nums
}
