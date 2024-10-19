/*
* Created on 18 Oct 2024
* 
* @author Sai Sumanth
*/
package LC3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        // Brute Force
        int longLen = lengthOfLongestSubstringBruteForce("peekew");
        System.out.println("Result: " + longLen);

        // Optimal Approach
        longLen = lengthOfLongestSubstring("");
        System.out.println("Result: " + longLen);
    }

    public static int lengthOfLongestSubstringBruteForce(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s.length();
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            // now generate all substrings from i
            Set<Character> hash = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (hash.contains(ch)) {
                    break;
                }
                longest = Math.max(longest, j - i + 1);
                hash.add(ch);
            }
        }
        return longest;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int longest = 0, leftPointer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                // "abcdbca" dry run this test case to know whey max is being used here
                //
                // basically we need to check if the char last appeared index is after/before
                // left pointer. consider only if it's after left pointer otherwise no use
                leftPointer = Math.max(leftPointer, map.get(ch) + 1);
            }
            map.put(ch, i);
            longest = Math.max(longest, i - leftPointer + 1);
        }
        return longest;
    }
}
