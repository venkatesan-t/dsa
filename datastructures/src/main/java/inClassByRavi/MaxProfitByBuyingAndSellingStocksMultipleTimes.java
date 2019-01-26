package inClassByRavi;

public class MaxProfitByBuyingAndSellingStocksMultipleTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
		maxProfit(prices);
	}

	
	public static void maxProfit(int[] prices)
	{
		if(prices.length <= 1)
		{
			return;
		}
		int arrLen = prices.length;
		int lastBuyPrice = prices[0];
		int lastBuyDay = -1;
		int lastSellDay = -1;
		for(int i=1;i<arrLen;i++)
		{
			//price increase
			if(prices[i - 1] < prices[i])
			{
				if(lastBuyDay == -1)
				{
					lastBuyDay = i - 1;
				}
			}
			//price decrease
			if(prices[i - 1] > prices[i])
			{
				if(prices[i - 1] > lastBuyPrice)
				{
					lastBuyPrice = prices[i - 1];
					lastSellDay = i - 1;
				}	
				System.out.println("Buy on day : " + lastBuyDay + " Sell on day : " + lastSellDay);
			}
			if(i == arrLen - 1)
			{
				lastSellDay = i;
				System.out.println("Buy on day : " + lastBuyDay + " Sell on day : " + lastSellDay);
			}
		}
	}
}
