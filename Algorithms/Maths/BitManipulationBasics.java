/*
* Created on 08 Aug 2024
* 
* @author Sai Sumanth
*/

public class BitManipulationBasics {
    public static void main(String[] args) {
        /*
         * Find the ith bit of Number
         */
        int res = findTheithBitOfNumber(13, 2);
        System.out.println("2nd Bit of 13 from right is: " + res);

        /*
         * Swap two numbers
         */
        int a = 10, b = 7;
        System.out.println("before swapping a = " + a + " b = " + b);
        swapNumbersUsingXOR(a, b);

        /*
         * set the ith bit as 1
         */
        System.out.println("Before setting the 2nd bit of 9 as 1: " + 9);
        int afterSetting = setTheithBitAs1(9, 2);
        System.out.println("After setting the 2nd bit of 9 as 1: " + afterSetting);

        /*
         * Clear the ith Bit
         */
        int n = 13, i = 3;
        System.out.println("Before clearing the " + i + "th bit of " + n + " is " + n + " only");
        int nn = clearIthBit(n, i);
        System.out.println("After clearing the " + i + "th bit of " + n + " is " + nn);

        /*
         * Count the set bits
         * 13 -> 1101 -> so 3 set bits
         * 16 -> 1000 -> only 1 set bit
         * 
         * Java Inbuilt Method - Integer.bitCount(n);
         * 
         */
        int count = countSetBits(n);
        System.out.println("Total Set bits in " + n + " are :" + count);

    }

    private static int countSetBits(int n) {
        int cnt = 0;
        // convert one decimal to binary format to understand the below logic
        while (n > 1) {
            cnt += n & 1; // same as if(n%2 == 1) cnt++;
            n = n >> 1; // same as n = n/2;
        }
        if (n == 1)
            cnt++;
        return cnt;

        // return Integer.bitCount(n); // Java In-Built method
    }

    private static int clearIthBit(int n, int i) {

        /*
         * (1 << (i - 1)) will give 0100 if i is 3 for n 13 -> 1101
         * so we have to apply not operator to above result then 0100 becomes 1011
         */
        int zeroUnderIthBit = ~(1 << (i - 1));

        return n & zeroUnderIthBit;
    }

    /// if the bit at ith position is already 1 then the same number will be
    /// returned
    private static int setTheithBitAs1(int n, int i) {
        return n | (1 << (i - 1));
    }

    private static void swapNumbersUsingXOR(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swapping a = " + a + " b = " + b);

    }

    /*
     * Find the ith Bit of a given number.
     * Let suppose number is 13 and what is 2nd bit ? 1101 so 2nd bit is 0.
     * we have to find that ith bit without converting the number into binary.
     */
    public static int findTheithBitOfNumber(int n, int i) {
        /*
         * left shift 1 i-1 times and perform & operation with n
         * 
         * 1101
         * 0010
         * ----
         * 0000
         * ----
         */
        int eitherZeroOrAnotherNumber = (n & (1 << i - 1));
        return eitherZeroOrAnotherNumber == 0 ? 0 : 1;
    }
}
