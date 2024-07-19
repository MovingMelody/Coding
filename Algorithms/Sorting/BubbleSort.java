/*
 * Created on 12 July 2024
 *
 * @author Sai Sumanth
 */

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{88, 99, 88, 77, 6, 88, 34, 2, 1, 0, -90};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
     * Space Complexity O(1)
     *
     * Time Complexity
     * Worst Case -> O(N^2)
     * Best Case -> O(N) when array is already sorted, we can early exit
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // compare every two adjacent elements and place the large number next to small
            // number
            // after each iteration biggest element will be kept at the end.

            boolean isSwapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] + nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] = nums[j] - nums[j + 1];
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break; // early exit, if no swapping is done then it means that array is sorted. so we
                // can break loop
            }
        }
    }
}
