/*
 * Created on 25 June 2024
 *
 * @author Sai Sumanth
 */

import java.util.*;


/*
   Link - https://leetcode.com/problems/find-the-duplicate-number/description/
   Topics - arrays
*/
class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("287 LC - Find the Duplicate Number");

        // Using extra space and linear time
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2}));

        // without extra space and linear time
        System.out.println(findDuplicateOptimized(new int[]{3, 1, 3, 4, 2}));

        // Linear Time and Constant Space - using Floyd's Cycle Detection Algorithm
        // Fast and Slow Pointers Approach
        System.out.println(findDuplicateOptimized(new int[]{1, 3, 4, 2, 2}));


    }

    // Using Extra Space - O(n)
    // Time - O(n)
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return x;
            }
            set.add(x);
        }
        return 0;
    }

    public static int findDuplicateOptimized(int[] nums) {
        // Start fast and slow pointers from first value
        int fast = nums[0], slow = nums[0];

        // Run the loop until we detect the starting point of the cycle
        // both slow and fast pointer should be same to exit from the loop
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (slow != fast);
        System.out.println("fast : " + fast);

        // intialize the slow pointer to first number again
        // and then move both the pointers by one position
        slow = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            if (slow == fast) {
                return slow;
            }
        }
    }
}
