package inClassByRavi;
//https://leetcode.com/problems/trapping-rain-water/description/ 
/*
 * similar to Ravi's method for max profit with single transaction
 * create one array to store maximum from iterating from end to beginning
 * create one array to store maximum from iterating from beginning to end
 * find the minimum of 
 */

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int units = getMaxUnitOfRainWaterTrapped(height);
		System.out.println(units);
	}
	
	public static int getMaxUnitOfRainWaterTrapped(int[] height)
	{
		if(height.length == 0)
		{
			return 0;
		}
		int arrLen = height.length; 
		int units = 0;		
		int[] maxsFromRight =  new int[arrLen];
		int[] maxsFromLeft =  new int[arrLen];
        maxsFromRight[arrLen-1] = height[arrLen-1];
        maxsFromLeft[0] = height[0];
		for(int i=arrLen-2;i>=0;i--)
		{
            maxsFromRight[i] = height[i];
			maxsFromRight[i] = max(maxsFromRight[i], maxsFromRight[i+1]);
		}
		//printArray(maxsFromRight);
		for(int i=1;i<arrLen;i++)
		{
            maxsFromLeft[i] = height[i];
			maxsFromLeft[i] = max(maxsFromLeft[i], maxsFromLeft[i-1]);
		}
		//printArray(maxsFromLeft);
		int[] minsFromRightAndLeft = new int[arrLen];
		for(int i=0;i<arrLen;i++)
		{
			minsFromRightAndLeft[i] = min(maxsFromLeft[i], maxsFromRight[i]);
			units += minsFromRightAndLeft[i] - height[i];
		}
		//printArray(minsFromRightAndLeft);
		return units;
	}
	
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}
	
	public static int min(int a, int b)
	{
		return a<b?a:b;
	}
	
	public static void printArray(int[] arr)
	{
		int arrLen = arr.length;
		for(int i=0;i<arrLen;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
