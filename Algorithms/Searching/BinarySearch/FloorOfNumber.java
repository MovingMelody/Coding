/*
* Created on 10 July 2024
* 
* @author Sai Sumanth
*/

// find the largest number which is less than or equal to target in the given sorted array
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 3, 5, 9, 14, 16, 18 };
        int target = 2;
        int index = floorOfNumber(nums, target);
        if (index != -1) {
            System.out.println("Floor of target is " + nums[index]);
        }else{
            System.out.println("Floor not found");
        }
    }

    public static int floorOfNumber(int[] nums, int target) {
        int length = nums.length;
        if (nums[0] > target)
            return -1;
        int start = 0, end = length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if mid is >= target our floor exists from (start to mid -1)
            // if we remove = then it returns target only if it exists in array
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // 💡 end will always point to number that is smaller than given target
        return end;
    }
}
