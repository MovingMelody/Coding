/*
* Created on 12 June 2024
* 
* @author Sai Sumanth
*/

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Number using Recursion");
        int n = 40;
        int res = fibo(n);
        System.out.println(n + "th Fibonacci Number is : " + res);
    }

    static int fibo(int n) {
        if (n <= 1) { // Base Condition
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
