## God Level Logics

### Divisors of Number

```java
/*

LINK -> https://leetcode.com/problems/perfect-number/description/

Instead of iterating from 1 to num, we can iterate only upto the √n

if 2 is the factor of 28 then 28/2 is also a factor which is 14

and √num * √num = num (so we iterate only up to √num)
*/
func checkPerfectNumber(num int) bool {
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
```
