package WordPattern;

import java.util.HashMap;
import java.util.Map;

// [290. Word Pattern] https://leetcode.com/problems/word-pattern/description
class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    // same as Isomorphic String Problem
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            Character currentChar = pattern.charAt(i);
            if (map.containsKey(currentChar)) {
                String val = map.get(currentChar);
                if (!val.equals(arr[i]))
                    return false;
            } else {
                if (map.containsValue(arr[i]))
                    return false;
                map.put(currentChar, arr[i]);
            }
        }
        return true;
    }
}