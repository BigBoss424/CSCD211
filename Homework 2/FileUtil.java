import java.io.*;
import java.util.*;

public class FileUtil
{
   public static void showFile(String filename) throws IOException, FileNotFoundException
   {
      int c;
      
      //create a file object
      
      File input = new File(filename);
      
      //Connect to a stream
      
      FileInputStream in = new FileInputStream(input);
      
      while((c = in.read()) != -1)
         System.out.print((char)c); //cast the int to a char, the int is the ASCII code
      System.out.println();
      in.close(); //close the stream
   
   }//end showFile

   

}//end FileUtil