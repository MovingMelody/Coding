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

        printNaturalUsingRecursion(15);

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
}