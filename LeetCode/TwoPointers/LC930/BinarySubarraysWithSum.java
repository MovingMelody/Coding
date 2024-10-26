/*
* Created on 24 Oct 2024
* 
* @author Sai Sumanth
*/
package LC930;

import java.util.HashMap;
import java.util.Map;

public abstract class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 2;
        System.out.println("Total subarrays with sum: " + goal + " are: " + numSubarraysWithSum(nums, 0));
    }

    // TC -> O(n)
    // SC -> O(n) extra space for hashamap
    // same as 560 Subarray sum equals k
    public static int numSubarraysWithSum(int[] nums, int goal) {

        int totalSubarrays = 0, prefixSum = 0;
        // prefix sum frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            prefixSum += x;
            if (prefixSum == goal)
                totalSubarrays += 1;

            if (map.containsKey(prefixSum - goal)) {
                totalSubarrays += map.get(prefixSum - goal);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return totalSubarrays;
    }

    // 😎 Optimal solution without any extra space
    // count(sum<=goal) - count(sum<=goal-1)
    public static int numSubarraysWithSumOptimal(int[] nums, int goal) {
        return countWithSumLessOrEqualGoal(nums, goal) - countWithSumLessOrEqualGoal(nums, goal - 1);

    }

    public static int countWithSumLessOrEqualGoal(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int count = 0, lp = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > goal) {
                sum -= nums[lp++];
            }
            count += i - lp + 1;
        }
        return count;
    }
}
