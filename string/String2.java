class String2
{
	public static void main(String s[])
	{
		
		int count=0;
		//abcdefghijklmnoprstuvxyz
		String a1="rushi";
        char a2[]={'a','e','i','o','u'};
		int occurences[] = new int[a2.length];
		for(int i = 0 ; i< a1.length(); i++)
		{
			char c = a1.charAt(i);
			for(int j = 0; j < a2.length ; j++)
			{    	
				if(c==a2[j])
				{
					count++;
					occurences[j] = occurences[j] + 1;
				}
			}
		   
		}
		System.out.println(count);
		for(int i =  0 ; i < occurences.length; i++) {
			if(occurences[i] > 0) {
				System.out.println(a2[i] + "= " + occurences[i]);
			}
		}
	}
}