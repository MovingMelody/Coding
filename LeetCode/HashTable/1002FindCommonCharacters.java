import java.util.ArrayList;
import java.util.List;

class FindCommonCharacters {
    public static void main(String[] args) {
        String[] names = new String[]{"bella", "label", "roller"};
        Solution s = new Solution();
        List<String> res = s.commonChars(names);
        for (String i : res) {
            System.out.println(i);
        }

    }
}
class Solution{
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<String>();
        int[] lastFreq = getFreq(words[0]);
        for (int i = 1; i < words.length; i++) {
            lastFreq = intersection(lastFreq, getFreq(words[i]));
        }
        for (int j = 0; j < 26; j++) {
            if (lastFreq[j] != 0) {
                char a = (char) (j + 'a');
                String s = Character.toString(a);
                while (lastFreq[j] > 0) {
                    res.add(s);
                    lastFreq[j]--;
                }
            }
        }
        return res;
    }


    public static int[] getFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static int[] intersection(int[] prev, int[] current) {
        for (int i = 0; i < 26; i++) {
            current[i] = Math.min(prev[i], current[i]);
        }
        return current;
    }
}