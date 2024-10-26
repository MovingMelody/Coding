/*
* Created on 25 Oct 2024
* 
* @author Sai Sumanth
*/
package LC424;

import java.util.Arrays;

public class LongestRepeatingCharReplacement {

    // better solution
    // TC -> O(n) + 26 * n
    // space 26 size arr only. so can be considered as constant.
    // cuz it won't grow as input size grows
    public static int characterReplacement(String s, int k) {
        int longest = 0;
        int[] freq = new int[26];
        int windowLastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'A']++;
            System.out.println(Arrays.toString(freq));
            while (getReplacements(freq, i - windowLastIndex + 1) > k) {
                char lastChar = s.charAt(windowLastIndex++);
                freq[lastChar - 'A']--;
            }

            longest = Math.max(longest, i - windowLastIndex + 1);
        }
        return longest;
    }

    public static int getReplacements(int[] freq, int substringLen) {
        int maxFreqInSubstring = 0;
        for (int x : freq) {
            maxFreqInSubstring = Math.max(maxFreqInSubstring, x);
        }
        return substringLen - maxFreqInSubstring;
    }

    // 😎 no need to traverse the freq arr multiple times to get replacement count
    public static int characterReplacementMoreOptimal(String s, int k) {
        int longest = 0;
        int[] freq = new int[26];
        int windowLastIndex = 0, maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int currWindowLen = i - windowLastIndex + 1;
            int replacements = currWindowLen - maxFreq;
            if (replacements > k) {
                char lastChar = s.charAt(windowLastIndex++);
                freq[lastChar - 'A']--;
            }

            if (replacements <= k)
                longest = Math.max(longest, i - windowLastIndex + 1);
        }
        return longest;
    }
}
