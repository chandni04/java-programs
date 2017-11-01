package collection.Array;

public class minmaxarray
{
	public static void main(String s[])
	{

		int array1[] =
		{ 48, 10, 43, 65, 1, 6 };
		int min1 = array1[0];
		int max=array1[0];
		for (int i = 1; i < array1.length; i++)
		{
			if (array1[i] < min1)
			{
				min1 = array1[i];

			}
		}
		System.out.println("minim of array is: " + min1);
		int min2 = array1[0];
		for (int i = 1; i < array1.length; i++)
		{
			if (array1[i] < min2 && array1[i] > min1)
			{
				min2 = array1[i];

			}
		}
		System.out.println("Second minimum of array is: " + min2);
		for (int i = 1; i < array1.length; i++)
		{
			if (array1[i] > max)
			{
				max = array1[i];

			}
		}
		System.out.println("max of array is: " + max);
		int max2 = array1[0];
		for (int i = 1; i < array1.length; i++)
		{
			if (array1[i] > max2 && array1[i] < max)
			{
				max2 = array1[i];

			}
		}
		System.out.println("Second maximum of array is: " + max2);

	}

}
