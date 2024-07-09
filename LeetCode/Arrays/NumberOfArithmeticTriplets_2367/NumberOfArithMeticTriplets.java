/*
 * Created on 09 July 2024
 *
 * @author Sai Sumanth
 */

package NumberOfArithmeticTriplets_2367;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/number-of-arithmetic-triplets/description/

public class NumberOfArithMeticTriplets {
    public static void main(String[] args) {

        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));

        System.out.println(arithmeticTripletsOptimal(new int[]{0, 1, 4, 6, 7, 10}, 3));

    }

    /// since the constraints are small, 3 loops can be used
    public static int arithmeticTriplets(int[] nums, int diff) {
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    }
                }
            }
        }

        return res.size();
    }

    // optimal approach using hash set
    public static int arithmeticTripletsOptimal(int[] nums, int diff) {
        int res = 0;
        Set<Integer> seen = new HashSet<>();
        /*
            as per the question
            i, j, k

            1. j - i = diff
               i = j - diff


            2. k - j = diff
               j = k - diff

            (Substitute j in 1st equation)
            i = k - diff - diff => (k - 2 * diff)

         */
        for (int x : nums) {
            if (seen.contains(x - diff) && seen.contains(x - 2 * diff)) {
                res++;
            }
            seen.add(x);
        }
        return res;
    }
}
