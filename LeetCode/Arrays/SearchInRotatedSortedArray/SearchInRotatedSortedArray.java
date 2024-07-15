/*
* Created on 15 July 2024
* 
* @author Sai Sumanth
*/

package SearchInRotatedSortedArray;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 1, 2 };
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int middle = nums[mid];
            if (middle == target)
                return mid;

            // since the array is rotated atleast one time,
            // now every time we divide array one part will be sorted either right or left

            // now identify which part of the array is sorted
            // (based on that we can move START, END pointers)
            if (nums[start] <= middle) {
                // left part of the array is sorted
                if (target >= nums[start] && target < middle) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // right part of the array is sorted
                if (target > middle && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
