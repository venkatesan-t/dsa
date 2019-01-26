package inClassByRavi;

public class FindingFrequencyOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 3, 2, 5 };
		findPrintFrequencyOfNNumbers(arr);
	}
	
	public static void findPrintFrequencyOfNNumbers(int[] arr)
	{
		int arrLength = arr.length;
		int modOperand = arrLength + 1;
		for(int i=0;i<arrLength;i++)
		{		
			arr[arr[i]%modOperand - 1] = arr[arr[i]%modOperand - 1] + modOperand;
		}
		for(int i=0;i<arrLength;i++)
		{
			if(arr[i] > arrLength)
			{
				System.out.print(i + 1);
				System.out.print('-');
				System.out.println(arr[i]/modOperand);
			}
		}
	}
}
