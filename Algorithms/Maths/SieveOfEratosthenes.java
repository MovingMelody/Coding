/*
* Created on 10 Aug 2024
* 
* @author Sai Sumanth
*/

/* 
 * Find all the primes till given n
 */
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;

        sieve(n);
    }

    public static void sieve(int n) {
        boolean primes[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            // initially mark all as primes
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                // mark all multiples of primes[p] as false
                for (int i = p * 2; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        /*
         * Print all the PRIMES
         */
        printPrimes(primes);

    }

    static void printPrimes(boolean[] primes) {
        int count = 0;
        int n = primes.length;
        for (int i = 2; i < n; i++) {

            if (primes[i] == true) {
                count++;
                System.out.print(i + " ");
            }
            if (i + 1 == n)
                System.out.println();
        }
        System.out.println("Total count of primes from 1 to " + n + " is: " + count);
    }
}
