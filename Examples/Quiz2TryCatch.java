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

   
   }

}