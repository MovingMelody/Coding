/*
* Created on 20 Oct 2024
* 
* @author Sai Sumanth
*/
package LC904;

import java.util.*;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int totalFruits = totalFruit(new int[] { 6, 2, 1, 1, 3, 6, 6 });
        System.out.println("Max fruits: " + totalFruits);
    }

    public static int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int windowLeftPointer = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            int fruit = fruits[i];
            hash.put(fruit, hash.getOrDefault(fruit, 0) + 1);

            if (hash.size() > 2) {
                int leftMostVal = fruits[windowLeftPointer];
                hash.replace(leftMostVal, hash.get(leftMostVal) - 1);
                if (hash.get(leftMostVal) == 0) {
                    hash.remove(leftMostVal);
                }
            }
            maxFruits = Math.max(maxFruits, i - windowLeftPointer + 1);
        }
        return maxFruits;
    }

}
