/*
* Created on 20 Aug 2024
* 
* @author Sai Sumanth
*/

import java.util.Arrays;

public class SortingUsingRecursion {
    public static void main(String[] args) {
        // this array constants can only be used in Initializers
        int[] array = { 999, 1, 3, 2, 5, 777, 4, 6, 8, 0, -98 };

        System.out.println("Before sorting: " + Arrays.toString(array));
        bubbleSortUsingRecursion(array);
        System.out.println("After sorting: " + Arrays.toString(array));

        array = new int[] { 999, 1, 3, 2, 5, 777, 4, 6, 8, 0, -98 };
        selectionSortUsingRecursion(array, 0, 1, 0);
        System.out.println("After Selection Sorting : " + Arrays.toString(array));

    }

    public static void bubbleSortUsingRecursion(int[] nums) {
        bbSortHelper(nums, 0, 0);
    }

    private static void bbSortHelper(int[] nums, int i, int j) {
        if (i == nums.length)
            return;

        if (j < nums.length - i - 1) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
            bbSortHelper(nums, i, j + 1);
        } else {

            // put the next largest element at the end
            // this acts as outer for loop in normal bb sort logic using loops
            bbSortHelper(nums, i + 1, 0);
        }
    }

    private static void selectionSortUsingRecursion(int[] array, int i, int j, int mini) {
        if (i == array.length - 1)
            return;
        if (j < array.length) {
            // Update the minimum index if a smaller element is found
            if (array[j] < array[mini]) {
                mini = j; // updat
            }
            selectionSortUsingRecursion(array, i, j + 1, mini);
        } else {
            int temp = array[i];
            array[i] = array[mini];
            array[mini] = temp;
            selectionSortUsingRecursion(array, i + 1, i + 2, i + 1);
        }
    }
}
