/*
 * Created on 07 Oct 2024
 * 
 * @author Sai Sumanth
 */

import java.util.Stack;

class MinimumStringLenAfterRemovingSubstrings {
    public static void main(String[] args) {
        System.out.println(minLength("ACBBD"));

    }

    public static int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (st.empty()) {
                st.push(x);
                continue;
            }
            char peek = st.peek();
            if ((x == 'B' && peek == 'A') || x == 'D' && peek == 'C') {
                st.pop();
            } else {
                st.push(x);
            }

        }
        return st.size();
    }
}