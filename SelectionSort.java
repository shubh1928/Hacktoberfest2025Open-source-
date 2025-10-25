import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4, 5, 1, 2, 3};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int last = arr.length - i - 1; //selected part of the array index.
			int maxIndex = getMaxIndex(arr, 0, last); //find the largest index of a element in the current array.
			swap(arr, maxIndex, last); //swap the last index with the largest one.
		}
	}

	private static void swap(int[] arr, int first, int second) 
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static int getMaxIndex(int[] arr, int start, int last) 
	{
		int max = start;
		
		for(int i = start; i <= last; i++)
		{
			if(arr[max] < arr[i])
			{
				max = i;
			}
		}
		
		return max;
	}

}
