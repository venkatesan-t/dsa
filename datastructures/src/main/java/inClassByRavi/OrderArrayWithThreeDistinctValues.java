package inClassByRavi;

public class OrderArrayWithThreeDistinctValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };
		//int[] arr = { 1, 2, 1, 1, 3, 1, 3, 3, 2, 2, 3, 2 };
		sortGetArray(arr, 12);
		int arrLen = arr.length;
		for(int i=0;i<arrLen;i++) {
			System.out.print(arr[i]);
			System.out.print(' ');
		}
	}
	
	public static void sortGetArray(int[] arr, int arrLen)
	{
		int lastOnePosition = -1;
		for(int i=0;i<arrLen;i++)
		{
			if(arr[i] == 1)
			{
				lastOnePosition = i;
				continue;
			}
			for(int j=i;j<arrLen;j++) {
				if(arr[j] == 1 && arr[i] == 2)
				{
					lastOnePosition = i;
					swap(arr, i, j);					
				}
			}
		}
		//System.out.println(lastOnePosition);
		for(int i=arrLen-1;i>=lastOnePosition;i--)
		{
			if(arr[i] == 3)
			{
				continue;
			}
			for(int j=lastOnePosition+1;j<i;j++) {
				if(arr[j] == 3 && arr[i] == 2)
				{
					swap(arr, i, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int pos1, int pos2)
	{
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}
