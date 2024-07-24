package IntersectionOfMultipleArrays;
/*
* Created on 22 June 2024
* 
* @author Sai Sumanth
*/

/*
   Link - https://leetcode.com/problems/intersection-of-multiple-arrays/description/
   Topics - arrays, hash-table
   Solved ? ✅
*/

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        List<Integer> res = intersection(new int[][] { { 3, 1, 2, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } });
        res.forEach((each) -> {
            System.out.println(each);
        });
    }

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        // since the constraints are small <= 1000 we can use array as hash table/frequency table
        int[] map = new int[1001];
        int len = nums.length;
        for (int[] eachArray : nums) {
            for (int x : eachArray) {
                map[x]++;
            }
        }
        /// we are asked to return the res in ascending order. since the freq map is an array
        /// we can traverse from start and add each index if freq == len
        for (int k = 0; k < map.length; k++) {
            if (map[k] == len) {
                res.add(k);
            }
        }
        return res;
    }
}
