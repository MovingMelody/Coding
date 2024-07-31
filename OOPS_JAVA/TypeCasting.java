import java.util.Scanner;

/*
 * Created on 26 June 2024
 *
 * @author Sai Sumanth
 */
public class TypeCasting {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Type Conversion/Casting in Java");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        float a = sc.nextInt();

        System.out.print("Enter integer b: ");
        float b = sc.nextInt();

        float sum = a + b;
        System.out.println("Sum : " + sum);

        int num1 = 30;
        float num2 = num1; // automatic implicit type conversion
        // int num3 = num2; // automatic type conversion of float to int is not possible
        int num3 = (int) num2; // we've to do it explicitly. Narrow Type Casting (big to small)

        // important scenario
        int beyondByte = 129;
        byte by = (byte) beyondByte;
        System.out.println("Byte value by: " + by); // prints -127

        // another important example
        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;

        int res = b1 * b2 / b3; // here result of intermediate term b1 * b2 is 2000 which exceeds byte range
        byte d = (byte) (b1 * b2 / b3);
        System.out.println("d: " + d);

        int intChar = 'a'; // 97
        int intChar2 = 'A'; // 65 ASCII value

        byte bb = 42;
        char cc = 'a';
        short ss = 1024;
        int ii = 50000;
        float ff = 5.67f;
        double dd = 0.1234;
        double result = (ff * bb) + (ii / cc) + (dd * ss); // (float) + (int) + (double) = overall result in double
        System.out.println((ff * bb) + " " + (ii / cc) + " " + (dd * ss));
        System.out.println("result: " + result);
        sc.close();
    }
}
