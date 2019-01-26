package inClassByRavi;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class MaxProfitByBuyingAndSellingAStockOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		//int[] arr = { 7, 6, 4, 3, 1 };
		//int[] arr = new int[0];
		//int maxProfit = maxProfit(arr);
		int maxProfit = maxProfitUsingRavisMethod(arr);
		System.out.println(maxProfit);
	}

	public static int maxProfitUsingRavisMethod(int[] prices)
	{
		int arrLength = prices.length;
		if(arrLength <= 1)
		{
			return 0;
		}
		//create new array array2
		int[] array2 = new int[arrLength];
		for(int i=0;i<arrLength;i++)
		{
			array2[i] = prices[i];
		}
		//iterate from length - 1 to beginning
		for(int i=arrLength-2;i>=0;i--)
		{		
			//at position i, compare i and i + 1, store the maximum in i
			if(array2[i + 1] > array2[i])
			{
				array2[i] = array2[i+1];
			}
			else
			{
				array2[i] = array2[i];
			}
		}
		int maxProfit = array2[0] - prices[0];
		//iterate over two arrays, find the maximum difference
		for(int i=0;i<arrLength;i++)
		{
			System.out.println(array2[i]);
			if(array2[i] - prices[i] > maxProfit)
			{
				maxProfit = array2[i] - prices[i]; 
			}
		}
		return maxProfit;
	}
	
	public static int maxProfit(int[] prices)
	{
		int arrLength = prices.length;
		if(arrLength <=1)
		{
			return 0;
		}
		int[] diff = new int[arrLength-1];
		for(int i=1;i<arrLength;i++)
		{
			diff[i-1] = prices[i] - prices[i - 1];
			//System.out.println(diff[i-1]);
		}
		return maxSubArray(diff);
	}
	
	public static int maxSubArray(int[] nums)
	{
		int arrLength = nums.length;
		if(arrLength < 1)
		{
			return 0;
		}
		int max = 0;
		int prevMax = 0; 
		for(int i=0;i<arrLength;i++)
		{
			//System.out.println(prevMax + nums[i]);
			if(prevMax + nums[i] > max)
			{
				max = prevMax + nums[i];				
			}
			if(prevMax + nums[i] > 0)
			{
				prevMax = prevMax + nums[i];							
			}
			else
			{
				prevMax = 0;
			}
			System.out.println(max);
			System.out.println(prevMax);
		}
		return max;
	}
}
