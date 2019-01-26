package venkatPractice;

public class LongestSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 3, 7, 2, 1 };
		int maxSeq = findGetLongestSubSequence(arr);
		System.out.println(maxSeq);
	}

	public static int findGetLongestSubSequence(int[] arr)
	{
		int arrLen = arr.length;
		int currMaxSeq = 1;
		int maxSeq = 1;
		for(int i=1;i<arrLen;i++)
		{
			if(arr[i] - arr[i-1] == 1 || arr[i] - arr[i-1] == -1)
			{
				currMaxSeq++;
			}
			else
			{
				currMaxSeq = 1;
			}
			if(currMaxSeq > maxSeq)
			{
				maxSeq = currMaxSeq;
			}
		}
		return maxSeq;
	}
}
