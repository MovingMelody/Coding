package LeetCode.Stack.LC1910;

import java.util.Stack;

public class RemoveAllOccurrencesOfASubstring {

    public static String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int m = part.length();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            st.push(ch);

            if (st.size() >= m) {
                sb = new StringBuilder();
                int pp = m - 1;
                while (pp >= 0) {
                    if (part.charAt(pp) != st.peek())
                        break;
                    sb.insert(0, st.pop());
                    pp--;
                }
                if (pp != -1) {
                    // put the chars back into stack
                    for (char x : sb.toString().toCharArray()) {
                        st.push(x);
                    }
                }
            }
        }

        sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}
