/*
* Created on 28 June 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

class SquarePattern {
    /*
     * If n is 3
     * 33333
     * 32223
     * 32123
     * 32223
     * 33333
     * 
     * 
     * If n is 5
     * 
     * 555555555
     * 544444445
     * 543333345
     * 543222345
     * 543212345
     * 543222345
     * 543333345
     * 544444445
     * 555555555
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        printPattern(n);

        sc.close();
    }

    public static void printPattern(int n) {
        // top part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - j + 1);
            }

            for (int k = 1; k <= (n * 2) - 2 * i - 1; k++) {
                System.out.print(n - i + 1);
            }

            for (int j = 1; j <= i; j++) {
                if (j + n - i != 1) {
                    System.out.print(j + n - i);
                }
            }
            System.out.println();
        }

        /// bottom part
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(n - j + 1);
            }

            // middle
            for (int k = 1; k <= (n * 2) - 2 * (n - i) - 1; k++) {
                System.out.print(n - (n - i) + 1);
            }

            for (int j = n - i; j >= 1; j--) {
                System.out.print(n - j + 1);
            }
            System.out.println();
        }
    }
}
