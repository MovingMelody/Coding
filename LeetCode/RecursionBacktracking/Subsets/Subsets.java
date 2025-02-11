
package LeetCode.RecursionBacktracking.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * There are 4 Ways to solve this problem
 * 1. Brute Force Iterative Approach
 * 2. Bit Manipulation
 * 3. Pure Recursion - processed/unprocessed or take/not-take Approach
 * 4. 😎 Backtracking
 */

public class Subsets {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int[] nums = { 1, 2, 3 };
        System.out.println("Subsets Brute Force Iterative Approach: " + subsetsBruteForce(list));
        System.out.println("Subsets Bit Manipulation Approach     : " + subsetsBitManipulation(nums));
        System.out.println("Subsets Pure Recursion Approach       : " + subsetsRecursion(nums));
        System.out.println("Subsets Backtracking                  : " + subsetsBacktracking(nums));
    }

    /*
     * 1️⃣. Brute Force Iterative Approach
     * 
     * Generate all subsets of an array using iterative approach
     */
    static List<List<Integer>> subsetsBruteForce(List<Integer> list) {
        List<List<Integer>> res = new ArrayList<>();
        // add the empty list first
        res.add(new ArrayList<>());

        for (int num : list) {
            int prevListsSize = res.size();
            for (int i = 0; i < prevListsSize; i++) {
                var eachInternal = new ArrayList<>(res.get(i));
                eachInternal.add(num);
                res.add(eachInternal);
            }
        }
        return res;
    }

    /*
     * 2️⃣. Bit Manipulation Approach
     * 
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
    public static List<List<Integer>> subsetsBitManipulation(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int totalSubsets = 1 << nums.length; // 2^n

        // System.out.println("Total Subsets : " + totalSubsets);

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

    /*
     * 3️⃣. Pure Recursion - processed/unprocessed approach
     */
    public static List<List<Integer>> subsetsRecursion(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(new ArrayList<>(), nums, 0, res);
        return res;
    }

    public static void generateSubsets(List<Integer> processed, int[] given, int currIndex, List<List<Integer>> res) {
        // base condition to stop recursion
        if (currIndex == given.length) {
            res.add(new ArrayList<>(processed));
            return;
        }

        int currNum = given[currIndex];
        processed.add(currNum);
        generateSubsets(processed, given, currIndex + 1, res);

        // this removal part is not backtracking, since list is a reference type in java
        // if we add something in final recursion call it gets reflected in it's
        // previous call also, so we need to remove it.
        //
        // suppose we have a integer value that is being passed in recursive function,
        // even if we update int as int = int + 1. that increment is valid only for that
        // recursion call, once this final recursion call returns then in it's previous
        // call the value of int will be same as what is passed to final recursion call
        // without any increment
        processed.removeLast();
        generateSubsets(processed, given, currIndex + 1, res);
    }

    /*
     * 4️⃣. Backtracking
     */
    public static List<List<Integer>> subsetsBacktracking(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, 0, res);
        return res;
    }

    public static void backtrack(List<Integer> eachSubset, int[] given, int index, List<List<Integer>> res) {
        res.add(new ArrayList<>(eachSubset));
        System.out.println("index: " + index);

        // this is pure backtracking since we are exploring all the possibilities at
        // each stage, here we are picking every possible element for each position in
        // subset, for 1st position all 1,2,3 are valid, for 2nd element in a subset
        // either we can pick 2 or 3 as second element
        for (int i = index; i < given.length; i++) {
            int num = given[i];
            eachSubset.add(num);
            backtrack(eachSubset, given, i + 1, res);

            // backtracking by removing one one element from the end of the list and
            // checking if we can put any other number to form a subset. Check the
            // backtracking tree once to understand this in a better way
            eachSubset.removeLast();
        }
    }
}