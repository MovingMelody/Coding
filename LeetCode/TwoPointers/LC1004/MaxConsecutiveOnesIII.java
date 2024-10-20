/*
* Created on 19 Oct 2024
* 
* @author Sai Sumanth
*/
package LC1004;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int res = longestOnes(new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 }, 3);
        System.out.println("Longest ones: " + res);
    }

    // TC - O(N + N)
    public static int longestOnes(int[] nums, int k) {
        int windowStartingIndex = 0;
        int longest = 0, zerosCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerosCount++;
            }
            // keep only max k zeros in window
            if (zerosCount > k) {
                while (nums[windowStartingIndex] == 1)
                    windowStartingIndex++;
                    
                windowStartingIndex++;
                zerosCount--;
            }
            longest = Math.max(longest, i - windowStartingIndex + 1);
        }
        return longest;
    }

}
