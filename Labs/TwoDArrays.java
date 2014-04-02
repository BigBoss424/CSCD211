/*
Created by: Aaron Jones
Date: 1/17/2014
Description: Goes over the basic functions of how to use a two dimensional array by
adding things into the array as well as travesing it, printing it abd converting
it to a double.

*/
import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int row = 0;
		int column = 0;
		int [][] twoD = new int[row][column];
		
		System.out.println("Welcome to the TwoDArray Lab");
		
		
		System.out.println("Please enter the dimensions for the twoDArray:");
		System.out.println("Row: ");
		row = kb.nextInt();
		System.out.println("Column: ");
		column = kb.nextInt();
		
		create2D(row, column, twoD);
		printArray(twoD);
	}
	
	//Init2D seems to be in this method as well. 
	public static int[][] create2D(int row, int column, int [][] pass2DArray)
	{
		Scanner kb = new Scanner(System.in);
		int value;
		System.out.println("Please enter values into the array.");
		{
			for(int i = 0; i < pass2DArray.length; i++)
			{
				System.out.println("These values will be in the rows.");
				System.out.println("Enter the values you wish to put into the array: ");
				value = kb.nextInt();
			}
			System.out.println("These values will be in the columns.");
			System.out.println("Enter the values you wish to put into the array: ");
			value = kb.nextInt();
		}
		int [][] new2DArray = new int[row][column];
		
		new2DArray = pass2DArray;
		
		return new2DArray;
	}
	
	public double[][] double2D(int [][] array)
	{
		double [][] double2D = new double[array.length][array[0].length];
	
      for(int i = 0; i < array.length; i++)
      {
         for(int j = 0; j < array[0].length; j++)
         {
            double2D[i][j] = (double) array[i][j];
         }
      }
		return double2D;
	}

	public static void printArray(int [][] pass2Darray)
	{
		for(int i = 0; i < pass2Darray.length; i++)
		{
			for(int j = 0; j < pass2Darray.length; i++)
			{
				System.out.println(pass2Darray[i][j] + " ");
			}
		}
	}
}
