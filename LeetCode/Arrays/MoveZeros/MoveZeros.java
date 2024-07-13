package MoveZeros;

/*
* Created on 04 July 2024
* 
* @author Sai Sumanth
*/

import java.util.Arrays;

/*
   Link - https://leetcode.com/problems/move-zeroes/description/
   Topics - arrays
   Solved ? ✅
*/

class MoveZeros {
    public static void main(String[] args) {
        int nums[] = new int[] { 0, 1, 0, 5, 6, 6, 3, 12 };
        // with extra space
        moveZeroesExtraSpace(nums);

        // without any extra space, modify the same array
        moveZeroes(nums);

        // 😎
        moveZeroesMoreOptimal(nums);

        System.out.println(Arrays.toString(nums));
    }

    /// 🤡 Extra Space
    public static void moveZeroesExtraSpace(int[] nums) {
        int[] res = new int[nums.length];
        int nonZeroPointer = 0;
        for (int x : nums) {
            // put non zero numbers inside extra array
            if (x != 0) {
                res[nonZeroPointer++] = x;
            }
        }

        /// move the elements to original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }

    public static void moveZeroes(int[] nums) {
        int zerosCount = 0;
        for (int x : nums) {
            if (x == 0) {
                zerosCount++;
            }
        }
        // use two pointers and replace zeros
        int nonZeroPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((nonZeroPointer < nums.length) && nums[nonZeroPointer] == 0) {
                nonZeroPointer++;
            }
            if (nonZeroPointer >= nums.length)
                return;
            System.out.println("Non zero pointer:" + nonZeroPointer);

            nums[i] = nums[nonZeroPointer++];
        }

        for (int i = 1; i <= zerosCount; i++) {
            nums[nums.length - i] = 0;
        }

    }

    // 😎
    public static void moveZeroesMoreOptimal(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }

}