import java.util.Scanner;
import java.util.Random;
public class ListTester
{
   public static void main(String [] args)
   {
      Random randomGenerator = new Random();
      LinkedList<Integer> list = new LinkedList<Integer>();
      Scanner kb = new Scanner(System.in);
      int choice = 0;
      
      menu(kb, choice);
      
      do
      {
         if(choice == 1)
         {
            System.out.println("Please enter the size of your Linked List");
            int size = kb.nextInt();
            list.size(size);
            System.out.println("The size of your Linked List is: " + list.getSize());
            
         
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
      System.out.println("8) Delete the contents of the current list");
      System.ou.tprintln("9) Quit");
      System.out.println("Choice -> ");
      choice = kb.nextInt();
       
   }
   
   public void displayList(LinkedList list)
   {
      System.out.println(list);
   }

}