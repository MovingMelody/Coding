/*
* Created on 22 Aug 2024
* 
* @author Sai Sumanth
*/

/* 
 * Iterative Merge Sorting
 */

import java.util.Arrays;

public class MergeSort2WayIterative {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 6, 2, 8, 1, 0, 11, 12 };

        System.out.println("Before sorting: " + Arrays.toString(nums));
        nums = mergeSort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));

    }

    private static int[] mergeSort(int[] nums) {
        if (nums.length == 1)
            return nums;

        int mid = nums.length / 2;

        // start Index to mid(exclusive)
        int[] leftArray = mergeSort(Arrays.copyOfRange(nums, 0, mid));

        // mid index becomes start here and end will be arr.length
        int[] rightArray = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        // merge both left array, right array and return them
        return mergeTwoArrays(leftArray, rightArray);
    }

    private static int[] mergeTwoArrays(int[] leftArray, int[] rightArray) {
        int[] mergedRes = new int[leftArray.length + rightArray.length];

        // i and j are the two pointers used to point each of them to each array
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                mergedRes[k++] = leftArray[i++];
            } else {
                mergedRes[k++] = rightArray[j++];
            }
        }

        /*
         * only any one of the below while loops will
         * be triggered
         */

        // Copy the remaining elements of leftArray into result
        while (i < leftArray.length) {
            mergedRes[k++] = leftArray[i++];
        }

        // Copy the remaining elements of rightArray into result
        while (j < rightArray.length) {
            mergedRes[k++] = rightArray[j++];
        }

        return mergedRes;
    }
}
