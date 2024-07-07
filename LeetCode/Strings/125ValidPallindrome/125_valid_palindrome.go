/*
* Created on 30 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println("125 Valid Pallindrome Leetcode")
	// fmt.Println(isPalindrome("A man, a plan, a canal: Panama"))
	fmt.Println(isPalindrome("0P"))

}

func isPalindrome(s string) bool {
	temp := ""
	for _, x := range s {
		if (x > 64 && x < 91) || (x > 96 && x < 123) || (x > 47 && x < 58) {
			temp += strings.ToLower(string(x))
		}
	}
	left, right := 0, len(temp)-1
	for left <= right {
		if temp[left] != temp[right] {
			return false
		}
		left++
		right--
	}

	fmt.Println(temp)
	return true
}
