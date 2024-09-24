package LeetCode.Strings.LongestCommonPrefix;
/*
* Created on 24 Sep 2024
* 
* @author Sai Sumanth
*/

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    }

    /*
     * TC -> 200 * O(n) max len of any string in array is 200(check constraints)
     * n -> len(strs)
     * 
     * almost like n^2. 200 * 200 = 40k
     * (when arr len is 200 and len of all strings in arr is 200)
     * 
     */
    public static String longestCommonPrefix(String[] strs) {
        int minLength = 201; // based on the given constraints
        StringBuilder res = new StringBuilder();
        for (String x : strs) {
            if (x.length() < minLength) {
                minLength = x.length();
            }
        }
        for (int i = 0; i < minLength; i++) {
            char currChar = strs[0].charAt(i);
            for (String ss : strs) {
                if (currChar != ss.charAt(i)) {
                    return res.toString();
                }
            }
            res.append(currChar);
        }
        return res.toString();
    }

    /*
     * 😎 Optimal Solution by sorting the given array
     * 
     * TC -> n logn
     * 
     * n is len(strs)
     * 
     * if n = 200 then TC will be O(nlogn) approx 1528. so better then prev approach
     */
    public String longestCommonPrefixOptimal(String[] strs) {
        // sort the string first
        Arrays.sort(strs);
        // string in the array are sorted in alphabetical order now

        /*
         * consider first and last string and check each char of two strings
         * as long as the chars are equal continue to increment the prefix len.
         * 
         * why only first and last chars ?
         * ["flower","flow","flight"] -> ["flight","flow","flower"]
         * if the first char of first & last string are same then
         * it means that all the in between strings will have the same char
         * 
         */
        String f = strs[0];
        String l = strs[strs.length - 1];
        int prefixLen = 0;
        int p = 0;
        while (p < f.length() && p < l.length()) {
            if (f.charAt(p) != l.charAt(p++))
                break;
            prefixLen++;
        }
        return strs[0].substring(0, prefixLen);
    }

}
