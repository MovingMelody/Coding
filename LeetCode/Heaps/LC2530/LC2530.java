/*
* Created on 14 Oct 2024
* 
* @author Sai Sumanth
*/
package LeetCode.Heaps.LC2530;

import java.util.Collections;
import java.util.PriorityQueue;

public class LC2530 {
    public static void main(String[] args) {
        int[] nums = { 1, 10, 3, 3, 3 };
        int k = 3;
        System.out.println(maxKelements(nums, k));
    }

    public static long maxKelements(int[] nums, int k) {
        long res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : nums) {
            pq.add(x);
        }
        System.out.println(pq);
        for (int i = 1; i <= k; i++) {
            Integer top = pq.poll();
            if (top != null) {
                res += top;
                int ceil = (int) Math.ceil((double) top / 3);
                pq.add(ceil);
            }
            System.out.println(pq);
        }
        return res;
    }
}
