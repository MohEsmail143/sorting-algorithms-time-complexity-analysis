package sort;

public class QuickSort
{
	static void sort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = (low - 1);
		int j = low;
		while (j <= high - 1)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
			j++;
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
}
