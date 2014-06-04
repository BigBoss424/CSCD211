public class RecursionTree
{
   public static void main(String [] args)
   {
      
      two(6);
   }
   
   public static void two(int n)
   {
      System.out.print(n);
      
      if(n > 2)
      {
         two(n-3);
         two(n-2);
         two(n-2);  
      }
   }


}