package MergeSortedArray;
/*
 * Created on 26 June 2024
 *
 * @author Sai Sumanth
 */

// https://leetcode.com/problems/merge-sorted-array/description
// Easy

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("LC 88 - Merge Sorted Array");
        int m = 3, n = 3;
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        // linear time and extra space O(nums1.length)
        // merge(nums1, m, nums2, n);

        // Constant Space O(1) and Time O(m+n)
        mergeOptimized(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    // using extra space and Linear Time O(m+n)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int p1 = 0, p2 = 0;
        int tempPointer = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                temp[tempPointer++] = nums1[p1++];
            } else if (nums1[p1] > nums2[p2]) {
                temp[tempPointer++] = nums2[p2++];
            }
        }

        // put the remaining elements of p1
        for (int i = p1; i < m; i++) {
            temp[tempPointer++] = nums1[i];
        }

        // put the remaining elements of p2
        for (int i = p2; i < n; i++) {
            temp[tempPointer++] = nums2[i];
        }

        // finally copy the array
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = temp[i];
        }
    }

    // 😎
    // fill the elements from the end (bigger numbers)
    public static void mergeOptimized(int[] nums1, int m, int[] nums2, int n) {
        // to fill the nums1 array(big array) from the last
        int resPointer = nums1.length - 1;
        int p1 = m - 1, p2 = n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                // p1>=0 because once all the elements of nums1 are added the remaining all
                // small elemnets will be from nums2 only. we can directly add in else part
                nums1[resPointer--] = nums1[p1--];
            } else {
                nums1[resPointer--] = nums2[p2--];
            }
        }
    }
}
