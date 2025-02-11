package LeetCode.RecursionBacktracking.CombinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[] { 1, 1, 1, 2, 2 }, 4));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(new ArrayList<>(), candidates, target, 0, res);
        return res;
    }

    /*
     * Backtracking approach
     * Time Complexity - 2 ^ n * k
     */
    public static void generateCombinations(List<Integer> processed, int[] given, int target, int index,
            List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(processed));
            return;
        }
        if (index == given.length || target < 0) {
            return;
        }
        // starting from index 0 we have 5 options to pick the first element, so pick
        // only unique ones as a first element
        for (int i = index; i < given.length; i++) { // check for all possibilites

            if (i > index && given[i] == given[i - 1]) {
                // curr num should not be same as prev(avoiding duplicates), we
                // don't have to check condition when picking first number for
                // nth position
                continue;
            }
            int num = given[i];
            processed.add(num);
            generateCombinations(processed, given, target - num, i + 1, res);
            processed.removeLast();
        }

    }
}
