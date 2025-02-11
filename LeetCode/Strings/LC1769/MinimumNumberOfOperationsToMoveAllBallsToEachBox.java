package LeetCode.Strings.LC1769;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public static int[] minOperationsBruteForce(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int op = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && boxes.charAt(j) == '1') {
                    op += Math.abs(i - j);
                }
            }
            res[i] = op;
        }
        return res;
    }

    /*
     * 😎 Optimal - Prefix, Suffix sum approach
     */
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int leftBalls = 0, leftMovesTillHere = 0;
        int rightBalls = 0, rightMovesTillHere = 0;
        for (int i = 0; i < n; i++) {
            char ch = boxes.charAt(i);
            res[i] += leftMovesTillHere;
            if (ch == '1')
                leftBalls++;
            leftMovesTillHere += leftBalls;

            char rightChar = boxes.charAt(n - i - 1);
            res[n - i - 1] += rightMovesTillHere;
            if (rightChar == '1')
                rightBalls++;
            rightMovesTillHere += rightBalls;
        }

        return res;
    }
}
