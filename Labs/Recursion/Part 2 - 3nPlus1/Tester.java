//  Do not change this class!
public class Tester
{
   public static void main ( String[] args )
   {
		
		/* Consider the following algorithm to generate a sequence of numbers. Start
		 * with an integer *n*. If *n* is even, divide by 2. If *n* is odd, multiply by
		 * 3 and add 1. Repeat this process with the new value of *n*, terminating
		 * when *n* = 1. 
		 * For example rec3nPlus1(22) prints: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
		 */
		System.out.println("3n+1 values for an input of 22:");
		Recursion3nPlus1.rec3nPlus1(22);

		System.out.println("\n\n3n+1 values for an input of 42:");
		Recursion3nPlus1.rec3nPlus1(42);
      		
   }// end main
		
}// end class
