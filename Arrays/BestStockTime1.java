/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 */


class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int minIndex = 0, maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < prices[minIndex])
                minIndex = i;
            if(prices[i] - prices[minIndex] > maxProfit)
                maxProfit = prices[i] - prices[minIndex];
        }
        return maxProfit;
    }
}
