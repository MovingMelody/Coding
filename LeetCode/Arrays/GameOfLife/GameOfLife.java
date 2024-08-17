package GameOfLife;

import java.util.Arrays;

/*
 * Created on 13 Aug 2024
 *
 * @author Sai Sumanth
 */

class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 0, 0, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0, 0}};

        gameOfLife(board);

        System.out.println("Next State");
        for (int[] x : board) {
            System.out.println(Arrays.toString(x));
        }
    }

    /*
    Brute Force
    Time Complexity - O(m * n) and extra neighbours check for each element O(m * n * 6)
    Space Complexity - Extra Space for new array

    Optimal approach should not use extra space
     */
    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveN = liveNeighbours(i, j, board, m, n);

                int nextState = board[i][j];
                if (board[i][j] == 1 && (liveN < 2 || liveN >= 4)) {
                    // prev state is live
                    nextState = 0;
                } else if (liveN == 3) {
                    // prev state is dead
                    nextState = 1;
                }
                System.out.printf("Live Count of (%d, %d): %d\n", i, j, liveN);
                res[i][j] = nextState;
            }
        }

        for (int i = 0; i < m; i++) {
            System.arraycopy(res[i], 0, board[i], 0, n);
        }
    }

    public static int liveNeighbours(int i, int j, int[][] board, int m, int n) {
        int live = 0;
        for (int row = Math.max(i - 1, 0); row <= Math.min(i + 1, m - 1); row++) {
            for (int col = Math.max(j - 1, 0); col <= Math.min(j + 1, n - 1); col++) {
                if ((row == i && col == j))
                    continue;

                // System.out.printf("(%d, %d) ", row, col);
                if (board[row][col] == 1)
                    live++;

            }
        }
        return live;
    }
}