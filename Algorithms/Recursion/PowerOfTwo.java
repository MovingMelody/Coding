/*
* Created on 04 Sep 2024
* 
* @author Sai Sumanth
*/

// https://leetcode.com/problems/power-of-two/description/

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwoBit(-8878));
    }

    /*
     * Iterative Approach
     */
    public static boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    /*
     * Using Recursion
     */
    public static boolean isPowerOfTwoRecur(int n) {
        if (n < 1)
            return false;
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return n == 1;
    }

    /*
     * Using Bit Manipulation
     */
    public static boolean isPowerOfTwoBit(int n) {
        if (n < 1)
            return false;
        return (n & (n - 1)) == 0;
    }

}
