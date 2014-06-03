/*
Created by: Aaron Jones
Date: May 5 2014
Description: This is the tester file for the SubStringGenerator. Everything is called from main. 
The only thing that would be aware of is that my substring generator method "suffix" does both 
the generating of the substrings and the display. 
*/
import java.util.Scanner;

public class SubStringTester
{
    
    
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      int choice;
      String s = "";
      //SubStringGenerator substring = new SubStringGenerator();
      
      
      
      do
      {
      
         System.out.println("Welcome to the SubString Parser");
        
         System.out.println("Please choose from the following options:");
         System.out.println("1) Enter a String");
         System.out.println("2) Generate the substrings ");
         System.out.println("3) Display the substrings");
         System.out.println("4) Quit ");
         System.out.print("Choice ------> ");
         choice = kb.nextInt();
      
        
         
         switch(choice)
         {
            case 1:
               System.out.println("Enter a String to find it's substrings");
               if(kb.hasNext())
               {
               s = kb.next();
               }
               break;
                      
            case 2:
               SubStringGenerator.suffix(s);
               break;
                      
            case 3: 
               SubStringGenerator.suffix(s);
               break;
                      
            case 4: System.out.println("Exiting Program");
               System.exit(0);
               break;
                      
            default: System.out.println("Invalid Choice");
               break;
            
            
         }//end switch-case
      }while(choice != 4);
   }//end main
   
 
}//end SubStringTester

