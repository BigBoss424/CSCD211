import java.util.Scanner;
import java.util.Random;
public class ListTester
{
   public static void main(String [] args)
   {
      
      Scanner kb = new Scanner(System.in);
      int choice = 0;
      
      menu(kb, choice);
      
      do
      {
         if(choice == 1)
         {
            LinkedList list = null;
            System.out.println("Your list has been created");
         
         }
      
      
      }while(choice != 7);
   }
   
   public static void menu(Scanner kb, int choice)
   {
      System.out.println("1) Create a New List");
      System.out.println("2) Sort the List");
      System.out.println("3) Print the List");
      System.out.println("4) Print the LIst in Reverse Order");
      System.out.println("5) Generate a sublist with all evens");
      System.out.println("6) Print every nth node in the List");
      System.out.println("7) Delete node(s)");
      System.out.println("Choice -> ");
      choice = kb.nextInt();
       
   }
   
   public void displayList(LinkedList list)
   {
      
      System.out.println(list);
   }

}