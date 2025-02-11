package LeetCode.Strings.LC2259;

public class RemoveDigitFromNumberToMaximizeResult {

    public String removeDigit(String num, char digit) {
        int removeIndex = -1, n = num.length();
        boolean doesContainsLargestThanDigit = false;
        // first assume that there are no larger digits than given [digit] so we have to
        // remove the last occurence of digit to maximize the result
        for (int i = n - 1; i >= 0; i--) {
            if (num.charAt(i) > digit) {
                doesContainsLargestThanDigit = true;
            }
            if (removeIndex == -1 && num.charAt(i) == digit) {
                removeIndex = i;
            }
        }

        // remove the first occurence of digit before the larger digit than given digit
        // (left to right)
        if (doesContainsLargestThanDigit) {
            for (int i = 1; i < n; i++) {
                if (num.charAt(i - 1) == digit && num.charAt(i) > digit) {
                    removeIndex = i - 1;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (removeIndex == i)
                continue;
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}
