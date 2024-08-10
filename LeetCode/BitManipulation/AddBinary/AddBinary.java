/*
* Created on 10 Aug 2024
* 
* @author Sai Sumanth
*/

package AddBinary;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("01", "11"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ai = a.length() - 1;
        int bi = b.length() - 1;
        int carry = 0;
        while (ai >= 0 || bi >= 0) {
            int sum = carry;
            if (ai >= 0)
                sum += a.charAt(ai--) - '0';
            if (bi >= 0)
                sum += b.charAt(bi--) - '0';
            /*
             * possible sum values 1,0 -> 0 | 0,1 -> 1 | 0,0 -> 0 | 1,1 -> 2
             * 1%2=1; 0%2=0; 2%2=0
             * 
             * Keep track of carry as well, we will get carry only when sum is 2. 2/2 = 1
             */
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
