package LC2563;

import java.util.Arrays;

public class CountTheNumberOfFairPairs {

    public long countFairPairs(int[] nums, int lower, int upper) {
        long pairs = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // int low = i+1, high = nums.length;
            // find the perfect left and right pointers for i using binary search
            int low = lowerBound(i + 1, nums.length - 1, nums, lower - nums[i]);
            int high = upperBound(i + 1, nums.length - 1, nums, upper - nums[i]);
            pairs += high - low + 1;
            // lastHigh = high;
        }
        return pairs;
    }

    // finding the ceil - smallest element greater than or equal to target
    public static int lowerBound(int start, int end, int[] nums, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static int upperBound(int start, int end, int[] nums, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) { // or if (nums[mid] <= target)
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
