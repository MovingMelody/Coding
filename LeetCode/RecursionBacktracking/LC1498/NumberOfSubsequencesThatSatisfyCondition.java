package LeetCode.RecursionBacktracking.LC1498;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyCondition {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0, mod = (int) 1e9 + 7, j = nums.length - 1;
        // mod = 1000000007;

        // compute all the powers of 2 and mod the values
        int[] pows = new int[nums.length];
        pows[0] = 1;
        for (int i = 1; i < nums.length; ++i)
            pows[i] = pows[i - 1] * 2 % mod;

        int i = 0; // left pointer
        while (j >= i) {
            if (nums[i] + nums[j] <= target) {
                count = (count + pows[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
