package FindMissingObservations;

import java.util.Arrays;

/*
 * Created on 05 Sep 2024
 * 
 * @author Sai Sumanth
 */

final class FindMissingObservations {
    public static void main(String[] args) {
        int[] rolls = { 3, 5, 3 };
        int[] missing = missingRolls(rolls, 5, 3);
        System.out.println("Missing Rolls are: " + Arrays.toString(missing));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int rollsSum = 0;
        for (int x : rolls) {
            rollsSum += x;
        }
        int missingRollsSum = ((rolls.length + n) * mean) - rollsSum;

        if (missingRollsSum <= 0 || missingRollsSum > (6 * n))
            return new int[0];

        int[] missing = new int[n];
        // min value of all the elements in res array will be set to this each Min
        // then the remaining quotient will be distributed until it becomes zero
        int eachMin = missingRollsSum / n;
        int q = missingRollsSum % n;
        for (int i = 0; i < n; i++) {
            missing[i] = eachMin + (q != 0 ? 1 : 0);
            q--;
        }

        return missing;
    }
}