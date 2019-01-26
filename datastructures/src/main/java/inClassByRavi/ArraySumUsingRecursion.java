package inClassByRavi;

public class ArraySumUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 7, 8, 9, 9, 4, 5, 6};
		int sum = sum(array, 0, 0);
		System.out.println(sum);
		sum = sumUsingTailRecursion(array, 0, 0, 0);
		System.out.println(sum);
	}
	
	public static int sum(int[] arr, int sum, int startPos)
	{		
		if(arr.length == startPos)
		{
			return 0;
		}
		return sum(arr, sum, startPos + 1) + arr[startPos];
	}

	public static int sumUsingTailRecursion(int[] arr, int sum, int startPos, int valueToAdd)
	{		
		if(arr.length == startPos)
		{
			return sum + valueToAdd;
		}
		sum += valueToAdd;
		return sumUsingTailRecursion(arr, sum, startPos + 1, arr[startPos]);
	}
}
