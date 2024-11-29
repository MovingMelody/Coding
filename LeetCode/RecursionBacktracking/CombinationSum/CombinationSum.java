package LeetCode.RecursionBacktracking.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[] { 2, 3, 6, 7 }, 7));
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
            res.add(new ArrayList<>(processed));
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
}
