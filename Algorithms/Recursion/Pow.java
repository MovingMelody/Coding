/*
* Created on 14 June 2024
* 
* @author Sai Sumanth
*/

public class Pow {
    public static void main(String[] args) {
        System.out.println("Calculate Power of a Number");
        int x = 2;
        int n = 10;
        double res = myPow(x, n);
        System.out.println(x + " Power " + n + " is " + res);
    }

    public static double myPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * myPow(x, n - 1);
    }

}
