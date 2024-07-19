/*
 * Created on 18 July 2024
 *
 * @author Sai Sumanth
 */

import java.util.Arrays;

/* 
 * Selection sort -> idea is to find the minimum or maximum element 
 * in an unsorted array and then putting it in its correct position.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 88, 99, 88, 77, 6, 88, 34, 2, 1, 0, -90 };
        selectionSortMinFirst(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = { 4, 5, 3, 7, 2, -10 };
        selectionSort(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    /// finds the biggest element in each iteration and puts it at correct position
    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // find the largest number
            int biggestSoFar = 0;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] > nums[biggestSoFar]) {
                    biggestSoFar = j;
                }

            }
            int temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[biggestSoFar];
            nums[biggestSoFar] = temp;
            // System.out.println(Arrays.toString(nums));
        }
    }

    // arrange elements from min to max
    private static void selectionSortMinFirst(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            // assuming ith element to be the min of unsorted array
            int minIndexSoFar = i;

            // find the minimum
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndexSoFar]) {
                    minIndexSoFar = j;
                }
            }
            // put the min at its proper position
            int temp = nums[i];
            nums[i] = nums[minIndexSoFar];
            nums[minIndexSoFar] = temp;
        }
    }
}
