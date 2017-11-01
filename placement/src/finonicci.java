import java.util.Scanner;

public class finonicci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number of series");
		int f = sc.nextInt();
		System.out.println("enter last number of series");
		int l = sc.nextInt();

		int n1 = f;
		int n2 = f + 1;
		int n3 = n1 + n2;
		int count = 2;
		System.out.print(n1 + ", " + n2);
		for (int i = 0; i <= l; i++)
		{
			if (n3 > l)
				break;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			count++;

		}
		System.out.println("    numbers are   " + count);
		 

		/*int n1 = f;
		int n2 = f + 1;
		int n3 = n1 + n2;
		int count = 2;
		System.out.print(n1 + ", " + n2);
		while (n3 <= l)
		{
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			count++;
		}
		System.out.println();
		System.out.println("Total numbers in series are " + count);*/
	}

}