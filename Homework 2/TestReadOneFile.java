import java.io.*;
import java.util.*;

public class TestReadOneFile
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("File name: ");
      
      try
      {
      String filename = input.next();
      System.out.println(filename);
      System.out.println();
      FileUtil.showFile(filename);
      }catch(FileNotFoundException e)
      { System.out.println(e); }
      catch(IOException)
      { System.out.println(e); }
      
   }//end main

}//end TestReadOneFile