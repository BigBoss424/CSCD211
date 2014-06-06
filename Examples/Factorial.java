public class Factorial
{

        long result = recFact(8);
	
	public static void main(String[] args)
	{
		long result;
		recFact(8);
		fact(8);
	}
        // Iterative version
        public static long fact(int n)
        {
                long result = 1;

                while(n > 0)
                {
                        result = result * n;
                        n = n - 1;
                }//end while

                return result;
        }

        //Recursive version goes here...
        public static long recFact(int n)
        {
                if(n == 0)
                {
                        return 1;
                }

                return recFact(n*n);
        }


}//end Factorial

