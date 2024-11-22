/*
* Created on 10 July 2024
* 
* @author Sai Sumanth
*/

// find the smallest number which is greater than or equal to target in the given sorted array
class CeilOfNumber {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 3, 5, 9, 14, 16, 18 };
        int target = -1;
        int index = ceilOfNumber(nums, target);
        if (index != -1) {
            System.out.println("Ceil of target is " + nums[index]);
        } else {
            System.out.println("given target is greater than all elements in array, so ceil can't be found");
        }
    }

    public static int ceilOfNumber(int[] nums, int target) {
        int length = nums.length;
        if (nums[length - 1] < target)
            return -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // even if mid is equal to target we still have to find the ceil of target
            // so equals sign is added here in the condition
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // 💡 start will always point to number that is greater than given target
        return start;
    }
}
