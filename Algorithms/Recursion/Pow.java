/*
 * Created on 14 June 2024
 *
 * @author Sai Sumanth
 */

// https://leetcode.com/problems/powx-n/description/

public class Pow {
    public static void main(String[] args) {
        System.out.println("Calculate Power of a Number");

        double x = 2;
        int n = 10;
        double res = myPow(x, n);
        System.out.println(x + " Power " + n + " is " + res);

        x = 4.00;
        n = -2;
        res = myPowNeg(x, n);
        System.out.println(x + " Power " + n + " is " + res);

        x = 3;
        n = 7;
        res = powOptimized(x, n);
        System.out.println(x + " Power " + n + " is " + res);

        x = 2;
        n = 7;
        res = myPowR(x, n);
        System.out.println(x + " Power " + n + " is " + res);
    }

    public static double myPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * myPow(x, n - 1);
    }

    /*
     * What if n is -ve ?
     */
    public static double myPowNeg(double x, int n) {
        boolean isNeg = n < 0;
        double res = pow(x, Math.abs(n));
        return isNeg ? 1 / res : res;
    }

    public static double pow(double x, int n) {
        if (n == 1)
            return x;
        if (n == 0)
            return 1;
        return x * pow(x, n - 1);
    }

    /*
     * Can we Optimize the Number of Recursive Calls ?
     *
     * x^n
     *
     * if n is even : x^n => (x^2)^n/2
     *
     * if n is odd, : x^n => x * (x)^n-1
     *
     */

    public static double powOptimized(double x, int n) {
        double res = 1.0;
        long nn = n; // -2147483648
        if (nn < 0)
            nn *= -1;
        while (nn > 0) {
            if (nn % 2 == 0) {
                x = x * x;
                nn /= 2;
            } else {
                res *= x;
                nn -= 1;
            }
        }

        return (n < 0) ? (1.0 / res) : res;
    }

    // Recursive Optimized Approach
    public static double myPowR(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        // Recursively calculate power
        double halfPower = myPowR(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        }
        return halfPower * halfPower * x;

    }
}
