package LongestSubarrayWithSumK;

import java.util.HashMap;

/*
* Created on 17 Oct 2024
* 
* @author Sai Sumanth
*/

class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        // int[] arr = { -13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9,
        // -6 };
        int[] arr = { 1, -1, 2, 3, 2, -1, 3, -2, 1 };
        int target = 6;
        int res = lenOfLongSubarr(arr, arr.length, target);
        System.out.println("Longest subarray with target: " + target + " is: " + res);
    }

    public static int lenOfLongSubarr(int A[], int N, int k) {
        // Complete the function
        int longest = Integer.MIN_VALUE;
        long prefixSum = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            prefixSum += A[i];
            map.putIfAbsent(prefixSum, i);
            if (prefixSum == k) {
                longest = Math.max(longest, i + 1);
            }
            // if the total sum till now is x(which is prefixSum) then we are looking for
            // subarray sum = k.
            // so we need to check if there is any subarray whose sum is x-k(then except
            // this subarray we can consider the remaining subarray as result)
            if (map.containsKey(prefixSum - k)) {
                int lastIndex = map.get(prefixSum - k);
                longest = Math.max(longest, i - lastIndex);
            }
        }
        if (longest == Integer.MIN_VALUE) {
            return 0;
        }
        return longest;
    }
}