package collection;
public class MyArraylist
{
	int size=10;
	Object Array[]=new Object[10];
	int count = 0;

	public void add(Object element)
	{
		Array[count] = element;
		count++;
		if (count == size / 2)
		{
			Object NewArray[] = new Object[size * 2];
			for (int i = 0; i < count; i++)
			{
				NewArray[i] =  Array[i];
			}
			Array=NewArray;
		}
	}

	public Object getelement(int index)
	{
		return Array[index];
	}

	public int size()
	{
		return count;
	}

	public boolean contains(Object element)
	{
		for (int i = 0; i < size(); i++)
		{
			if (Array[i] == element)
				return true;
		}
		return false;

	}
	public String toString()
	{
		String result = "[";
		for(int i = 0 ; i < size() ; i++) {
			result = result + " "+ Array[i];
		}
		result = result + " ]";
		return result;
	}
}
