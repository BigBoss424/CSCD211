import java.util.Scanner;

public class POTester
{

   public static void main(String [] args)
   {
      PostOffice postOffice = new PostOffice();
      
      postOffice.readLetters("letters.in");
      postOffice.sortLetters();
      postOffice.printLetters();
   }

}