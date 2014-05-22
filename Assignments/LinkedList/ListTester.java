/*
Created by: Aaron Jones
Date: 5/22/2014
Description: This is the ListTester class in which a menu is invoked from the 
displayMenu() method to display the 9 choices to manipulate the LinkedList. The
LinkedList class has all the methods in it to run the given options in the menu.
From generating a new Linked List to deleting certain values.
*/
import java.util.Scanner;

public class ListTester
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      LinkedList list = new LinkedList();
      int choice;
     
      do
      {
         displayMenu();
         
         while(true)
         {
            try
            {
               System.out.print("Choice: ");
               choice = kb.nextInt();
               
               if(choice < 1 || choice > 9)
                  throw new IllegalArgumentException();
               break;
            }
            catch(Exception e)
            {
               System.out.println("Invalid choice.\n");
               
            }
            finally
            {
               kb.nextLine();
            }
         
         }
      
      switch(choice)
      {
         case 1:
            try
            {
               System.out.println("How big shall this list be?");
               list.generateList(kb.nextInt());
            }
            catch(Exception e)
            {
               System.out.println("Impossible");
            }
            finally
            {
               kb.nextLine();
            }
            break;
         case 2:
            System.out.println("Sorted.");
            break;
         case 3:
            printLine();
            list.print();
            printLine();
            break;
         case 4:
            printLine();
            list.printReversed();
            printLine();
            break;
         case 5:
            printLine();
            list.getEvens().print();
            printLine();
            break;
         case 6:
            try
            {
               System.out.print("Printing the Nth nodes, where N = ");
               int n = kb.nextInt();
               
               printLine();
               list.printNth(n);
               printLine();
            }
            catch(Exception e)
            {
               System.out.println("Error!");
            }
            finally
            {
               kb.nextLine();
            }
            break;
         case 7:
            try
            {
               System.out.print("Which node value shall we look for?");
               System.out.println("Deleted" + list.deleteValue(kb.nextInt()) + "nodes. ");
            }
            catch(Exception e)
            {
               System.out.println("Error!");
            }
            finally
            {
               kb.nextLine();
            }
            break;
          case 8:
            list.clear();
            System.out.println("List cleared.");
            break;
          
      }
        System.out.println();
      }while(choice > 0 && choice < 9);
   }
   
   public static void displayMenu()
   {
      System.out.println("1) Create a New List");
      System.out.println("2) Sort the List");
      System.out.println("3) Print the List");
      System.out.println("4) Print the List in Reverse Order");
      System.out.println("5) Generate a sublist with all evens");
      System.out.println("6) Print every nth node in the List");
      System.out.println("7) Delete node(s)");
      System.out.println("8) Delete the contents of the current list");
      System.out.println("9) Quit");
       
   }
   
   private static void printLine()
   {
      System.out.println("- - - - -");
   }

}