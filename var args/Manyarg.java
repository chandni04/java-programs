class Manyarg
{
	public static void main(String s[])
	{
		int length = s.length;
		int numbers[] = new int[length];
		for(int i = 0 ; i < s.length ; i++) {
			numbers[i] = Integer.parseInt(s[i]);
		}
		add(10, 20);
		add(10, 20, 30);
	}
	static void add(int... a)
		{
			int sum=0;	
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
         System.out.println(sum);	
		}
}