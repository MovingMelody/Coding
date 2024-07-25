/*
* Created on 25 July 2024
* 
* @author Sai Sumanth
*/
package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

/* 
 * Covert given roman number to actual integer value
 * Roman numerals are usually written largest to smallest from left to right.
 * But in some cases small roman numeral will be kept left of bigger numeral. In that case we have to sub
 * for 9 -> IX so 10 - 1 = 9
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int value = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i < s.length() - 1 && map.get(ch) < map.get(s.charAt(i + 1))) {
                value -= map.get(ch);
            } else {
                value += map.get(ch);
            }
        }
        return value;
    }
}
