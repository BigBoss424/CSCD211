import java.io.*;
/*
Created by: Aaron Jones
Date: 5/20/14
Description: An application that uses several class such as letter,
address and post office to organize them in an array, and print the 
letters from a text file. Along with how much it would postage would
cost.
*/
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