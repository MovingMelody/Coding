package LeetCode.RecursionBacktracking.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println("Recursive Solution: " + combinationSum(new int[] { 2, 3, 6, 7 }, 7));

        // backtracking approach
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), new int[] { 2, 3, 6, 7 }, 0, 7, res);
        System.out.println("Backtracking Solution: " + res);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        getCombinations(new ArrayList<>(), candidates, target, 0, res);
        return res;
    }

    // TC -> 2 ^ t where t is target
    public static void getCombinations(List<Integer> processed, int[] given, int target, int index,
            List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(processed)); // in worst case add will take O(n) time when a new list has to be
                                                 // created, so TC -> 2^t * n
            return;
        }
        if (index == given.length || target < 0) {
            return;
        }

        int num = given[index];
        processed.add(num);
        // decrease the picked num from target and stay on the same index
        getCombinations(processed, given, target - num, index, res);

        processed.removeLast();
        getCombinations(processed, given, target, index + 1, res);
    }

    /*
     * Backtracking solution
     * TC - O(2 ^ n)
     */
    public static void backtrack(List<Integer> processed, int[] given, int index, int target,
            List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(processed));
            return;
        }

        if (target < 0)
            return;

        for (int i = index; i < given.length; i++) {
            processed.add(given[i]);
            backtrack(processed, given, i, target - given[i], res);
            processed.removeLast();
        }
    }
}
