/*
* Created on 16 July 2024
*
* @author Sai Sumanth
*/

package SearchInRotatedSortedArrayII;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 0, 1, 1, 1 };
        System.out.println(search(nums, 0));

    }

    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int middle = nums[mid];
            if (middle == target)
                return true;

            if (middle == nums[start] && middle == nums[end]) {
                // now it's impossible to determine which part of the array is sorted.
                // consider this example [1, 0, 1, 1, 1]
                // so we have to move left and right pointers
                while (nums[start] == nums[end] && start < end) {
                    start++;
                    end--;
                }
            }

            if (nums[start] <= middle) {
                // left part of the array is sorted

                // check if target lies within the sorted part
                if (target >= nums[start] && target < middle) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // right part of the array is sorted

                // check whether target lies within the sorted part
                if (target > middle && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
