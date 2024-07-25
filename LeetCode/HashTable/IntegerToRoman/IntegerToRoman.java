/*
 * Created on 25 July 2024
 *
 * @author Sai Sumanth
 */

package IntegerToRoman;

public class IntegerToRoman {
    public static void main(String[] args) {
        // System.out.println(intToRoman(1));
        // System.out.println(intToRoman(12));
        System.out.println(intToRoman(3749));
        System.out.println(intToRomanMethod2(3749));
    }

    /*
     * The time complexity of the intToRoman method is
     * 𝑂(1). Because the number of iterations (13) and the maximum length of the
     * resulting Roman numeral string are both constant and bounded. The space
     * complexity is also O(1) as the additional space used does not grow with the
     * size of the input num.
     */
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        for (int i = 0; i < values.length; i++) {
            if (num / values[i] > 0) {
                sb.append(String.valueOf(romans[i]).repeat(num / values[i]));
            }
            num %= values[i];
        }

        return sb.toString();
    }

    public static String intToRomanMethod2(int num) {
        StringBuilder sb = new StringBuilder();

        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }

        return sb.toString();
    }
}
