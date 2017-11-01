package collection.Array;

public class DynamicArray
{
	int count=0 ;
	int size;
	int array[];
	public DynamicArray(int size)
	{
		this.size = size;
		array=new int[size];
	}
	public void add(int element)
	{ 
		array[count]=element;
		count++;
		if(count==size/2)
		{ 
			int newArray[]=new int[size*2];
			for(int i=0;i<array.length;i++)
			{
				newArray[i]=array[i];
			}
			array=newArray;
		}
	}
	public int get(int index)
	{
		return array[index];
	}	
	public int length()
	{
		return count;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 