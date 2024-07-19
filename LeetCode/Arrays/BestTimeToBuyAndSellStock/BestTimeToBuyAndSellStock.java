/*
* Created on 13 July 2024
* 
* @author Sai Sumanth
*/

package BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int profit = maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        System.out.println("Max Profit is: " + profit);

    }

    public static int maxProfit(int[] prices) {
        int minTillNow = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minTillNow);
            
            // keep track of min price before current element
            if (prices[i] < minTillNow) {
                minTillNow = prices[i];
            }
        }
        return maxProfit;
    }
}
