/*
* Created on 21 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.Arrays;

/* 
 *  Time Complexity O(n * logn) -> logn steps and n comparisons in each step
 */
public class MergeSort {
    public static void main(String[] args) {
        // int[] array = { 999, 1, 3, 2, 5, 777, 4, 6, 8, 0, -98 };
        int[] array = { 5, 4, 3, 2, 1 };

        System.out.println("Before sorting: " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("After sorting: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] nums, int start, int end) {

        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid); // left half
        mergeSort(nums, mid + 1, end); // right half

        /*
         * merge left half & right half
         * In iterative approach we were simply passing two arrays to get those merged.
         * 
         * But here we are passing only one array and needs to merge the two parts in
         * that array in sorted order. so we need start, mid, end to divide the array
         * into two halves
         */
        merge(nums, start, mid, end);
        // when this merge method is called for first time(final recursion call)
        // start -> 0,mid -> 0,end -> 1
        // so basically we are merging the first two elements first
    }

    private static void merge(int[] nums, int start, int mid, int end) {
        System.out.println(start + " " + mid + " " + end);
        int leftSize = mid - start + 1;
        int rightSize = end - mid;
        int[] sortedSubArray = new int[leftSize + rightSize]; // simply (end-start+1) can also be done to calculate the
                                                              // size
        System.out.printf("Start: %d Mid: %d End: %d\n", start, mid, end);

        int left = start;
        int right = mid + 1;
        int k = 0;

        // merge the two sorted lists and put the elements in sortedSubArray
        while (left <= mid && right <= end) {
            if (nums[left] < nums[right]) {
                sortedSubArray[k++] = nums[left++];
            } else {
                sortedSubArray[k++] = nums[right++];
            }
        }

        // add the remaining elements
        while (left <= mid) {
            sortedSubArray[k++] = nums[left++];
        }

        while (right <= end) {
            sortedSubArray[k++] = nums[right++];
        }

        // copy the elements into original array
        for (int i = 0; i < sortedSubArray.length; i++) {
            nums[start + i] = sortedSubArray[i];
        }
    }
}
