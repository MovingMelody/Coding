package LC875;

public class KokoEatingBananas {

    public int minEatingSpeedBruteForce(int[] piles, int h) {
        int min = Integer.MAX_VALUE;
        int bigPile = 0;

        for (int x : piles) {
            bigPile = Math.max(bigPile, x);
        }

        // start from one banana per hour, then keep on increasing until the total hours
        // are less than given h
        for (int i = 1; i <= bigPile; i++) {
            int totalHours = 0;
            for (int j = 0; j < piles.length; j++) {
                // as per the problem, koko will move to next only when one pile is completed.
                // so if a pile contains 3 bananas, and if x is 2 then it will take 2 hrs to eat
                // 3 bananas, not 1.5
                double hoursForPile = Math.ceil(piles[j] / (double) i);
                totalHours += hoursForPile;
            }

            if (totalHours <= h) {
                min = i;
                break;
            }
        }
        return min;
    }

    // Optimized 😎 using binary search
    public int minEatingSpeed(int[] piles, int h) {
        int min = 0, bigPile = 0;

        for (int x : piles) {
            bigPile = Math.max(bigPile, x);
        }

        int start = 1, end = bigPile;
        while (start <= end) {
            int perHour = start + (end - start) / 2;

            int totalHours = 0;
            for (int eachPile : piles) {
                double hoursForPile = Math.ceil(eachPile / (double) perHour);
                totalHours += hoursForPile;
            }

            if (totalHours <= h) {
                min = perHour;
                end = perHour - 1;
            } else {
                start = perHour + 1;
            }

        }
        return min;
    }
}
