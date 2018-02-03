package guessinggame;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class convert_to_stringsarray 
{
	static Scanner x;
	public void openfile() 
	{
		try 
		{
			x = new Scanner(new File("movies.txt"));
		}
		catch (Exception e)
		{
			System.out.println("file not found");
		}
	}
	public static ArrayList<String> transform()
	{
		ArrayList<String> list = new ArrayList<String>();
		while(x.hasNextLine())
		{
			list.add(x.nextLine());
		}
		
		return list;

	}
	
}


