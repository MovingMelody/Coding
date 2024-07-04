import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        // *****
        // *---*
        // *---*
        // *---*
        // *****
        //
        // for n = 5
        // Ignore the hypens(-) between stars
        printBoxPattern(n);

        // increasing letter triangle
        printIncreasingLetterTriangle(n);

        // n Star Triangle
        // *
        // ***
        // *****
        printStarTriangle(n);

        printReverseTriangle(n);

        printStarDiamond(n);

        printAlphaHill(n);

    }

    private static void printAlphaHill(int n) {
        System.out.println("\n----------  Alpha Hill  --------");

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int space = n - i; space >= 1; space--) {
                System.out.print(" ");
            }
            // print alphas
            for (int alpha = 1; alpha <= i; alpha++) {
                char c = (char) (alpha + 64);
                System.out.print(c);
            }

            // print final alphas
            for (int fa = 1; fa < i; fa++) {
                char c = (char) (fa + 64);
                System.out.print(c);
            }

            System.out.println();
        }
    }

    private static void printStarDiamond(int n) {
        System.out.println("\n----------  Star Diamond ♦ Triangle --------");

        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n * 2; i++) {
            // spaces
            for (int space = spaces; space >= 1; space--) {
                System.out.print(" ");
            }

            // stars
            for (int star = stars; star >= 1; star--) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= n) {
                spaces--;
                stars += 2;
                if (stars > n * 2 - 1) {
                    stars = n * 2 - 1;
                }
            } else {
                spaces = i - n;
                stars -= 2;
            }

        }
    }

    private static void printReverseTriangle(int n) {
        System.out.println("\n---------- Reverse Star Triangle --------");

        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printStarTriangle(int n) {
        System.out.println("\n---------- Star Triangle --------");

        int stars = 1;
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }

            // print stars
            for (int s = 1; s <= stars; s++) {
                System.out.print("*");
            }
            stars += 2;
            spaces--;
            System.out.println();
        }
    }

    private static void printIncreasingLetterTriangle(int n) {
        System.out.println("\n---------- Increasing Letter Triangle --------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char c = (char) (j + 64);
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void printBoxPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    // System.out.print(i + " " + j);
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 19, 20, 17, 12