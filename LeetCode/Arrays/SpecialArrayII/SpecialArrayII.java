package SpecialArrayII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialArrayII {
    public static void main(String[] args) {
        var queries = new int[][] { { 0, 2 }, { 2, 3 } };

        System.out.println(Arrays.toString(isArraySpecial(new int[] { 4, 3, 1, 6 }, queries)));
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int qn = queries.length;
        boolean[] res = new boolean[qn];

        // first calculate all the bad indexes(which are not special)
        List<Integer> badIndexes = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] & 1) == (nums[i - 1] & 1)) {
                badIndexes.add(i);
            }
        }

        // now check if there's any badIndex lies in each query range(inclusive)
        for (int i = 0; i < qn; i++) {
            int rangeStart = queries[i][0], rangeEnd = queries[i][1];
            boolean exists = binarySearch(badIndexes, rangeStart, rangeEnd);
            if (!exists) {
                res[i] = true;
            }
        }
        return res;
    }

    public static boolean binarySearch(List<Integer> badIndexes, int rangeStart, int rangeEnd) {
        int low = 0, high = badIndexes.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int middleBadElement = badIndexes.get(mid);
            if (middleBadElement > rangeStart && middleBadElement <= rangeEnd) {
                return true;
            } else if (middleBadElement <= rangeStart) {
                low = mid + 1;
            } else if (middleBadElement > rangeEnd) {
                high = mid - 1;
            }
        }
        return false;
    }
}
