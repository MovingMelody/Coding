/*
* Created on 27 Sep 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

public class CsesIncreasingArray {
    public static void main(String[] args) {
        // read array
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] nums = new long[(int) n];
        int i = 0;
        while (i < n) {
            nums[i] = sc.nextInt();
            i++;
        }
        long moves = minMoves(nums);
        System.out.println(moves);
        sc.close();
    }

    public static long minMoves(long[] nums) {
        if (nums.length == 0)
            return 0;
        long moves = 0;
        long prevNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < prevNum) {
                moves += prevNum - nums[i];
                prevNum = nums[i] + prevNum - nums[i];
            } else {
                prevNum = nums[i];
            }
        }
        return moves;
    }
}
