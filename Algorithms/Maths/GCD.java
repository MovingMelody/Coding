/*
* Created on 11 Aug 2024
* 
* @author Sai Sumanth
*/
public class GCD {

    /*
     * GCD or HCF - Greatest Common Divisor or Highest Common Factor
     * GCD of 9,12 is 3
     * how ?
     * 9 factors are -> 1,3,9
     * 12 factors are -> 1,2,3,4,6,12
     * 
     * 1 & 3 are the common divisors but 3 is the highest
     */

    public static void main(String[] args) {
        int a = 10, b = 56;
        int lcm = gcdOfNumbers(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + lcm);

        a = 12;
        b = 78;
        lcm = gcdEuclideanSubtraction(a, b);
        System.out.println("GCD(Euclidean Subtraction) of " + a + " and " + b + " is: " + lcm);

        a = 2;
        b = 5;
        lcm = gcdEuclideanDivision(a, b);
        System.out.println("GCD(Euclidean Division) of " + a + " and " + b + " is: " + lcm);
    }

    /*
     * TC -> O(min(a,b))
     */
    private static int gcdOfNumbers(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 00 && b % min == 0) {
                return min;
            }
            min--;
        }

        return 1;
    }

    /*
     * Using Euclidean algorithm (Repeated Subtraction)
     * 
     * GCD(a,b) = GCD(a-b,a) where a>b. GCD(a, b-a) if b is greater
     * we have to repeat the above process until one of the number becomes zero,
     * then return the other number
     * 
     */
    private static int gcdEuclideanSubtraction(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        // if b is greater, subtract a from b
        if (b > a)
            return gcdEuclideanSubtraction(a, b - a);
        return gcdEuclideanSubtraction(a - b, b);
    }

    private static int gcdEuclideanDivision(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;

            if (a == 0)
                return b;
            if (b == 0)
                return a;
        }
        return 1;
    }
}
