public class Quiz2TryCatch
{
   public static void main(String [] args)
   {
      try
      {
         int a = args.length;
         System.out.println("arguments passed in: " + a);
         int b = 42 / a;
         
         try
         {
            int n = anotherMethod();
            System.out.println(n);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
            System.out.println("AIOOBE in main.");
         }
      }catch(ArithmeticException e)
      {
         System.out.println("Arithmetic Error " + e.toString());
      }
      catch(Exception e)
      {
         System.out.println("Some Other Error " + e.toString());
      }
   }//end main
   
   private static int anotherMethod()
   {
      int[] c = {1};
      try
      {
         c[2] = 99;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("AIOOBE in anotherMethod.");
      }
      return c[1];
   }//end anotherMethod

}//end class