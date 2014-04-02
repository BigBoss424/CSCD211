import java.util.*;
import java.io.*;

public class TwoDArrayPuzzle {

	public static void main(String[] args) {
		
		String [][] array = new String[5][5];
		char [][] arra = new char[5][5];
		char [] arr = new char[5];
      String [] a = new String[9999];
		fillArray(a);
	}
	
	public static String[] fillArray(String array[])
	{
		try
		{
			Scanner sc = new Scanner(new File("words5letterOnlyAs.txt"));
			List<String> lines = new ArrayList<String>();
			while(sc.hasNextLine());
			{
				lines.add(sc.nextLine());
			}
			
			String[] arr = lines.toArray(new String[0]);
         arr = array;
			//ArrayList<String> words = new ArrayList<String>();
		}catch(FileNotFoundException e)
		{
			System.err.println("Error file not found");
		}
		
		
		
		return array;
	}
	
	public static String[][] createArray(String array[][])
	{
		return array;
	}
	
	public static void printArray(String array[][])
	{
		for(int i = 0; i > array.length; i++)
		{
			for(int j = 0; j > array.length; j++)
			{
				System.out.println(array[i][j]);
			}
		}
	}

}