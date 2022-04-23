package sort;

public class HeapSort
{
	static void sort(int[] arr)
	{
		int[] copiedArr = arr.clone();
		for (int i = copiedArr.length / 2 - 1; i >= 0; i--)
			heapify(copiedArr, copiedArr.length, i);
		for (int i = copiedArr.length - 1; i > 0; i--)
		{
			int temp = copiedArr[0];
			copiedArr[0] = copiedArr[i];
			copiedArr[i] = temp;
			heapify(copiedArr, i, 0);
		}
	}

	static void heapify(int[] A, int n, int i)
	{
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && A[l] > A[largest])
			largest = l;
		if (r < n && A[r] > A[largest])
			largest = r;
		if (largest != i)
		{
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			heapify(A, n, largest);
		}
	}
}