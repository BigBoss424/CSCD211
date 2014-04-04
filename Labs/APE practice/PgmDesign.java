import java.io.*;
import java.util.*;

public class PgmDesign
{
	private static Scanner fin = null;
	private static PrintStream fout = null;
	
	private static boolean connectInput(String filename)
	{
	
		return false;
	}
	
	private static void disconnectInput()
	{
	
	}
	
	private static void connectOutput(String filename)
	{
		
	}
	
	private static void disconnectOutput()
	{
	
	}
	
	private static String nextItem()
	{
		
	
	}
	
	private static int readData(String[] data)
	{
		String s = nextItem();
		int count = 0;
		while(s != null)
		{
			data[count] = s;
			count++;
			s = nextItem(0;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		String[] input = ("IOin1.txt", "IOin2.txt");
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
		System.out.println("Attempting to open WriteProtect.txt for output - should 
		produce an error message.");
		connectOutput("WriteProtect.txt");
	
	}
	


}