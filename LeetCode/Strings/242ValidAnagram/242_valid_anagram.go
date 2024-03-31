/*
* Created on 29 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

/*
Link - https://leetcode.com/problems/valid-anagram/description/
Topics - strings, sorting, hashing, hash-table
Solved ? ✅ 
*/
func main() {
	fmt.Println("Valid Anagram - Leetcode")
	// fmt.Println(isAnagram("anagram", "nagaram"))
	fmt.Println(isAnagram2("anagram", "nagaram"))
}

// using hash map - extra space
func isAnagram(s string, t string) bool {
	mp := make(map[rune]int)

	if len(t) != len(s) {
		return false
	}

	for _, x := range s {
		mp[x]++
	}
	for _, x := range t {
		mp[x]--
	}

	for _, v := range mp {
		if v != 0 {
			return false
		}
		// fmt.Printf("key %v - value %v\n", k, v)
	}
	return true
}

// using extra space - array as hash-table
func isAnagram2(s string, t string) bool {
	mp := make([]int, 26)

	if len(t) != len(s) {
		return false
	}

	for _, x := range s {
		mp[x-'a']++
	}
	for _, x := range t {
		mp[x-'a']--
	}

	for k, v := range mp {
		if v != 0 {
			return false
		}
		fmt.Printf("key %v - value %v\n", string(rune(k+'a')), v)
	}
	return true
}
