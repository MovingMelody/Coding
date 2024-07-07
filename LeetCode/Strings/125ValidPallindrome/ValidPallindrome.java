/*
* Created on 07 July 2024
* 
* @author Sai Sumanth
*/

class ValidPallindrome {
    public static void main(String[] args) {
        System.out.println("LC 125 Valid Pallindrome - Two Pointers");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    // 1. Brute force way is to create a copy of string by removing all
    // non-alphanumeric characters, then use two pointers

    // 2. optimal approach
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;

            else if (s.charAt(left++) != s.charAt(right--)) {
                System.out.println(left + " " + right);
                return false;
            }
        }
        return true;
    }
}