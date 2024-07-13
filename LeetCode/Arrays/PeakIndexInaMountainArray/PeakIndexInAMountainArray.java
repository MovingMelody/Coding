/*
* Created on 13 July 2024
* 
* @author Sai Sumanth
*/

package PeakIndexInaMountainArray;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 2, 1, 0 };
        int index = peakIndexInMountainArray(nums);
        System.out.println("Peak Element is " + nums[index]);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // we are in the increasing part of array (possibly arr[mid+1] could be that
                // peak element)
                // so start = mid + 1;
                start = mid + 1;
            } else {
                // else means -> (arr[mid] > arr[mid+1])
                // this means mid could be that peak element
                // so end = mid
                end = mid;
            }
        }
        // we can return either start or end. since both will be pointing to the same
        // peak element at the end. And that's why the while condition is (start<end).
        // otherwise we'll end up in infinite loop incase of (start<=end)
        return end;
    }
}
