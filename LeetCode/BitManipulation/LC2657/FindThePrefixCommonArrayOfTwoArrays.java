package LC2657;

import java.util.Arrays;

public class FindThePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
        // 😎 Bit Manipulation Approach
        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[] { 3, 1, 2 }, new int[] { 2, 1, 3 })));

        // With Extra freq array of size[51]: using a freq map
        System.out.println(Arrays.toString(usingFreqMap(new int[] { 3, 1, 2 }, new int[] { 2, 1, 3 })));
    }

    // since the constraints are small - max array[i] is 50
    // we can use two binary numbers with 50 bits each and use the bits for marking
    // purpose
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        long bit1 = 0, bit2 = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            bit1 = bit1 | (1L << A[i]); // if A[i] is 5 then we need to put 1 at 5th bit using left shift
            bit2 = bit2 | (1L << B[i]);
            // System.out.println("bit1 : " + Long.toBinaryString(bit1));
            // System.out.println("bit2 : " + Long.toBinaryString(bit2));
            var commonOnes = bit1 & bit2;
            res[i] = Long.bitCount(commonOnes);
        }
        return res;
    }

    public static int[] usingFreqMap(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n], set = new int[51];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            set[A[i]]++;
            if (set[A[i]] == 2)
                counter++;

            set[B[i]]++;
            if (set[B[i]] == 2)
                counter++;
            res[i] = counter;
        }
        return res;
    }
}
