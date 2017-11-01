package rushi.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling
{

	public static void main(String[] args)
	{		

		try
		{
			readFile();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile() throws FileNotFoundException
	{
		FileReader fileReader = new FileReader("notest.text");
		
	}
	
}
