import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PostOffice{

private final int MAX = 1000;
private Letter[] letterArray = new Letter[MAX];
private int count;

   public PostOffice()
   {
      Letter [] myLetters = letterArray;
      this.count = 0;
   }
   
   public void readLetters(String filename)
   {
      String toName, toStreet, toCity, toState, toZip;
      String fromName, fromStreet, fromCity, fromState, fromZip, temp;
      double weight;
      int index;
      Scanner s = new Scanner(filename);
      if(s != null)
      {
         while(s.hasNext())
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
      s.close();
   }
   
   public void sortLetters()
   {
      SortSearchUtil.selectionSort(letterArray);
   }
   
   public void printLetters()
   {
      for(Letter ltr : letterArray)
      {
         System.out.println(ltr);
         System.out.println();
      }
   }
}