/*
* Created on 02 Aug 2024
* 
* @author Sai Sumanth
*/
public class EvenOrOdd {
    public static void main(String[] args) {
        /*
         * Use & Operator to determine whether a number is even or odd.
         * 
         */
        int number = 9;

        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }
}
