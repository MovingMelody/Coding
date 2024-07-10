/*
* Created on 06 March 2024
* @author Sai Sumanth
 */
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Linear Search Algorithm")
	list := []int{1, 5, 3, 2, 8, 10, 7, 999, 1034}
	searchElement := 1034

	fmt.Println(linearSearchUsingRecursion(list, searchElement, 0))

	for i := 0; i < len(list); i++ {
		if list[i] == searchElement {
			fmt.Println("Element Found: ", searchElement)
			break
		}
		// fmt.Println(i)
		if i == len(list)-1 {
			fmt.Println("Element Not Found in the list")
		}
	}
}

func linearSearchUsingRecursion(arr []int, target int, index int) bool {
	if index >= len(arr) {
		return false
	}
	if target == arr[index] {
		return true
	}
	return linearSearchUsingRecursion(arr, target, index+1)
}
