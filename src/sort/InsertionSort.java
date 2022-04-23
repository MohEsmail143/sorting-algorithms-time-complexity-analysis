package sort;

public class InsertionSort
{
	static void sort(int[] arr)
	{
		int[] copiedArr = arr.clone();
		for (int i = 1; i < copiedArr.length; ++i)  //loop the unsorted array starting from second element
		{
			int key = copiedArr[i];
			int j = i - 1;
			while (j >= 0 && copiedArr[j] > key)
			{
				copiedArr[j + 1] = copiedArr[j];
				j = j - 1;
			}
			copiedArr[j + 1] = key;
		}
	}
}
