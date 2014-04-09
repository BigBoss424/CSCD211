import java.io.*;
import java.util.*;

public class PgmDesign extends Exception
{
	private static Scanner fin = null;
	private static PrintStream fout = null;
	
	private static boolean connectInput(String filename)
	{
	   try
      {
         filename = "IOin1.txt";
         File file = new File(filename);
         fin = new Scanner(file);
         return true;
      
      }catch(FileNotFoundException e)
      {
         System.out.println("File not found");
         return false;
      }
		//return false;
	}
	
	private static void disconnectInput()
	{
      String filename = "IOin1.txt";
      connectInput(filename);
      
      fin.close();
	
	}
	
	private static void connectOutput(String filename)
	{
      
		try
      {
         filename = "Output.txt";
         File file = new File(filename);
         fin = new Scanner(file);
      
      }catch(FileNotFoundException e)
      {
         System.out.println("File not found");
         System.exit(0);
      }
	}
	
	private static void disconnectOutput()
	{
      String filename = "Output.txt";
	   connectOutput(filename);
      fin.close();
	}
	
	private static String nextItem()
	{
      String item = null;
      
      if(fin.hasNext())
      {
         item = fin.nextLine();
      
      }else
     return null;  
		
	  return item;
	}
   
   private static void writeLine(String item)
   {
      while(fin.hasNextLine())
      {
          fout.println(item);
      }
      System.out.println(item);
   }
	
	private static int readData(String[] data)
	{
		String s = nextItem();
		int count = 0;
		while(s != null)
		{
			data[count] = s;
			count++;
			s = nextItem();
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		String[] input = {"IOin1.txt", "IOin2.txt"};
		String[] data = new String[256];
		String output = "IOout.txt";
		int j;
		
		connectOutput(output);
		
		for(j = 0; j < input.length;j++)
		{
			if(connectInput(input[j]))
			{
				int size = readData(data);
				int k;
				
				System.out.println("Connection succeeded to " + input[j]);
				for(k = 0; k < size; k++)
				{
					writeLine(data[k]);
				}
				disconnectInput();
			}else
			{
				System.out.println("Connection failed to " + input[j]);
			}
		}
		disconnectOutput();
		System.out.println("Attempting to open WriteProtect.txt for output - should produce an error message.");
		connectOutput("WriteProtect.txt");
	
	}
	


}