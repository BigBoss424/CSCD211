
   public class Recursion3nPlus1
   {
   
   	/* Consider the following algorithm to generate a sequence of numbers. Start
   	 * with an integer *n*. If *n* is even, divide by 2. If *n* is odd, multiply by
   	 * 3 and add 1. Repeat this process with the new value of *n*, terminating
   	 * when *n* = 1. 
   	 * For example rec3nPlus1(22) prints: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
   	 */
      public static void rec3nPlus1(int n)
      {
      //  Your code goes here...
         System.out.print(n + " ");
         if(n == 1)
         {
            return;
         }
         else if(n%2 == 0)
         {
               
           rec3nPlus1(n/2);
         }
         else if(n%2 != 0)
         {
           rec3nPlus1((n * 3) + 1);
         }
         
      
      }
   }
