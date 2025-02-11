/*
* Created on 09 Aug 2024
* 
* @author Sai Sumanth
*/
package SubSets;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

    public static void main(String[] args) {
        List<List<Integer>> res = subsets(new int[] { 1, 2, 3 });
        for (List<Integer> x : res) {
            System.out.println(x);
        }

    }

    /*
     * Total subsets will be 2^n
     * so consider binary numbers from 0 to 2^n - 1 and use each binary version of
     * it as a marking
     * if the bit is 1 then pick the number from nums at position where bit is 1
     *
     * nums = [1,2,3]
     * total subsets = 8
     * start from 0 to till 7
     * when num is 5 -> 101 pick the numbers at index 0,2 from array
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int totalSubsets = 1 << nums.length; // 2^n

        System.out.println("Total Subsets : " + totalSubsets);

        for (int set = 0; set < totalSubsets; set++) {
            List<Integer> eachSubset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((set & (1 << i)) != 0)
                    eachSubset.add(nums[i]);
            }
            res.add(eachSubset);
        }
        return res;
    }
}
