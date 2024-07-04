import java.util.Scanner;

/*
 * Created on 27 June 2024
 *
 * @author Sai Sumanth
 */
public class LoopsAndConditions {
    public static void main(String[] args) {
        System.out.println("Loops and Conditionals in Java");
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci of: ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibo: " + fibonacci(n));

        // do-while loop
        String correctPassword = "secret";
        String enteredPassword;
        do {
            System.out.print("Enter your password: ");
            enteredPassword = sc.nextLine();
        } while (!correctPassword.equals(enteredPassword));
        System.out.println("Access Granted");


        //
        int occ = countOccurenceOfNumberInABigNumber(76765566555546787L, 5);
        System.out.println("Total occurrences of 5 : " + occ);

        System.out.print("Enter Day 1-7: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break; // reason why we should specify break explicity. It can match all the above cases
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");

        }
        // Enhanced version of above switch case
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Working Day");
            // reason why we should specify break explicity. It can match all the above cases
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
        sc.close();
    }

    public static int fibonacci(int nth) {
        int res = 0;
        int a = 0, b = 1;
        while (nth != 0) {
            res = a + b;
            a = b;
            b = res;
            nth--;
        }

        return res;
    }

    public static int countOccurenceOfNumberInABigNumber(long bigNumber, int occurenceNumber) {
        int occurrences = 0;
        System.out.println(bigNumber);
        while (bigNumber != 0) {
            if (bigNumber % 10 == occurenceNumber) {
                occurrences++;
            }
            bigNumber /= 10;
        }
        return occurrences;
    }


}
