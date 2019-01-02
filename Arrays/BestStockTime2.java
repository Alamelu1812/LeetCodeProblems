
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
 * (i.e., buy one and sell one share of the stock multiple times).
 * 
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock 
 * before you buy again).
 * 
 */

public class BestStockTime2 {
	public int maxProfit(int[] prices) {
		
        int maxProfit = 0;
        
        //Profit is made whenever the next day price is greater than today
        for(int i=1;i<prices.length;i++)
            if(prices[i] >prices[i-1])
                maxProfit += prices[i] - prices[i-1];
        
        return maxProfit;
    }
	
	public static void main(String[] args) {
		BestStockTime2 object = new BestStockTime2();
		
		//TestCase
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = object.maxProfit(prices);
		System.out.println("Max profit is "+maxProfit);
	}

}
