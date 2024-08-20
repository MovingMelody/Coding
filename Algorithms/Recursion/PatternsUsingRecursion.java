/*
* Created on 20 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

public class PatternsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printRightAngledTriangle(n);

        System.out.println("\n");

        printRightAngledTriangleWithoutLoops(0, n);

        sc.close();
    }

    public static void printRightAngledTriangle(int n) {
        if (n == 0)
            return;
        // print each line
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        System.out.println();
        // make this recursive call just above the for loop and another form of right
        // angled triangle gets printed
        printRightAngledTriangle(n - 1);
    }

    // above logic without using any for loops but more recursive calls
    public static void printRightAngledTriangleWithoutLoops(int c, int r) {
        // stop if row is zero
        if (r == 0)
            return;

        if (c < r) {
            printRightAngledTriangleWithoutLoops(c + 1, r);
            System.out.print("* ");
        } else {
            // start new row
            printRightAngledTriangleWithoutLoops(0, r - 1);
            System.out.println();
        }
    }

}
