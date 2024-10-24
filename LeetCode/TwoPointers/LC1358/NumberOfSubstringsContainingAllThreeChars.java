/*
* Created on 24 Oct 2024
* 
* @author Sai Sumanth
*/
package LC1358;

import java.util.Arrays;

public class NumberOfSubstringsContainingAllThreeChars {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("aaabc"));
    }

    public static int numberOfSubstrings(String s) {
        int count = 0;
        int[] lastIndices = new int[3];
        Arrays.fill(lastIndices, -1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastIndices[ch - 'a'] = i;
            if (lastIndices[0] != -1 && lastIndices[1] != -1 && lastIndices[2] != -1) {
                count += 1 + Math.min(lastIndices[0], Math.min(lastIndices[1], lastIndices[2]));
            }
        }
        return count;
    }
}
