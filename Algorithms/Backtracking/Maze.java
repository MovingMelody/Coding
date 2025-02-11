/*
* Created on 09 Dec 2024
* 
* @author Sai Sumanth
*/
package Algorithms.Backtracking;

import java.util.*;

// Check subsets problem for backtracking before going through this Maze problem
public class Maze {
    public static void recursionPassByReference(int i, List<Integer> lis) {
        System.out.println("i: " + i + " lis: " + lis);

        if (i == 5)
            return;
        i = i + 1; // this change is applicable only to this function call stack
        lis.add(i); // but this modification will reflect in it's previous recursive call also
        recursionPassByReference(i, lis);
        lis.removeLast();
        System.out.println("i: " + i + " lis: " + lis);

    }

    public static void main(String[] args) {
        int lastRowIndex = 2;
        int lastColIndex = 2;
        // 1. total paths count to reach goal in 3 X 3 maze with only R & D moves
        System.out.println("Total Paths Count in a maze with only Right and Down moves: "
                + countPaths(0, 0, lastRowIndex, lastColIndex));

        // 2. find all the actual paths, not just the count
        List<String> pathsWithLeftAndRightMoves = new ArrayList<>();
        findPathsWithRandDMoves("", 0, 0, lastRowIndex, lastColIndex, pathsWithLeftAndRightMoves);
        System.out.println("All the Paths with Right and Down moves: " + pathsWithLeftAndRightMoves);

        // 3. Right, Down, and Diagonal(only Bottom-Right diagonal) Moves
        List<String> rightDownDiagonal = new ArrayList<>();
        findPathsDiagonal("", 0, 0, lastRowIndex, lastColIndex, rightDownDiagonal);
        System.out.println("All the Paths with Right, Down, Diagonal moves: " + rightDownDiagonal);

        // 4. R,D,X Moves with obstacles
        List<String> rdxWithOb = new ArrayList<>();
        boolean[][] obstacles = new boolean[][] {
                { false, false, false },
                { false, true, false },
                { false, false, false } };
        findPathsWithObstacles("", 0, 0, lastRowIndex, lastColIndex, rdxWithOb, obstacles);
        System.out.println("Right, Down, Diagonal with Obstacles Moves: " + rdxWithOb);

        // 5. All moves are allowed. UP, DOWN, RIGHT, LEFT
        boolean[][] visitedCells = new boolean[3][3];
        String[][] roadWithDirections = new String[][] {
                { "🔴", "🔴", "🔴" },
                { "🔴", "🔴", "🔴" },
                { "🔴", "🔴", "😎" } };
        List<String> pathsWithAllMoves = new ArrayList<>();
        findPathsAllMoves("", 0, 0, visitedCells.length - 1, visitedCells[0].length - 1, pathsWithAllMoves,
                visitedCells, roadWithDirections);
        System.out.println("Paths with All Moves L,D,R,U: " + pathsWithAllMoves);
    }

    /*
     * 1️⃣ Calculate the total paths count to reach goal, Only Right and Down
     * moves are allowed
     */
    public static int countPaths(int r, int c, int lastRowIndex, int lastColIndex) {
        // System.out.println("Row: " + r + " Col: " + c);
        if (r == lastRowIndex || c == lastColIndex) {
            return 1;
        }

        // down move first
        int downMoveCount = countPaths(r + 1, c, lastRowIndex, lastColIndex);

        int rightMoveCount = countPaths(r, c + 1, lastRowIndex, lastColIndex);

        return downMoveCount + rightMoveCount;

    }

    /*
     * 2️⃣ Find all the actual paths (only R & D moves are allowed)
     */
    public static void findPathsWithRandDMoves(String path, int r, int c, int lastRowIndex, int lastColIndex,
            List<String> res) {
        if (r == lastRowIndex && c == lastColIndex) {
            // reached the goal, we found the path
            res.add(path);
            return;
        }
        // from each cell, he can move either Down or Right, and after going R or D he
        // can can again have two options, so two recursive calls for each step

        // once last row is reached he can't go down further
        if (r < lastRowIndex) {
            findPathsWithRandDMoves(path + "D", r + 1, c, lastRowIndex, lastColIndex, res);
        }

        // once the last COL is reached he can't go Right further
        if (c < lastColIndex) {
            findPathsWithRandDMoves(path + "R", r, c + 1, lastRowIndex, lastColIndex, res);
        }
    }

    /*
     * 3️⃣ Along with Right and Down, Diagonal moves are also allowed.(only
     * Bottom-Right Diagonal, not all diagonals)
     */
    public static void findPathsDiagonal(String path, int r, int c, int lastRowIndex, int lastColIndex,
            List<String> res) {
        if (r == lastRowIndex && c == lastColIndex) {
            // reached the goal, we found the path
            res.add(path);
            return;
        }
        // from each cell, he can move Down or Right or Diagonally(BottomRight Diagonal)
        if (r < lastRowIndex) {
            findPathsDiagonal(path + "D", r + 1, c, lastRowIndex, lastColIndex, res);
        }

        if (c < lastColIndex) {
            findPathsDiagonal(path + "R", r, c + 1, lastRowIndex, lastColIndex, res);
        }

        // when we move diagonally both row and col gets increased
        if (r < lastRowIndex && c < lastColIndex) {
            findPathsDiagonal(path + "X", r + 1, c + 1, lastRowIndex, lastColIndex, res);
        }
    }

    /*
     * 4️⃣ Right, Down, Diagonal with Obstacles
     */
    public static void findPathsWithObstacles(String path, int r, int c, int lastRow, int lastCol, List<String> res,
            boolean[][] obstacles) {
        // check if current move is an obstacle, if yes then return that path is !valid
        //
        // this check can be performed before performing the move also,
        // add condition at each move, consider moving only when there's no obstacle
        if (obstacles[r][c] == true)
            return;

        if (r == lastRow && c == lastCol) {
            res.add(path);
            return;
        }

        // down move
        if (r < lastRow)
            findPathsWithObstacles(path + "D", r + 1, c, lastRow, lastCol, res, obstacles);

        // right move
        if (c < lastCol)
            findPathsWithObstacles(path + "R", r, c + 1, lastRow, lastCol, res, obstacles);

        // diagonal move
        if (r < lastRow && c < lastCol)
            findPathsWithObstacles(path + "X", r + 1, c + 1, lastRow, lastCol, res, obstacles);
    }

    /*
     * 5️⃣ Find paths with all moves allowed, LEFT, RIGHT, UP, DOWN
     * 😎 BACKTRACKING BABY!!!
     */
    public static void findPathsAllMoves(String path, int r, int c, int lastRowIndex, int lastColIndex,
            List<String> res, boolean[][] visitedCells, String[][] road) {
        if (r == lastRowIndex && c == lastColIndex) {
            // reached the goal, we found the path
            res.add(path);
            // print the directions for current path
            for (String[] a : road) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println("Maze Directions: " + path);
            System.out.println();
            return;
        }
        if (visitedCells[r][c] == true)// current cell is already visited
            return;

        visitedCells[r][c] = true;

        // Down Move
        // once last row is reached he can't go down further
        if (r < lastRowIndex) {
            road[r][c] = "👇";
            findPathsAllMoves(path + "D", r + 1, c, lastRowIndex, lastColIndex, res, visitedCells, road);
        }

        // Right Move
        if (c < lastColIndex) {
            road[r][c] = "👉";
            findPathsAllMoves(path + "R", r, c + 1, lastRowIndex, lastColIndex, res, visitedCells, road);
        }

        // Left Move. Column gets decreased on left move
        if (c > 0) {
            road[r][c] = "👈";
            findPathsAllMoves(path + "L", r, c - 1, lastRowIndex, lastColIndex, res, visitedCells, road);

        }

        // Up Move. Row gets decreased on Up Move
        if (r > 0) {
            road[r][c] = "👆";
            findPathsAllMoves(path + "U", r - 1, c, lastRowIndex, lastColIndex, res, visitedCells, road);
        }

        visitedCells[r][c] = false; // go back from the last move and mark it as not visited, like backtracking

        road[r][c] = "🔴";
    }
}