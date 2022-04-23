package sort;

public class BubbleSort
{
	static void sort(int[] list)
	{
		int[] copiedArr = list.clone();
		boolean flag = true;
		int i, j, temp;
		for (i = 0; i < copiedArr.length - 1; i++)
		{
			for (j = 0; j < copiedArr.length - 1 - i; j++)
			{
				if (copiedArr[j] > copiedArr[j + 1])
				{
					temp = copiedArr[j];
					copiedArr[j] = copiedArr[j + 1];
					copiedArr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}
	}
}