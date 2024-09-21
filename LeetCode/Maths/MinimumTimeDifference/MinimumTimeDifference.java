/*
* Created on 21 Sep 2024
* 
* @author Sai Sumanth
*/
package LeetCode.Maths.MinimumTimeDifference;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {

        List<String> timeList = List.of("06:00", "23:00");

        int min = findMinDifference(timeList);

        System.out.println("Min Time Diff: " + min);

    }

    /*
     * TC - n * logn since we are sorting the array
     */
    public static int findMinDifference(List<String> timePoints) {
        int[] mins = new int[timePoints.size()];
        int i = 0;
        for (String x : timePoints) {
            mins[i++] = convertToMins(x);
        }
        Arrays.sort(mins);
        int res = Integer.MAX_VALUE;
        for (int j = 1; j < mins.length; j++) {
            res = Math.min(res, mins[j] - mins[j - 1]);
        }

        /*
         * this is important step
         * consider two time stamps 6 am and 11 pm so time diff is 17 hrs
         * but if we consider 11 pm to next day 6 am, It's only 7 hrs
         */
        res = Math.min(res, mins[0] + 24 * 60 - mins[mins.length - 1]);
        return res;
    }

    /*
     * Time Stamp - 00:00
     */
    public static int convertToMins(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
    }

    /*
     * 😎 Optimized Solution using Bucket Sort Approach
     */
    public static int findMinDifferencePro(List<String> timePoints) {
        boolean[] mins = new boolean[24 * 60];
        for (String time : timePoints) {
            int m = convertToMins(time);
            if (mins[m])
                return 0;
            mins[m] = true;
        }
        int res = Integer.MAX_VALUE;
        int prevTime = Integer.MAX_VALUE;

        int lastTime = Integer.MAX_VALUE;
        int firstTime = Integer.MAX_VALUE;

        /*
         * If prevIndex does not contain the default value Integer.MAX_VALUE,
         * then we can find the difference between time i and the previous time
         * ans = min(ans, i - prevIndex)
         */
        for (int i = 0; i < 24 * 60; i++) {
            if (mins[i]) {
                if (prevTime != Integer.MAX_VALUE) {
                    res = Math.min(res, i - prevTime);
                }
                prevTime = i;

                if (firstTime == Integer.MAX_VALUE) {
                    firstTime = i;
                }
                lastTime = i;
            }
        }

        return Math.min(res, 24 * 60 + firstTime - lastTime);
    }
}
