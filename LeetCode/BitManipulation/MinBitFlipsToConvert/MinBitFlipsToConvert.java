/*
* Created on 09 Aug 2024
* 
* @author Sai Sumanth
*/
package MinBitFlipsToConvert;

public class MinBitFlipsToConvert {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));
    }

    public static int minBitFlips(int start, int goal) {
        /*
         * when two bits are different xor will give 1
         * so perform start ^ goal and count the set bits
         */
        return Integer.bitCount(start ^ goal);
    }

}
