package inClassByRavi;

public class FindingElementThatOccursOnlyOnceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
		int arrLength = arr.length;
		int noWithOneOccurance = findElementThatOccursOnlyOnce(arr, arrLength);
		System.out.println(noWithOneOccurance);
	}
	
	public static int findElementThatOccursOnlyOnce(int[] arr, int arrLength)
	{
		int currXor = 0;		
		for(int i=0;i<arrLength;i++)
		{
			currXor ^= arr[i];
		}
		return currXor;
	}

}
