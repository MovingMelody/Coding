/*
* Created on 26 Oct 2024
* 
* @author Sai Sumanth
*/

package LC992;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithLessOrEqualKDistinct(nums, k) - subarraysWithLessOrEqualKDistinct(nums, k - 1);
    }

    // Traditional slidind window approach won't work.
    // Dry run `[2, 1, 1, 1, 3, 4, 3, 1]` to see why.
    public int subarraysWithLessOrEqualKDistinct(int[] nums, int k) {
        int count = 0, leftPointer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.size() > k) {
                int leftMost = nums[leftPointer++];
                int leftMostFreq = map.get(leftMost) - 1;
                if (leftMostFreq == 0) {
                    map.remove(leftMost);
                } else {
                    map.replace(leftMost, leftMostFreq);
                }
            }
            count += i - leftPointer + 1;
        }
        return count;
    }
}
