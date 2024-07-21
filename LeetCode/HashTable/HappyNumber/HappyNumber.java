package HappyNumber;

/*
 * Created on 21 July 2024
 *
 * @author Sai Sumanth
 */

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(2));

        System.out.println(isHappySolution2(2));
    }
    /*
     * for n = 2, sum of squares calculation goes like this
     * 2 4 16 37 58 89 145 42 20 -> again 4 so it's not possible to reach 1
     * 
     * Using fast and slow pointer approach - (😎 No need of HashMap)
     * Fast: 16 Slow: 4
     * Fast: 58 Slow: 16
     * Fast: 145 Slow: 37
     * Fast: 20 Slow: 58
     * Fast: 16 Slow: 89
     * Fast: 58 Slow: 145
     * Fast: 145 Slow: 42
     * Fast: 20 Slow: 20
     */

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        // since both slow & fast are same in the beginning, we are using do while loop
        do {
            // slow moving one step ahead and fast moving two steps ahead
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
            System.out.println("Fast: " + fast + " Slow: " + slow);
        } while (slow != fast);

        // for any given 'n' cycle exists for sure.
        // Happy Number cycle will end at '1' and points to itself then after

        return slow == 1;
    }

    // Another solution using HashMap
    public static boolean isHappySolution2(int n) {
        Set<Integer> set = new HashSet<>();
        while (n > 0 && !set.contains(n)) {
            set.add(n);
            System.out.print(n + " ");
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    // returns the sum of squares of a given number
    public static int sumOfSquares(int n) {
        int res = 0;
        while (n != 0) {
            int rem = n % 10;
            res += rem * rem;
            n /= 10;
        }
        return res;
    }
}
