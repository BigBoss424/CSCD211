/*
Created by: Aaron Jones
Date: 1/16/2014
Description: In this class is the driver class in which main is found. 
Along with a few other methods required by the assignment. I was able 
to get it compiled but I had plenty of exceptions that were thrown. Not 
able to understand why it can't read the file. 

*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InvoiceTester {

	public static void main(String [] args)
	{
		ArrayList<Item> lst = new ArrayList();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("My Company Name");
		
		readItems(lst);
		createInvoice(lst);
		printInvoice(lst);
		
	}
	
	
	public static ArrayList<Item> readItems(ArrayList<Item> newList)
	{
		File file = new File("Items.txt");
		Item item;
		
		try{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine())
			{
				item = new Item(sc.nextInt(), sc.nextLine(), sc.nextDouble(), sc.nextInt(), 
						sc.nextDouble());
				newList.add(item);
			}
			sc.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return newList;
	}
	/*
	 * Accept the ArrayList of available Items
	 * Create an Invoice object
	 * Read the Order.txt file and add a new LineItem
	 * object to the ArrayList for each item found in the file(if an item
	 * SKU is not in inventory or if the QOH is 0, do not add a LineItem)
	 * Return an object of tupe Invoice
	 */
    
    
	public static Invoice createInvoice(ArrayList<Item> lst)	{
		
		Invoice invoice = null;
		LineItem ln; 
		Item item;
		File file = new File("order.txt");	
		try{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine())
			{
				ArrayList<LineItem> lineitm = new ArrayList<LineItem>();
				invoice = new Invoice(sc.nextInt(), sc.nextInt(), lineitm);
				for(Item s : lst)
				{
				ln = new LineItem(s, sc.nextInt());
				invoice.AddItem(s, sc.nextInt());
				lineitm.add(ln);
				ln.setNewItem(s);
				lst.add(ln.getNewItem());
				}	
			}
			sc.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return invoice;
	}
	
	/*
	 * Access a Invoice object
	 * Print the order header and line item
	 * information for that invoice.
	 * Uses item.txt
	 */
	public static void printInvoice(ArrayList<Item> lst)
	{
		Invoice invoice = createInvoice(lst);
		invoice.toString();
	}
}
