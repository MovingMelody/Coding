/*
* Created on 08 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary number : ");
        String binary = sc.nextLine();
        System.out.println(binaryToDecimal(binary));
        sc.close();
    }

    /*
     * Convert given Binary number to it's Decimal Number
     */
    public static int binaryToDecimal(String x) {
        int num = 0;
        int current2PowerValue = 1;
        for (int i = x.length() - 1; i >= 0; i--) {
            if (x.charAt(i) == '1') {
                num += current2PowerValue;
            }
            /// 😎 No need to calculate pow(2,x) every time.
            current2PowerValue *= 2;
        }
        return num;
    }

}
