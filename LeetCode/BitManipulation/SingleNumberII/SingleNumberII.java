package SingleNumberII;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Created on 06 July 2024
* 
* @author Sai Sumanth
*/

class SingleNumberII {
    public static void main(String[] args) {
        System.out.println("LC 137 - Single Number II");

        int res = singleNumberII(new int[] { 0, 1, 0, 1, 0, 1, 99 });
        System.out.println(res);

        // Better Approach
        res = singleNumberIIBitManipulation(new int[] { 8, 2, 2, 2 });
        System.out.println(res);

        // Optimal 1
        res = singleNumberIIBySorting(new int[] { 8, 2, 2, 2 });
        System.out.println(res);

        // Most Optimal 😎 Bit Manipulation
        res = singleNumberIIOptimal(new int[] { 2, 2, 2, 3, 5, 3, 5, 3, 5, 6 });
        System.out.println(res);

    }

    /*
     * Brute Force - Using Extra Space 🤡
     */
    public static int singleNumberII(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int x : nums) {
            hash.put(x, hash.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    /*
     * Bit Manipulation Approach
     * consider [2, 2, 2, 4]
     * 0 1 0
     * 0 1 0
     * 0 1 0
     * 1 0 0
     * 
     * Count the number of 1's at each bitIndex for all numbers,
     * If it's NOT multiple of 3 then set the bitIndex in result as 1
     * 
     * so out result will be "1 0 0" which is 8
     * 
     * TC -> O(N * 32)
     */
    public static int singleNumberIIBitManipulation(int[] nums) {
        int res = 0;
        for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
            int onesCount = 0;
            // loop through each number in array
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & (1 << bitIndex)) != 0)
                    onesCount++;
            }
            if (onesCount % 3 != 0) {
                // set the ith bit in res as 1
                res = res | (1 << bitIndex);
            }
        }
        return res;
    }

    public static long intToBinary(int x) {
        return Long.parseLong(Integer.toBinaryString(x));
    }

    /*
     * By Sorting the arry
     * Time Complexity -> O(n logn) Better than compared to O(n * 32)
     */
    public static int singleNumberIIBySorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 3) {
            // no need to check nums[i+1] because only one number is not repeated
            // if nums[i] == nums[i-1] then for sure nums[i+1] will also be same
            if (nums[i] != nums[i - 1])
                return nums[i - 1];
        }

        // edge case when nums = [2, 2, 2, 3, 3, 3, 5 ] because i will go only 4th index
        // after that i+=3 will exceed the array length
        return nums[nums.length - 1];
    }

    /*
     * Using Buckets concept
     */
    public static int singleNumberIIOptimal(int[] nums) {
        int ones = 0, twos = 0;

        for (int x : nums) {
            ones = ones ^ x & ~twos;
            twos = twos ^ x & ~ones;
        }

        return ones;
    }
}
