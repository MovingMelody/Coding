/*
* Created on 08 July 2024
* 
* @author Sai Sumanth
*/
package ThreeSum_15;

import java.util.*;

// https://youtu.be/DhFh8Kw7ymk?si=4y_YnmeV9JzMDM7l

class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> res = new ArrayList<>();

        // Brute Force Approach - O(n^3) Time and Extra Space
        res = threeSum(nums);

        // Slightly Better Approach - O(n^2) Time
        res = threeSumSlightlyBetter(nums);

        res = threeSumOptimal(nums);

        for (List<Integer> eachArray : res) {
            System.out.println(eachArray);
        }
    }

    /*
     * Brute Force Approach - O(n^3) Time and Extra Space for Set
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        // Add all triplets to a set
        Set<List<Integer>> resSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> newList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(newList);
                        resSet.add(newList);
                    }
                }
            }
        }
        // create a new arraylist from set and return
        return new ArrayList<>(resSet);
    }

    // O(n^2) -> Time Complexity
    // Using Hashing Approach - HashMap (Similar to Two Sum Problem)
    public static List<List<Integer>> threeSumSlightlyBetter(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        // fix one element and find the other two nums using two sum problem approach
        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> diffSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                // since 0 is the target
                int diff = -nums[i] - nums[j];
                if (diffSet.contains(diff)) {
                    List<Integer> newList = new ArrayList<>(Arrays.asList(nums[i], nums[j], diff));
                    Collections.sort(newList);
                    set.add(newList);
                }
                diffSet.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }

    // 😎 Optimal Approach using sorting mechanism (sort the given array to find
    // triplets)
    private static List<List<Integer>> threeSumOptimal(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum + nums[i] == 0) {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));

                    // increase left pointer until the next number is not same as nums[l]
                    while (l < r && nums[l] == nums[l + 1])
                        l++;

                    // decrease right pointer until the next number is not same as nums[r]
                    while (l < r && nums[r] == nums[r - 1])
                        r--;
                }
                if (sum + nums[i] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }

}
