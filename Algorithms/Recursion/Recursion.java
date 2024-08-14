/*
 * Created on 12 June 2024
 *
 * @author Sai Sumanth
 */
class Recursion {
    public static void main(String[] args) {
        System.out.println("Recursion Concept");
        // Say Hello World for n Times

        printNatural1(1);

        System.out.println("Print Numbers from 1 to n using Recursion");
        printNaturalUsingRecursion(8);

        int n = 5;
        int res = nFactorial(n);
        System.out.printf("Factorial of %d is %d\n", n, res);

        int digits = 123;
        int sum = sumOfDigits(digits);
        System.out.printf("Sum of digits in %d is %d\n", digits, sum);

        int reverse = reverseNumber(digits);
        System.out.printf("Reverse of %d is %d\n", digits, reverse);
    }


    static void printNatural1(int n) {
        System.out.println(n);
        printNatural2(2);
    }

    static void printNatural2(int n) {
        System.out.println(n);
        printNatural3(3);
    }

    static void printNatural3(int n) {
        System.out.println(n);
        printNatural4(4);
    }

    static void printNatural4(int n) {
        System.out.println(n);
        printNatural5(5);
    }

    static void printNatural5(int n) {
        System.out.println(n);
    }

    // Print first n natural numbers using Recursion
    static void printNaturalUsingRecursion(int n) {
        if (n == 1) {
            // Base Condition
            System.out.println(1);
            return;
        }
        printNaturalUsingRecursion(n - 1);
        System.out.println(n);
    }

    private static int nFactorial(int n) {
        if (n == 1) return n;
        return n * nFactorial(n - 1);
    }

    private static int sumOfDigits(int n) {
        if (n < 10) return n;
        int currentDigit = n % 10;
        return currentDigit + sumOfDigits(n / 10);
    }

    public static int reverseNumber(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int rev) {
        if (n == 0) return rev;
        int rem = n % 10;
        return reverseHelper(n / 10, rev * 10 + rem);
    }

}