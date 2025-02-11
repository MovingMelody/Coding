package LeetCode.RecursionBacktracking.SubsetsII;

import java.util.*;

class SubsetsII {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2 };
        var recursiveRes = recursiveSolution(nums);
        System.out.println("Recursive Solution: " + recursiveRes);

        var backtrackingSol = recursiveSolution(nums);
        System.out.println("Backtracking Solution: " + backtrackingSol);
    }

    public static List<List<Integer>> recursiveSolution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(new ArrayList<>(), nums, 0, res);
        return res;
    }

    // Processed/Unprocessed Pure Recursive Approach
    public static void generateSubsets(List<Integer> processed, int[] given, int currIndex, List<List<Integer>> res) {
        if (currIndex == given.length) {
            if (!res.contains(processed))
                res.add(new ArrayList<>(processed));
            return;
        }

        int currNum = given[currIndex];
        processed.add(currNum);
        generateSubsets(processed, given, currIndex + 1, res);

        processed.removeLast();
        generateSubsets(processed, given, currIndex + 1, res);
    }

    // Since we have some constraints imposed to generate subsets, we can use the
    // backtracking approach

    public static List<List<Integer>> backtrackingSolution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, 0, res);
        return res;
    }

    public static void backtrack(List<Integer> processed, int[] given, int index, List<List<Integer>> res) {
        res.add(new ArrayList<>(processed));

        for (int i = index; i < given.length; i++) {
            if (i > index && given[i] == given[i - 1])
                continue;
            processed.add(given[i]);
            backtrack(processed, given, i + 1, res);
            processed.removeLast();
        }
    }

}