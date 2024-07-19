/*
 * Created on 19 July 2024
 *
 * @author Sai Sumanth
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int[] nums = { 4, 2, 9, 7, 1 };
        int[] nums = {88, 99, 88, 77, 6, 88, 34, 2, 1, 0, -90};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    // pick ith element(i from 0 to len-1) and put it at correct position in the
    // left part of 'i'
    private static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int temp = nums[j];
            while (j > 0 && temp < nums[j - 1]) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = temp; // put the element at the correct position in left portion of array
        }
    }

}
