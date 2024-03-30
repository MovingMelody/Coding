/*
* Created on 10 March 2024
* @author Sai Sumanth
 */
package main
import (
	"fmt"
)
/*
https://leetcode.com/problems/perfect-number/description/

A perfect number is a positive integer that is equal to the sum of its positive divisors, 
excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28

*/

func main() {
	fmt.Println("507 Perfect Number - LEETCODE")
	fmt.Println(checkPerfectNumber(7))
	fmt.Println(checkPerfectNumber2(28))
}

// 1. Brute Force
// Time -> O(n)
// Space -> O(1)
func checkPerfectNumber(num int) bool {
	sum := 0
	for x := 1; x <= num/2; x++ {
		if num%x == 0 {
			sum += x
		}
		if sum > num {
			return false
		}
	}
	return sum == num
}

// 2. Optimal Solution
// Time -> O(√n)

/*
Instead of iterating from 1 to num, we can iterate only upto the √n

if 2 is the factor of 28 then 28/2 is also a factor which is 14

and √num * √num = num (so we iterate only up to √num)
*/
func checkPerfectNumber2(num int) bool {
	sum := 0
	for i := 1; i*i <= num; i++ {
		if num%i == 0 {
			fmt.Println(i)
			// now i is one factor
			// eg: 28%2 == 0, so 2 is one factor. and another factor is 28/2 = 14
			sum += i
			if i*i != num {
				// if i = 4 and num = 16 the we will add 4 again if (i*i != num) this check is not performed
				/// adding another factor as well
				sum += num / i
				fmt.Println("Another factor is :", num/i)
			}
		}
	}
	// when i is 1 we are adding both 1 and num to sum (1 is first factor and another factor is num/1 = num)
	// so as per the question we need to exclude the num itself
	return sum-num == num
}
