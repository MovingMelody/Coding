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
	searchElement := 7

	for i := 0; i < len(list); i++ {
		if list[i] == searchElement {
			fmt.Println("Element Found: ", searchElement)
			break
		}
		fmt.Println(i)
	}
}
