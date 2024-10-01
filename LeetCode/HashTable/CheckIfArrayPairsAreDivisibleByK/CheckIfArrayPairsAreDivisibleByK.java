/*
* Created on 01 Oct 2024
* 
* @author Sai Sumanth
*/

package CheckIfArrayPairsAreDivisibleByK;

public class CheckIfArrayPairsAreDivisibleByK {
    public static void main(String[] args) {
        System.out.println(canArrange(new int[] { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9 }, 5));
    }

    /*
     * TC - O(n)
     * SC - O(n)
     */
    public static boolean canArrange(int[] arr, int k) {
        int[] modFreq = new int[k];
        for (int x : arr) {
            /*
             * (x%k) works only for +ve numbers. -6 % 5 is -1
             * 
             * ((x % k) + k) % k is same as (x%k) for positive numbers.
             * 7%5 = 2
             * ((7%5)+5)%5 will also be 2 only
             */
            modFreq[((x % k) + k) % k]++;
        }

        if (modFreq[0] % 2 != 0) // mod of numbers in arr divisible by k will 0
            return false;
        for (int i = 1; i <= k / 2; i++) {
            if (modFreq[i] != modFreq[k - i])
                return false;
        }
        return true;
    }
}
