import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PostOffice{

private Letter[] letterArray;
private int count = 0;

   public PostOffice()
   {
      Letter [] myLetters = letterArray;
      this.count = 0;
   }
   
   public void readLetters(String filename) throws IOException
   {
     /* String toName, toStreet, toCity, toState, toZip;
      String fromName, fromStreet, fromCity, fromState, fromZip, temp;
      double weight;
      int index;
      Scanner s = null;
      try{
         s = new Scanner(new File(filename));
      }catch(FileNotFoundException ex)
      {
        System.out.println("No file");
      }
      if(s != null)
      {
         while(s.hasNextLine())
         {
            toName = s.nextLine();
            toStreet = s.nextLine();
            temp = s.nextLine();
            index = temp.indexOf(",");
            toCity = temp.substring(0,index);
            index = index + 2;
            toState = temp.substring(index, index + 2);
            toZip = temp.substring(index);
            fromName = s.nextLine();
            fromStreet = s.nextLine();
            temp = s.nextLine();
            index = temp.indexOf(",");
            fromCity = temp.substring(0,index);
            index = index + 2;
            fromState = temp.substring(index, index+2);
            fromZip = temp.substring(index);
            String var = s.nextLine();
            weight = Double.parseDouble(var);
            Letter l = new Letter(toName, toStreet, toCity, toState, toZip, fromName, fromStreet, fromCity, fromState, fromZip, weight);            
            this.count += 1;
            this.letterArray[count -1] = l;
         }      
      }
      s.close();*/
      
      Scanner fin = new Scanner(new File(filename));
      
      int lineCount = countLines(filename);
      this.count = lineCount /7;
      
      letterArray = new Letter[count];
      
      for(int i = 0; i < this.count; i++)
      {
         letterArray[i] = new Letter( 
                                  fin.nextLine(), fin.nextLine() + "\n" + fin.nextLine(),
                                  fin.nextLine(), fin.nextLine() + "\n" + fin.nextLine(),
                                  new Double(fin.nextLine().trim()));
      }
      
   }
   
   public void sortLetters()
   {
      for(int index = 1; index < letterArray.length; index++)
      {
         Letter key = letterArray[index];
         int position = index;
         
         while(position > 0 && key.compareTo(letterArray[position -1]) < 1)
         {
            letterArray[position] = letterArray[position - 1];
            position--;
         }
         letterArray[position] = key;
      }
   }
   
   public void printLetters()
   {
      for(Letter ltr : letterArray)
      {
         System.out.println(ltr);
         System.out.println();
      }
   }
   
   private static int countLines(String file) throws IOException
   {
      int count = 0;
      Scanner fin = new Scanner(new File(file));
      
      while(fin.hasNextLine())
      {
         fin.nextLine();
         count++;
      }
      fin.close();
      return count;
   
   }
}