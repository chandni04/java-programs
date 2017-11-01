package matrix;
public class matrix
{
	public static void main(String s[])
	{
		int arr[][] =
		{
				{ 1, 2, 3 },
				{ 0, 76, 5 },
				{ 8, 7, 9 } };

		for (int i = 0; i < 3 ;i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
