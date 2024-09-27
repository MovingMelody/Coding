/*
* Created on 27 Sep 2024
* 
* @author Sai Sumanth
*/

// https://cses.fi/problemset/task/1070/
import java.util.Scanner;

public class CSESPermutations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printPermutations(n);
    sc.close();
  }

  public static void printPermutations(int n) {
    if (n == 1) {
      System.out.println(1);
      return;
    } else if (n < 4) {
      System.out.println("NO SOLUTION");
      return;
    }
    // print permutations
    StringBuilder sb = new StringBuilder();
    for (int i = 2; i <= n; i += 2) {
      sb.append(i).append(" ");
    }

    for (int i = 1; i <= n; i += 2) {
      sb.append(i).append(" ");
    }

    System.out.println(sb.toString());
  }

}
