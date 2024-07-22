/*
* Created on 21 July 2024
* 
* @author Sai Sumanth
*/

package IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        boolean res = isIsomorphic(s, t);
        System.out.println("Is Isomprphic: " + res);
    }

    public static boolean isIsomorphic(String s, String t) {
        int sl = s.length();

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < sl; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            // if the mapping is already added then check for mapped value,
            // it should be equal to 'tc' otherwise not isomorphic
            if (map.containsKey(sc)) {
                char mappedChar = map.get(sc);
                if (mappedChar != tc)
                    return false;
            } else {
                // below check if for 'badc' 'baba' this test case
                if (map.containsValue(tc))
                    return false;
                map.put(sc, tc);
            }
        }
        return true;
    }
}
