/*
* Created on 25 Sep 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

// https://cses.fi/problemset/task/1068/

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        weirdAlgo(n);
        sc.close();

    }

    public static void weirdAlgo(long n) {
        System.out.print(n + " ");
        while (n > 1) {
            if ((n & 1) != 0) {
                n = n * 3 + 1;
            } else {
                n = n >> 1;
            }
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
