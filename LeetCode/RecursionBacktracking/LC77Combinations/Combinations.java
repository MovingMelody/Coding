package LeetCode.RecursionBacktracking.LC77Combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), n, k, 1, res);
        return res;
    }

    public static void backtrack(List<Integer> processed, int n, int k, int curr, List<List<Integer>> res) {
        if (processed.size() == k) {
            res.add(new ArrayList<>(processed));
            // now backtrack, remove the last element and add the next element
            return;
        }

        for (int i = curr; i <= n; i++) {
            processed.add(i);
            backtrack(processed, n, k, i + 1, res);
            processed.removeLast();
        }
    }
}
