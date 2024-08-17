/*
* Created on 06 July 2024
* 
* @author Sai Sumanth
*/

// cyclic-sort

package MissingNumber_268;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("LC 268 Missing Number");
        System.out.println(missingNumber(new int[] { 0, 2, 3, 1, 5 }));
        System.out.println(missingNumberUsingXor(new int[] { 0, 2, 3, 1, 5 }));
        System.out.println(missingNumberCyclicSort(new int[] { 9, 6, 4, 2, 3, 5, 7, 8, 1 }));
        /*
         * This problem can be solved in multiple ways
         * 
         * 1. Sort the array and match the index with current element -
         * Takes Extra Time 🤡 for sorting
         * 
         * 2. Using basic Math - Sum
         * 3. Using XOR Operation
         * 4. Perform Cyclic Sorting and find the missing Number
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
    public static int missingNumberUsingXor(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= i;
            sum ^= nums[i];
        }
        sum ^= nums.length;
        return sum;
    }

    public static int missingNumberCyclicSort(int[] nums) {
        int res = nums.length;
        int index = 0;
        while (index < nums.length) {
            int correctIndexOfCurrentNumber = nums[index]; // 0...N so index will be same as number
            if (correctIndexOfCurrentNumber < nums.length && nums[index] != nums[correctIndexOfCurrentNumber]) {
                // put the current number at correct index
                int temp = nums[index];
                nums[index] = nums[correctIndexOfCurrentNumber];
                nums[correctIndexOfCurrentNumber] = temp;
            } else {
                // if the number is at correct index then increment index
                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                res = i;
                break;
            }
        }
        return res;

    }

}
