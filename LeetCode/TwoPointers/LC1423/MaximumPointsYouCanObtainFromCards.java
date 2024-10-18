/*
* Created on 17 Oct 2024
* 
* @author Sai Sumanth
*/
package LC1423;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        // with extra space
        int score = maxScore(new int[] { 9, 7, 7, 9, 7, 7, 9 }, 7);
        System.out.println("score: " + score);

        // without extra space
        score = maxScore2(new int[] { 9, 7, 7, 9, 7, 7, 9 }, 7);
        System.out.println("score: " + score);
    }

    // using prefix sum
    // 1. calculate total sum. And remove a sub-array from cardPoints with len n - k
    //
    // 2. Keep a window of size n - k over the array. The answer is max(answer,
    // total_pts - sumOfCurrentWindow)
    // TC -> O(n)
    // SC -> O(n) 🤡
    public static int maxScore(int[] nums, int k) {
        int max = 0;
        int totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }
        if (k == nums.length)
            return totalSum;
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i] + pre[i - 1];
        }
        int lp = 0, rp = nums.length - k - 1;
        while (rp < nums.length) {
            int currWindowSum = (lp == 0) ? pre[rp] : pre[rp] - pre[lp - 1];
            max = Math.max(max, totalSum - currWindowSum);
            lp++;
            rp++;
        }
        return max;
    }

    // 😎 TC -> O(n) ; SC -> O(1)
    public static int maxScore2(int[] cards, int k) {
        int score = 0;
        int windowSum = 0;
        // when first k cards are picked
        for (int i = 0; i < k; i++)
            windowSum += cards[i];
        score = windowSum;

        // now remove one card from left side and add one card from right side
        int lp = k - 1, rp = cards.length - 1;
        while (lp >= 0) {
            windowSum += cards[rp--] - cards[lp--];
            score = Math.max(score, windowSum);
        }
        return score;
    }
}
