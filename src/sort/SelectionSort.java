package sort;

public class SelectionSort
{
	static void sort(int[] arr)
	{
		int[] copiedArr = arr.clone();
		for (int i = 0; i < copiedArr.length - 1; i++)
		{
			int min_idx = i;
			for (int j = i + 1; j < copiedArr.length; j++)
				if (copiedArr[j] < copiedArr[min_idx])
					min_idx = j;
			int temp = copiedArr[min_idx];
			copiedArr[min_idx] = copiedArr[i];
			copiedArr[i] = temp;
		}

	}
}
