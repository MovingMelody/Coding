/*
* Created on 06 July 2024
* 
* @author Sai Sumanth
*/

package MissingNumber_268;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("LC 268 Missing Number");
        /*
         * This problem can be solved in multiple ways
         * 
         * 1. Sort the array and match the index with current element -
         * Takes Extra Time 🤡 for sorting
         * 
         * 2. Using basic Math - Sum
         * 3. Using XOR Operation
         */
    }

    /*
     * Subtract the (sum of all array elements) from (Sum of 0 to n)
     * n*(n+1)/2 sum of N formula
     * 
     * To avoid the overflow of sum we can follow the below approach.
     * 
     * [0, 1, 3] contains 3 numbers 0, 1, 2, 3
     * so add 0, 1, 2, 3 to sum variable and subtract each element from array.
     * then final sum will be the missing number
     * 
     */
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sum -= nums[i];
        }
        sum += nums.length;
        return sum;
    }

    /* 
     * xor of same numbers is 0
     */
    public int missingNumberUsingXor(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= i;
            sum ^= nums[i];
        }
        sum ^= nums.length;
        return sum;
    }
}
