/*
* Created on 05 March 2024
* @author Sai Sumanth
 */
// strings, loops
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Go Program for Printing all the Substrings of a String")
	s := "catmeows"

	/// Pattern 1
	/// using three loops
	printAllSubStrings1(s)
	fmt.Println("----------------")

	/// using 2 loops (improved version of printAllSubStrings1)
	printAllSubStrings1a(s)
	fmt.Println("\n----------------")

	/// Pattern 2
	printAllSubStrings2(s)
	fmt.Println("\n----------------")

}

// print all the substrings pattern 1
// c
// ca
// cat
// a
// at
// t
func printAllSubStrings1(s string) {
	len := len(s)
	/// starting point of each substring
	for start := 0; start < len; start++ {
		/// ending point of each substring
		for end := start; end < len; end++ {
			/// loop through start and end points of sub string
			for loop := start; loop <= end; loop++ {
				fmt.Printf("%c", s[loop])
			}
			fmt.Println()
		}
	}
}

// using only two loops
func printAllSubStrings1a(s string) {
	len := len(s)
	eachSubString := ""
	for i := 0; i < len; i++ {
		eachSubString = ""
		for j := i; j < len; j++ {
			eachSubString += string(s[j])
			fmt.Println(eachSubString)
		}
	}
}

// print all the substrings pattern 2
// c
// a
// t
// ca
// at
// cat
func printAllSubStrings2(s string) {
	len := len(s)
	for length := 1; length <= len; length++ {
		for start := 0; start < len-length; start++ {
			for loop := start; loop < start+length; loop++ {
				fmt.Printf("%c", s[loop])
			}
			fmt.Println()
		}
	}
}

// for length := 1; length <= len; length++ {
// 	for i := 0; i < len-length; i++ {
// 		for j := i; j < i+length; j++ {
// 			fmt.Printf("%c", s[j])
// 		}
// 		fmt.Println()
// 	}
// }
