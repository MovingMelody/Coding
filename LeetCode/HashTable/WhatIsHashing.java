/*
* Created on 23 July 2024
* 
* @author Sai Sumanth
*/

import java.util.HashMap;
import java.util.Map;

/* 
 * Hashing is all about prestoring something and fetching later when needed.
 */

public class WhatIsHashing {
    public static void main(String[] args) {
        /// print the frequencies of numbers in given array
        long nums[] = new long[100000];
        for (int i = 1; i <= 100000; i++) {
            nums[i - 1] = i;
        }

        calculateFrequencies(nums);
        // above approach takes almost 2.5 seconds for 10^5 Numbers
        // let's see if we can optimize it

        calculateFrequenciesPro(nums); // takes only 0.6 seconds
    }

    /*
     * O(n^2) Time Complexity to find the frequencies of all numbers in array
     */
    public static void calculateFrequencies(long[] nums) {
        long startTime = System.currentTimeMillis();
        for (long x : nums) {
            System.out.println("Frequency of " + x + " is: " + getFreq(nums, x));
        }
        long endTime = System.currentTimeMillis();
        float timeTakenInSeconds = (endTime - startTime) / 1000F;
        System.out.println("Time Taken : " + timeTakenInSeconds + "secs");
    }

    public static long getFreq(long[] nums, long n) {
        long count = 0;
        for (long x : nums) {
            if (x == n) {
                count++;
            }
        }
        return count;
    }

    /*
     * O(n) Time Complexity and uses extra space O(n)
     */
    public static void calculateFrequenciesPro(long[] nums) {
        Map<Long, Long> hashMap = new HashMap<>();
        for (long x : nums) {
            hashMap.put(x, hashMap.getOrDefault(x, 0L) + 1L);
        }

        long startTime = System.currentTimeMillis();
        for (long x : nums) {
            System.out.println("Frequency of " + x + " is: " + hashMap.get(x));
        }
        long endTime = System.currentTimeMillis();
        float timeTakenInSeconds = (endTime - startTime) / 1000F;
        System.out.println("Time Taken : " + timeTakenInSeconds + "secs");
    }

}
