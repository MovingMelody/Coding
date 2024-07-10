package ArraysAndArrayList;

import java.awt.event.WindowStateListener;
import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        System.out.println("Arrays in Java - Non Primitive Data Types (Reference Types)");
        // In Java, reference data types are any types that refer to objects
        // rather than containing the value directly.

        boolean[] arr = new boolean[5]; // by default all 5 values will be false
        System.out.println(Arrays.toString(arr));

        String[] stringArray = new String[3]; // by default null
        System.out.println(Arrays.toString(stringArray));

        int[] arr2 = new int[]{1, 2, 4, 5, 56};
        int[] arr3 = {1, 2, 4, 5};
        arr3[0] = 90;
        System.out.println(Arrays.toString(arr3));

        /*
         * MultiDimensional Arrays in Java (Array of Arrays)
         * eg: Tic Tac Toe, Grades of List of Students
         */
        System.out.println("------ 2D Arrays - Multidimensional ------");
        int[][] a2d = {
                {1, 2, 3}, // 0th Index
                {4}, // 1st Index -> each array size can vary
                {5, 6, 7, 8, 9}
        };
        int[][] twoDArray = new int[3][]; // only row size is mandatory
        twoDArray[0] = new int[]{2};
        twoDArray[2] = new int[]{1, 3, 4, 54, 5};
        // and the value of twoDArray[1] will be null. since it's not initialized

        for (int[] eachArray : twoDArray) {
//            for(int x :eachArray){
//                System.out.print(x + " ");
//            }
//            System.out.println();
            System.out.println(Arrays.toString(eachArray));
        }

        System.out.println("3x4 - 2DMatrix");
        int[][] matrix = new int[3][4];
        for (int[] eachRow : matrix) {
            System.out.println(Arrays.toString(eachRow));
        }

        /*
            Read data from user
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students in 2d Array: ");
        int studentsCount = sc.nextInt();
        String[][] gradesOfStudents = new String[studentsCount][];
        for (int i = 0; i < studentsCount; i++) {
            System.out.print("Subjects count for " + (i + 1) + " student: ");
            int currentStudentGradesCount = sc.nextInt();
            gradesOfStudents[i] = new String[currentStudentGradesCount];
            for (int j = 0; j < currentStudentGradesCount; j++) {
                String eachGrade = sc.next();
                gradesOfStudents[i][j] = eachGrade;
            }
        }
        System.out.println("Grades of List of Students");
        for (String[] eachArray : gradesOfStudents) {
            System.out.println(Arrays.toString(eachArray));
        }
    }
}
