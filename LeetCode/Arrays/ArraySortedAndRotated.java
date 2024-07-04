/*
 * Created on 04 July 2024
 *
 * @author Sai Sumanth
 */

 /*
    Link - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
    Topics - arrays
    Solved ? ✅ 
 */

public class ArraySortedAndRotated {
    public static void main(String[] args) {
        System.out.println(check(new int[]{3, 4, 5, 1, 2}));

        System.out.println(check(new int[]{2, 1, 3, 4}));

        System.out.println(check1(new int[]{1, 2, 3}));

    }

    public static boolean check1(int[] nums) {
        int irregularity = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                irregularity++;
            }
        }
        if (irregularity > 0 && nums[0] < nums[nums.length - 1]) {
            return false;
        }/**/
        return irregularity <= 1;
    }

    public static boolean check(int[] nums) {
        int reversedCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                reversedCount++;
            }
        }

        return reversedCount <= 1;
    }
}
