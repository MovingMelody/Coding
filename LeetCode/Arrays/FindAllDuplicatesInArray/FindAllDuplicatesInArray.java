/*
* Created on 30 July 2024
* 
* @author Sai Sumanth
*/

package FindAllDuplicatesInArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        /// cyclic sort - array swaps
        System.out.println(findDuplicatesCyclicSort(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));

        // without any swaps
        System.out.println(findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
    }

    // using cyclic sort
    // first arrange the each number at correct index then find the duplicates using
    // another loop
    public static List<Integer> findDuplicatesCyclicSort(int[] nums) {
        List<Integer> res = new ArrayList<>();
        // first sort the given array
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[correctIndex] != nums[i]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                res.add(nums[i]);
        }
        return res;
    }

    // 🤯
    /*
     * when find a number i, flip the number at position i-1 to negative.
     * if the number at position i-1 is already negative, i is the number that
     * occurs twice.
     */
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int correctIndex = Math.abs(nums[i]) - 1;
            if (nums[correctIndex] < 0) {
                res.add(correctIndex + 1);
            }
            nums[correctIndex] = -nums[correctIndex];
        }
        return res;
    }
}
