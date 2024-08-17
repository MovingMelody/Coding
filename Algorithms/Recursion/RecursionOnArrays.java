/*
* Created on 17 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.Arrays;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        /*
         * Check if array is sorted or not
         */
        boolean isSorted = isArrSorted(nums, 0);
        System.out
                .println(
                        isSorted ? "✅ Nums array is sorted. " + Arrays.toString(nums)
                                : "❌ Nums array is not sorted. " + Arrays.toString(nums));

        /*
         * Reverse the given array using recursion
         */
        System.out.println("Nums before reversing: " + Arrays.toString(nums));
        reverseArray(nums, 0, nums.length - 1);
        System.out.println("Nums afterr reversing: " + Arrays.toString(nums));

        /*
         * Linear Search using Recursion
         */
        int target = 1;
        int foundIndex = linearSearch(nums, target, nums.length - 1);
        System.out.print(target);
        System.out
                .println((foundIndex != -1 ? " found at index " + foundIndex : " Not found in the given array") + " "
                        + Arrays.toString(nums));
    }

    public static void reverseArray(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverseArray(nums, ++start, --end);
    }

    private static boolean isArrSorted(int[] nums, int i) {
        /*
         * Below line is Off-topic not related to sort logic
         * nums = new int[] { 3, 4, 5 };
         * here we are re-assigning a new array object to nums, and it will NOT modify
         * the original array. but nums[0] = 999 will modify the original array
         */
        if (i >= nums.length - 1)
            return true;

        return (nums[i] < nums[i + 1]) && isArrSorted(nums, ++i);

        /*
         * Above single line can be written in below 3 lines as well
         */
        // if (nums[i] < nums[i + 1])
        // return isArrSorted(nums, ++i);
        // return false;
    }

    // linear search from end to start
    private static int linearSearch(int[] nums, int target, int endIndex) {
        if (endIndex == -1)
            return -1;
        if (nums[endIndex] == target)
            return endIndex;
        return linearSearch(nums, target, endIndex - 1);
    }

}
