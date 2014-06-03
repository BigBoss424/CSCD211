import java.util.*;

public class SubStringGenerator
{
   private static String string;
   
   public SubStringGenerator()
   {
      this.string = "";
   }
   
   public String getString(String string)
   {
      return string;
   }
   
   public void setString(String string)
   { this.string = string; }
   
  
   
   //code achieved thanks to the help of Cody Dickinson
   public static void substringParser(String src)
   {
     src = string;
     //base case
     if(src.length() == 1)
     {
         System.out.println(src);
         return;
     }
     
     if(src.length() != 0)
     {
         System.out.println(src);
         substringParser(src.substring(0,src.length()-1));
     }
   }
  
   public static void suffix(String src)
   {
      if(src.length() > 1)
      {
         substringParser(src);
         suffix(src.substring(1));
      }
   }
   
}//end SubStringGenerator