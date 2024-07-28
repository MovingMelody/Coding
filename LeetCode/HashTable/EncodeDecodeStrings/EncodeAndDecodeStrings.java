/*
* Created on 27 July 2024
* 
* @author Sai Sumanth
*/
package EncodeDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));

        String encodedString = encode(strs);
        System.out.println("Encoded String: " + encodedString);
        List<String> decodedList = decode(encodedString);

        System.out.println(strs.equals(decodedList));
    }

    // append len(str) + one special char before every string and encode
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String x : strs) {
            sb.append(x.length()).append("*").append(x);
        }
        return sb.toString();
    }

    // decode the length of each string and push each string into list
    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '*')
                j++;
            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }

        return res;
    }
}
