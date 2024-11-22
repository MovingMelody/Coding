package LeetCode.Strings.LC451;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortCharsByFreq {
    public static void main(String[] args) {
        System.out.println(frequencySort("Aabb"));

    }

    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] freq = new int[123];
        for (char x : s.toCharArray()) {
            freq[x]++;
        }
        for (int x : freq) {
            if (x != 0)
                pq.add(x);
        }
        while (!pq.isEmpty()) {
            // get the top element from pq
            int topFreq = pq.peek();
            for (int i = 0; i < 123; i++) {
                if (freq[i] == topFreq) {
                    // once the topFreq matches with the freq of a char then that
                    // char needs to be added to result topFreq times
                    sb.append(String.valueOf((char) i).repeat(topFreq));
                    freq[i] = 0;
                    pq.poll(); // remove that topFreq from pq
                }
            }
        }

        return sb.toString();
    }

}
