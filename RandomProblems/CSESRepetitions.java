/*
* Created on 27 Sep 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

// https://cses.fi/problemset/task/1069

class CSESRepetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.next();
        System.out.println(maxRep(dna));
        sc.close();
    }

    public static int maxRep(String dna) {
        if (dna.length() == 0)
            return 0;
        int max = Integer.MIN_VALUE;

        char prev = dna.charAt(0);
        int tempMax = 1;
        for (int i = 1; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (prev == c) {
                tempMax++;
            } else {
                max = Math.max(max, tempMax);
                tempMax = 1;
                prev = c;
            }
        }
        max = Math.max(max, tempMax);
        return max;
    }

}