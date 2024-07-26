/*
* Created on 25 July 2024
* 
* @author Sai Sumanth
*/

package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> res = groupAnagrams(strs);

        for (List<String> x : res) {
            System.out.println(x.toString());
        }
    }

    /*
     * Time Complexity will be m * nlogn
     * m -> length of strs
     * nlogn -> for sorting each word
     */
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String x : strs) {
            char[] arr = x.toCharArray();
            Arrays.sort(arr);

            List<String> prevListIfAny = map.getOrDefault(new String(arr), new ArrayList<>());
            prevListIfAny.add(x);
            map.put(new String(arr), prevListIfAny);
        }

        return new ArrayList<>(map.values());
    }

    /// Time Complexity -> O(M * N * 26) where M is avg length of each string. N is
    /// given strings length. and we can ignore constant 26 so O(M * N)
    /// we ignored 26 because it will grow even if input size grows
    public List<List<String>> groupAnagramsMoreOptimal(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String x : strs) {
            int[] arr = new int[26];
            for (char ch : x.toCharArray()) {
                arr[ch - 'a']++;
            }
            String key = getKey(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(x);
        }
        return new ArrayList<>(map.values());
    }

    public static String getKey(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sb.append((char) (i + 'a')).append(arr[i]);
            }
        }
        // for 'cat' key will be 'a1c1t1'
        // for 'act' also key will be same 'a1c1t1'
        return sb.toString();
    }

}
