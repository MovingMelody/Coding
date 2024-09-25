/*
* Created on 25 Sep 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

// https://cses.fi/problemset/task/1083

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] nums = new long[(int) n - 1];
        int i = 0;
        while (i < n - 1) {
            nums[i] = sc.nextInt();
            i++;
        }
        missingNumberCyclic(n, nums);
        sc.close();
    }

    public static void missingNumber(long n, long[] nums) {
        long sum = 0;
        for (long x : nums) {
            sum += x;
        }
        long missing = (long) (n * (n + 1) / 2) - sum;
        System.out.println(missing);
    }

    public static void missingNumberCyclic(long n, long[] nums) {
        int p = 0;
        while (p < nums.length) {
            int correctIndex = (int) nums[p] - 1;
            if (correctIndex < nums.length && nums[correctIndex] != nums[p]) {
                long temp = nums[p];
                nums[p] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                p++;
            }
        }
        int res = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res = i + 1;
                break;
            }
        }
        System.out.println(res);
    }

}
