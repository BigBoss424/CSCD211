import java.io.*;

public class POTester
{

   public static void main(String [] args) throws IOException
   {
      PostOffice postOffice = new PostOffice();
      
      postOffice.readLetters("letters.in");
      postOffice.sortLetters();
      postOffice.printLetters();
   }

}