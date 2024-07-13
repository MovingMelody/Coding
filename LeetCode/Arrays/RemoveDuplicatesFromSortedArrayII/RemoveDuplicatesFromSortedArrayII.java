/*
 * Created on 10 July 2024
 *
 * @author Sai Sumanth
 */
package RemoveDuplicatesFromSortedArrayII;

import java.util.Arrays;

// Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(arr));

        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int pointer = 1, counter = 1;
        for (int i = 1; i < nums.length; i++) {
            // upto 2 elements
            if (nums[i] == nums[i - 1] && counter < 2) {
                nums[pointer++] = nums[i];
                counter++;
            }
            
            // if the current number and prev number are not same then nums[pointer] = nums[i]
            if (nums[i] != nums[i - 1]) {
                nums[pointer++] = nums[i];
                counter = 1;
            }
        }
        return pointer;
    }
}
