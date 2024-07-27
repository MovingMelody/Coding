/*
* Created on 26 July 2024
* 
* @author Sai Sumanth
*/
package LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] { 0, -1, 0 }));
        System.out.println(longestConsecutiveOptimized(new int[] { 2, 1, 0, -1, 66, 55, 44, 33, 3, 4, 5 }));
    }

    // nLogn Time Complexity. Since we are Sorting given array
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int res = 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x))
                continue;
            if (map.containsKey(x - 1)) {
                int prevCount = map.get(x - 1);
                map.remove(x - 1);
                map.put(x, prevCount + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (int x : map.values()) {
            res = Math.max(res, x);
        }
        return res;
    }

    // 😎
    public static int longestConsecutiveOptimized(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 0;
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        for (int x : nums) {
            if (!set.contains(x - 1)) {
                // now x might be the starting point
                int next = 0;
                while (set.contains(x + next)) {
                    next++;
                }
                res = Math.max(res, next);
            }
        }
        return res;
    }

}
