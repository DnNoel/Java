package array;

public class StockProfit {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		StockProfit sp = new StockProfit();
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		int[] prices2 = { 1, 2, 3, 4, 5 };
		int[] prices3 = { 7, 6, 4, 3, 1 };
		System.out.println("Maximum Profit: " + sp.maxProfit(prices));
		System.out.println("TestCase 1 - Maximum Profit: " + sp.maxProfit(prices1));
		System.out.println("TestCase 2 - Maximum Profit: " + sp.maxProfit(prices2));
		System.out.println("TestCase 3 - Maximum Profit: " + sp.maxProfit(prices3));
	}
}

/*
 * Explanation:
 * 
 * Initialization: Initialize maxProfit to 0. Iteration: Iterate through the
 * prices array starting from the second element. Profit Calculation: For each
 * day, check if the price of the stock on that day (prices[i]) is greater than
 * the price of the stock on the previous day (prices[i - 1]). Accumulate
 * Profit: If the price on the current day is higher, then add the difference to
 * maxProfit. Return Result: After the loop completes, maxProfit contains the
 * maximum profit that can be achieved.
 * 
 */