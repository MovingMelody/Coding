/*
* Created on 06 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Create all sub arrays")

	///
	allSubArraysPattern1([]int{1, 2, 3, 4, 5, 6})

	fmt.Println("------- Pattern 2 --------")

	allSubArraysPattern2([]int{1, 2, 3, 4, 5, 6})
}

// 1
// 12
// 123
// 1234
// 12345
// 2
// 23
// 234
// 2345
// 3
// 34
// 345
// 4
// 45
// 5
func allSubArraysPattern1(arr []int) {
	len := len(arr)
	for i := 0; i < len; i++ {
		for end := i; end < len; end++ {
			for each := i; each <= end; each++ {
				fmt.Print(arr[each])
			}
			/// after printing one sub array hit enter
			fmt.Println()
		}
	}
}

//
func allSubArraysPattern2(arr []int) {
	len := len(arr)

	for length := 1; length <= len; length++ {
		for end := 0; end <= len-length; end++ {
			fmt.Print("[")
			for each := end; each < end+length; each++ {
				if each == end+length-1 {
					fmt.Print(arr[each])
					continue
				}
				fmt.Print(arr[each], ", ")
			}
			fmt.Print("]")

			// after printing one sub array
			fmt.Println()
		}
	}
}
