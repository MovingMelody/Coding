package ValidPallindromeII_680;
/*
* Created on 07 July 2024
* 
* @author Sai Sumanth
*/

// https://leetcode.com/problems/valid-palindrome-ii/description/

class ValidPallindromeII {
    public static void main(String[] args) {
        // Approach 1
        System.out.println(validPalindrome("abca"));

        // Slightly Better Approach
        System.out.println(validPalindrome("abca"));

    }

    /*
     * Use Two Pointers to validate whether string is pallindrome or not.
     * when we encounter that corresponding left and right chars are not equal.
     * Either we can eliminate left char to make the whole string pallindrome or the
     * right char(we are not sure until we check)
     * 
     * 1. So use greedy approach and assume `right char` can be deleted all the time
     * and check for mis match counts (should be <=1)
     * 2. Next eliminate left char every time a mis match is found.
     * 
     * Eg: test case for above approach s= "deeee"
     * 
     */

    public static boolean validPalindrome(String s) {
        int misMatchCount = 0;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                right--;
                misMatchCount++;
            } else {
                left++;
                right--;
            }
            if (misMatchCount > 1)
                break;
        }
        int misMatchCount2 = 0;
        left = 0;
        right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                left++;
                misMatchCount2++;
            } else {
                left++;
                right--;
            }
            if (misMatchCount2 > 1)
                break;
        }

        return misMatchCount <= 1 || misMatchCount2 <= 1;
    }

    /*
     * A slightly better approach. as soon as we notice the mismatch. check if
     * remaining substrings is pallidrome or not.
     * Substring1 -> left+1 till right
     * Substring2 -> left till right-1
     * 
     * Anyone of the substring should be pallidrome otherwise return false
     */
    public static boolean validPalindromeSlightlyBetter(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPallindrome(s, left + 1, right) || isPallindrome(s, left, right - 1);
            }

            left++;
            right--;
        }
        return true;
    }

    public static boolean isPallindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(right--) != s.charAt(left++)) {
                return false;
            }
        }
        return true;
    }
}
