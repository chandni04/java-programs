package collection.Array;

public class zigzagarray
{
	public static void main(String s[])
	{
		int array1[] =
		{ 1, 2, 3, 4, 5, 25, 89, 100};
		int array2[] =
		{ 9, 8, 7, 6, 0, 12, 54 };
		int length1 = array1.length;
		int length2 = array2.length;
		int length = length1 + length2;
		int array3[] = new int[length];
		int minLength = Math.min(length1, length2);
		int count = 0;
		for (int i = 0; i < minLength; i++)
		{
			array3[count++] = array1[i];
			array3[count++] = array2[i];
		}
		if(length1 > minLength) {
			for(int i = minLength ; i < length1 ; i++) 
			{
				array3[count++] = array1[i];
			}
		}
		else if(length2 > minLength) {
			for(int i = minLength ; i < length2 ; i++) {
				array3[count++] = array2[i];
			}
		}
		
		for (int i = 0; i < array3.length; i++)
		{
			System.out.print(array3[i] + " ");
		}
		System.out.println();
	}
}