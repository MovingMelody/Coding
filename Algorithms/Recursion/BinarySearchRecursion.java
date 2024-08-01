/*
* Created on 01 August 2024
* 
* @author Sai Sumanth
*/
public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 4, 5, 6, 66, 77, 888, 8999, 9999 };
        int target = 3;
        System.out.println(target + " exists at index: " + binarySearchRecursive(target, nums, 0, nums.length - 1));
    }

    public static int binarySearchRecursive(int target, int[] nums, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target)
                return binarySearchRecursive(target, nums, low, mid - 1);
            return binarySearchRecursive(target, nums, mid + 1, high);
        }
        return -1;
    }
}
