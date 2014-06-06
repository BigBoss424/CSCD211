public class Quiz2
{
	static int count = 0;

	public static void main(String [] args)
	{
		two(6);
		System.out.println("\nRecursive call count is: " + count);
	}

	public static void two(int n)
	{	
		count++;
		if(n > 3)
		{
			two(n-2);
			two(n-1);
			two(n-1);
		}
		System.out.print(n + " ");
	}
}
