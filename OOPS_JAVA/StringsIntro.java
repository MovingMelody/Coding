/*
 * Created on 31 July 2024
 *
 * @author Sai Sumanth
 */

import java.util.ArrayList;
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

        System.out.println('a' + 'b'); // 195 (ASCII)
        System.out.println("a" + 'b'); // ab
        System.out.println("a" + 6); // a6
        System.out.println('a' + 6); // 103
        System.out.println((char) ('a' + 6)); // g

        System.out.println("Meow" + new ArrayList<>()); // Meow[]

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
        name = "sc.nextLine()";
        System.out.print("What do you love: ");
        String heLoves = "sc.nextLine()";
        System.out.printf("Name is %s and He love %s\n", name, heLoves);
        sc.close();

        /*
         * Performance & StringBuilder
         */
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<26;i++){
            sb.append((char)('a' + i));
        }
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0, 'a');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.toString().toUpperCase());

        // Loop through string
        for(char ch : sb.toString().toCharArray()){
            System.out.print(ch + " ");
        }
    }
}
