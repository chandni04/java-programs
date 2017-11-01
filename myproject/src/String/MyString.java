package String;
 class MyString
{
	String str;

	MyString(String str)
	{
		this.str = str;
	}

	public boolean equals(MyString s2)
	{
		int len1 = str.length();
		int len2 = s2.str.length();

		if (len1 != len2)
			return false;
		else
			for (int i = 0; i < str.length(); i++)
			{
				{
					if (str.charAt(i) != s2.str.charAt(i))
						return false;
				}
			}
		return true;

	}	
}
