/*
* Created on 10 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int precision = 2;
        System.out.printf("Sqrt of %d is %.2f\n", n, sqrt(n, precision));
        sc.close();
    }

    /*
     * TC -> O(logN)
     */
    public static double sqrt(int n, int p) {
        if (n == 0 || n == 1)
            return n;
        double res = 0;
        int start = 0, end = n / 2;
        while (start <= end) {
            int mid = (start + end) >> 1;
            int value = mid * mid;
            if (value == n)
                return mid;
            if (value > n)
                end = mid - 1;
            else {
                res = mid;
                start = mid + 1;
            }
        }

        // if we have come till here then number is not a perfect square
        double precision = 0.1; // start with 0.1;
        for (int i = 0; i < p; i++) {

            while ((res * res) < n) {
                res += precision;
            }
            res -= precision;
            precision /= 10; // 0.1 becomes 0.01 when divided by 10
        }

        return res;
    }

}
