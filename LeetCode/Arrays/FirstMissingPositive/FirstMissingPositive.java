/*
* Created on 31 July 2024
* 
* @author Sai Sumanth
*/
package FirstMissingPositive;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] { 1, 2, 0 })); // 3
    }
    /* 
     * Method 0 - Brute Force - Using Extra Space
     * 1. Put all the nums in a Set
     * 2. Loop from 1 to len + 1, if i is not found in the set then return i
     * 
     */

    /*
     * Method 1: using Cyclic Sort
     * 
     * Put each number at correct index. for eg: element 2 at index 1 (since we need
     * to find the smallest positve integer which lies between 1 to nums.length + 1)
     * 
     * Ignore -ve numbers and numbers > nums.length. Because those numbers we can't
     * put at correct index.
     * 
     * Next loop through the array, if nums[i] != i+1 return i+1
     */
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (correctIndex >= 0 && correctIndex < nums.length && nums[correctIndex] != nums[i]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums.length + 1;
    }

}
