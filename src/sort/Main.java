package sort;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		int[] sizes = {10000, 50000, 100000, 250000, 500000};
		long startTime, endTime, durationMilli;
		for (int i = 0; i < 5; i++)
		{
			int[] randomArray = genRandomArray(sizes[i]);
			System.out.println("At array size= " + sizes[i] + ", the time taken to sort by:");
			startTime = System.currentTimeMillis();
			SelectionSort.sort(randomArray);
			endTime = System.currentTimeMillis();
			durationMilli = (endTime - startTime);
			System.out.println("- Selection sort= " + durationMilli + " ms");

			startTime = System.currentTimeMillis();
			BubbleSort.sort(randomArray);
			endTime = System.currentTimeMillis();
			durationMilli = (endTime - startTime);
			System.out.println("- Bubble sort= " + durationMilli + " ms");

			startTime = System.currentTimeMillis();
			InsertionSort.sort(randomArray);
			endTime = System.currentTimeMillis();
			durationMilli = (endTime - startTime);
			System.out.println("- Insertion sort= " + durationMilli + " ms");

			int[] randomArray_merge = randomArray.clone();
			startTime = System.currentTimeMillis();
			MergeSort.sort(randomArray_merge, 0, randomArray_merge.length - 1);
			endTime = System.currentTimeMillis();
			durationMilli = (endTime - startTime);
			System.out.println("- Merge sort= " + durationMilli + " ms");

			startTime = System.currentTimeMillis();
			HeapSort.sort(randomArray);
			endTime = System.currentTimeMillis();
			durationMilli = (endTime - startTime);
			System.out.println("- Heap sort= " + durationMilli + " ms");

			int[] randomArray_quick = randomArray.clone();
			startTime = System.currentTimeMillis();
			QuickSort.sort(randomArray_quick, 0, randomArray_quick.length - 1);
			endTime = System.currentTimeMillis();
			durationMilli = (endTime - startTime);
			System.out.println("- Quicksort= " + durationMilli + " ms");

			System.out.println();
		}
	}

	static void printArray(int[] arr)
	{
		for (int x : arr)
			System.out.println(x);
		System.out.println();
	}

	static int[] genRandomArray(int size)
	{
		Random rd = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++)
			arr[i] = rd.nextInt();
		return arr;
	}
}
