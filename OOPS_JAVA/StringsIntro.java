/*
 * Created on 31 July 2024
 *
 * @author Sai Sumanth
 */

import java.util.Scanner;

public class StringsIntro {
    public static void main(String[] args) {
        String catSays = "Meow";
        String dogSays = "Bau";
        String kittenSays = "Meow";

        boolean areEqual = catSays == kittenSays; // True
        System.out.println("catSays and kittenSays are equal ? " + areEqual);

        String newCat = new String("Meow");
        String newCat2 = new String("Meow");

        areEqual = newCat == newCat2; // False
        System.out.println("Two Strings created using new keyword are equal ? " + areEqual);

        areEqual = newCat.equals(newCat2); // now True
        System.out.println("when compared two string objects with equals method: " + areEqual);
        System.out.println(dogSays);

        // Double num = new Double(34); // deprecated
        /*
         * The Double(double) constructor has been deprecated because
         * Double.valueOf(double) method is more efficient.
         * The valueOf method uses a cache for commonly used values,
         * which can improve performance and reduce memory usage.
         */

        Double num1 = Double.valueOf(78.9); // boxing
        double unbox = num1; // Unboxing
        Double num2 = 76.7687667; // Auto-Boxing

        System.out.println(unbox + " " + num2);

        System.out.printf("Only upto Two Decimals %.2f\n", num2);
        System.out.printf("Math PI %.3f\n", Math.PI);
        String name = "";

        // Format Specifier - %s in printf
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        name = sc.nextLine();
        System.out.print("What do you love: ");
        String heLoves = sc.nextLine();
        System.out.printf("Name is %s and He love %s\n", name, heLoves);
        sc.close();

        System.out.println("a" + 6);
    }
}
