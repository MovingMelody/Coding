/*
* Created on 28 Sep 2024
* 
* @author Sai Sumanth
*/
package LeetCode.Sorting.MaximizeTheTotalHeightOfUniqueTowers;

import java.util.*;

public class MaximizeTheTotalHeightOfUniqueTowers {
    public static void main(String[] args) {
        int[] heights = { 2, 3, 4, 3 };

        System.out.println(maximumTotalSum(heights)); // TLE

        System.out.println(maximumTotalSumPro(heights)); // Optimal Approach
    }

    /*
     * Time Limit Exceeded 🤡
     */
    public static long maximumTotalSum(int[] heights) {
        long maxHeight = 0;
        // store all the heights in hashmap
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : heights) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        System.out.println(mp);
        for (int x : heights) {
            if (mp.get(x) == 1) {
                maxHeight += x;
            } else {
                int temp = x;
                int value = mp.get(x);
                while (x > 0) {
                    if (!mp.containsKey(x)) {
                        maxHeight += x;
                        mp.put(temp, value - 1);

                        // [6,6,6,3,7,2,6,5] dry run this example to understand the below line
                        mp.put(x, mp.getOrDefault(x, 0) + 1);
                        break;
                    } else {
                        x--;
                    }
                }
                if (x <= 0)
                    return -1;
            }
        }
        return maxHeight;
    }

    /*
     * Optimal Approach
     */
    public static long maximumTotalSumPro(int[] arr) {
        Arrays.sort(arr);
        // Reverse the array for descending order
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        long sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currMaxHeight = Math.min(arr[i], arr[i - 1] - 1);
            if (currMaxHeight <= 0)
                return -1;
            arr[i] = currMaxHeight;
            sum += currMaxHeight;
        }
        return sum;
    }
}
