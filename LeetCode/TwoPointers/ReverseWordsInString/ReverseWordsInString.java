/*
* Created on 01 Aug 2024
* 
* @author Sai Sumanth
*/

package ReverseWordsInString;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a"));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length() - 1;
        while (l >= 0) {
            StringBuilder eachWord = new StringBuilder();
            while (l >= 0 && s.charAt(l) == ' ')
                l--;

            while (l >= 0 && (s.charAt(l) != ' ')) {
                eachWord.append(s.charAt(l));
                l--;
            }
            eachWord.append(" ");
            while (l >= 0 && s.charAt(l) == ' ')
                l--;
            System.out.println(eachWord.toString());
            sb.append(eachWord.reverse());
        }
        sb.delete(0, 1);
        return sb.toString();

    }
}
