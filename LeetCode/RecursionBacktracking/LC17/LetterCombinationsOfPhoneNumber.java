package LeetCode.RecursionBacktracking.LC17;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    /*
     * Brute Force Iterative Approach
     * digits = "23" -> abc, def
     * Take key string("abc") and add each char to all res array elements,
     * first time res becomes -> [a, b, c]
     * then next key string will be "def", add all the chars to res elements(take
     * one by one from res)
     * so add 'd' to 'a' and then 'e' to 'a' and then 'f' to 'a' -> 'ad', 'ae', 'af'
     *
     */
    public List<String> letterCombinationsBruteForce(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        List<String> res = new ArrayList<>();
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        res.add("");
        for (char d : digits.toCharArray()) {
            String comb = mapping[d - '0'];
            List<String> newList = new ArrayList<>();
            for (String x : res) {
                for (char ch : comb.toCharArray()) {
                    newList.add(x + ch);
                }
            }
            res = newList;
        }

        return res;
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        List<String> res = new ArrayList<>();
        String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        getCombinations(mapping, "", 0, digits, res);
        return res;
    }

    // check the recursion tree drawn in note book to understand this problem,
    public static void getCombinations(String[] mp, String processed, int index, String digits, List<String> res) {
        if (index == digits.length()) {
            res.add(processed);
            return;
        }

        String keyString = mp[digits.charAt(index) - '0']; // first key string will be "abc"
        for (char c : keyString.toCharArray()) {
            System.out.println(c);
            getCombinations(mp, processed + c, index + 1, digits, res);
        }
    }
}
